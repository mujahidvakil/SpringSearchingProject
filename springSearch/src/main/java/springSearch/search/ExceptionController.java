package springSearch.search;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler({NullPointerException.class})
	public String handlingExcetion(Model m) {
		m.addAttribute("msg", "NullPointerException");
		return "exPage";
	}
	@ExceptionHandler({NumberFormatException.class})
	public String handlingExcetionNumebr(Model m) {
		m.addAttribute("msg", "NumberFormatException");
		return "exPage";
	}
}
