package in.dac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@Autowired
	UserDao userDao;

	@GetMapping("/signup")
	public ModelAndView callSignUpPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		return mv;
	}

	@PostMapping("/signup")
	public ModelAndView registerUser(User user) {

		userDao.createUser(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signin");
		return mv;
	}

	@GetMapping("/signin")
	public ModelAndView callSignInPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signin");
		return mv;
	}

	@PostMapping("/signin")
	public ModelAndView validateUser(User user) {
		ModelAndView mv = new ModelAndView();
		try {
			boolean auth = userDao.Authenticateuser(user);
			if (auth) {
				mv.setViewName("home");
			} else {
				mv.setViewName("signin");
			}

		} catch (Exception e) {
			mv.setViewName("signin");
		}

		return mv;
	}

	
	@GetMapping("/invalidate")
	public ModelAndView logoutUser(HttpServletRequest request,HttpServletRequest response ) {
	
		ModelAndView mv=new ModelAndView();
		HttpSession session=request.getSession();
	session.invalidate();
	mv.setViewName("signin");
	return mv;
	
	}
}
