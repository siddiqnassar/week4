package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnotherController {

	public AnotherController()
	{
		System.out.println("Another controller created");
	}
	@RequestMapping("/")
	public String greet() {
		return "login";
	}
	@RequestMapping("/verify1")
	public String verify(HttpServletRequest req)
	{
		String name=req.getParameter("user");
		System.out.println("Name :" +name);
		
		HttpSession session=req.getSession();
		session.setAttribute("uname",req.getParameter("user"));
		return "welcome";
	}
	@RequestMapping("/verify2")
	public String verifyMethod2(@RequestParam("user") String name,HttpSession session)
	{
		session.setAttribute("uname",name);
		return "welcome";
	}
	@RequestMapping("/verify3")
	public String verifyMethod3(String user,String pwd,HttpSession session)
	{
		session.setAttribute("pass", pwd);
		session.setAttribute("uname",user);
		return "welcome";
	}
	//This is the preferred way as we can see all attributes
	@RequestMapping("/verify4")
	public ModelAndView verifyMethod4(Person p)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("per",p);
		mv.setViewName("loggedIn");
		return mv;
	}
}
