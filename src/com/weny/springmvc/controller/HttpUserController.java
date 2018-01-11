package com.weny.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.weny.springmvc.model.User;

public class HttpUserController implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<User> userList = new ArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("one");
		
		User user2 = new User();
		user2.setId(2);
		user2.setName("two");
		userList.add(user1);
		userList.add(user2);
		
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("/WEB-INF/jsp/user/user.jsp").forward(request, response);
	}
}
