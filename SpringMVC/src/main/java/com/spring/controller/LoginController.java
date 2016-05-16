package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.AbcJson;
import com.spring.bean.LoginForm;
import com.spring.service.TestService;

@Controller
public class LoginController {

	private @Autowired
	TestService service;

	// SpringMVC中,@RequestMapping用来处理请求,比如XXX.do
	@RequestMapping(value = "login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("/index/index", "command",
				"LOGIN SUCCESS, " + username);
		return mv;
	}

	@RequestMapping(value = "login1", method = RequestMethod.GET)
	public ModelAndView oneByone(@RequestParam(value = "name") String name,
			String id) {

		ModelAndView mv = new ModelAndView("/index/index", "command","LOGIN SUCCESS, " + name);
		return mv;
	}

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public ModelAndView oneByone1(@RequestParam(value = "name") String name,
			String id) {
		ModelAndView mv = new ModelAndView("/index/index", "command",
				"LOGIN SUCCESS, " + name);
		return mv;
	}

	@RequestMapping(value = "oneByone2")
	public @ResponseBody
	Map<String, Object> oneByone2(@RequestParam(value = "name") String name,
			String id) {

		System.out.println(service.toString());
		System.out.println(service.one());
		Map<String, Object> mv = new HashMap<String, Object>();
		// mv.put("name", name);
		mv.put("id", id);
		mv.put("A", 1);
		mv.put("a", 1);
		mv.put("g", 2);
		mv.put("o", id);
		mv.put("s", id);
		mv.put("r", id);
		return mv;
	}

	@RequestMapping(value = "oneByone3")
	public @ResponseBody
	AbcJson oneByone3(@RequestParam(value = "name") String name, String id) {
		AbcJson json = new AbcJson();
		json.setB("b");
		json.setA("a");
		json.setC("c");
		return json;
	}
}