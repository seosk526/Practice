package kr.ac.kopo.kopo01.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {	
	
	@RequestMapping(value = "/hello")
	public String hellSpringBoot(Model model) {
		model.addAttribute("name", "강세영");
		return "hello";
	}
}
