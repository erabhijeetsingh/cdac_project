package training.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.demo.dao.user_details_dao;

@Service
public class user_fresher_service {
@Autowired
user_details_dao user_Fresher_Insert;

public int insertDetails(String name) {
	return user_Fresher_Insert.insertDetails(name);	
}


	

}
