package servlet.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import servlet.service.testService;

@Controller
public class sevController {

	@Resource(name = "testService")
	private testService testService;
	
	@RequestMapping(value = "/mainTest.do")
	public String mainTest(ModelMap model) throws Exception {
		System.out.println("sevController.java - mainTest()");
		
		List<?> list = testService.selectAll();
		model.addAttribute("resultList", list);
		
		return "test/hello";
	}
	
}