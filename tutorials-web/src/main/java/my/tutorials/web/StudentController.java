package my.tutorials.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("student")
public class StudentController {

	@RequestMapping(value = "get")
	public ModelAndView testfreemarkerview(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		
		String str = "freemark示例";
		mav.addObject("pageTitle", str);

		Map<String, String> studentList = new HashMap<String, String>();
		studentList.put("name", "光头强");
		studentList.put("age", "21");
		studentList.put("address", "大兴安岭");
		studentList.put("ad", "东北");
		studentList.remove("ad");
		mav.addObject("studentList", studentList);
		
		mav.setViewName("freemarker/student");
		return mav;
	}

}
