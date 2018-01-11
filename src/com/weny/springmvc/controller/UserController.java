package com.weny.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.weny.springmvc.model.User;

public class UserController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<User> userList = new ArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("one");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("two");
		userList.add(user1);
		userList.add(user2);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", userList);
		
		modelAndView.setViewName("/WEB-INF/jsp/user/user.jsp");
		
		return modelAndView;
	}

}
