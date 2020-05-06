package com.xworkz.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
	private static Logger logger = Logger.getLogger(FirstController.class);

	public FirstController() {
		System.out.println("created \t" + this.getClass().getSimpleName());
		logger.info("...Invoked" + this.getClass().getSimpleName() + " obj created!");
	}

	@RequestMapping("/index.do")
	public String getMessage(ModelMap model) {
		try {
			logger.info(" welcome to info world-->  inside getMessage()....");
			logger.trace(" welcome to  trace  -->  inside getMessage()....");
			logger.debug("welcome to debug  -->  inside getMessage()....");
			logger.warn("welcome to warn  -->  inside getMessage()....");
			logger.error("welcome to error  -->  inside getMessage()....");
			logger.fatal("welcome to fatal  -->  inside getMessage()....");
			model.addAttribute("message", "welcome to logger's file");
			return "Welcome.jsp";
		} catch (Exception e) {
			logger.error(e);
		}
		logger.info("inside getMessage()....");
		return "Welcome.jsp";
	}
}