package springSearch.search;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springSearch.search.entity.Student;

@Controller
public class FormHandlerController {
	
	@RequestMapping("/showForm")
	public String getFrom() {
		return "showPage";
	}
	
	@RequestMapping(path="/showDetails", method=RequestMethod.POST)
	public String getFrom(@ModelAttribute("std") Student std,BindingResult result) {
		if(result.hasErrors()) {
			return "showPage";
		}
		System.out.println(std);
		return "showDetails";
	}

}
