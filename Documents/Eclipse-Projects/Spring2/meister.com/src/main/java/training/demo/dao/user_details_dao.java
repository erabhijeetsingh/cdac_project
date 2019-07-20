package training.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class user_details_dao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int insertDetails(String name) 
	{
		String sql="insert into hello(name) values(?)";
		return jdbcTemplate.update(sql,new Object[] {name});
	}

}
