package com.mthree;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HtmlResource {
	@GetMapping(value = "/")
	public String testPage(Model model) {
		String name = "John";
		
		model.addAttribute("name", name);
		return "StudentRegistration";
	}
}
