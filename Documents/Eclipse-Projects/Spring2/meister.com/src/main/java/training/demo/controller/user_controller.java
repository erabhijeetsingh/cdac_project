package training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.demo.services.user_fresher_service;

@Controller
public class user_controller {
	@Autowired
	user_fresher_service user_Fresher_Service;
	@RequestMapping("/user_personal")
	public ModelAndView user_personal_detail()
	{
		System.out.println("Personal 1");
		return new ModelAndView("addDetails");
		
	}

	@RequestMapping("/user_experinced")
	public ModelAndView user_fresher()
	{
		System.out.println("experincese");
		return null;
		
	}
	
	@RequestMapping("/adduser_personal")
	public ModelAndView add_detail(@RequestParam("f_name")String name ,@RequestParam("mob_no")String mob_no,
			@RequestParam("addr")String addr,@RequestParam("city")String city,@RequestParam("state")String state,@RequestParam("gender")String gender,
			@RequestParam("h_qual")String h_qual,@RequestParam("Course")String Course,
			@RequestParam("Specialization")String Specialization,@RequestParam("university")String university,
			@RequestParam("passing_year")String passing_year,@RequestParam("skills")String skills,
			@RequestParam("pro_title")String pro_title,@RequestParam("desc")String desc,@RequestParam("file")String file)
	{
		int a=user_Fresher_Service.insertDetails(name);
		System.out.println(name);
		return null;
		
	}
}
