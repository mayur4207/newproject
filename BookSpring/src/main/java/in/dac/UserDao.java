package in.dac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean createUser(User user) {
		String sql = "INSERT INTO USER(username,email,password,mobile) VALUES(?,?,?,?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getPassword(), user.getMobile());

		return true;

	}
	
	
	public boolean Authenticateuser(User user) {
		
		String sql="SELECT * FROM USER WHERE USERNAME=? AND PASSWORD=?";
		User dbUser=jdbcTemplate.queryForObject(sql, new Object[] {user.getUsername(),user.getPassword()}, new UserRowMapper());
	
		if(dbUser==null) {
			return false;
		}
		
		return true;
		
	}

}
