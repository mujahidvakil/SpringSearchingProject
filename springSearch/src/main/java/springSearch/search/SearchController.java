package springSearch.search;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String homePage() {
		//return "redirect:showForm";
		//return "home";
		return "handler";
	}
	
	/*
	 * @RequestMapping("/search") public RedirectView
	 * search(@RequestParam("searchBox") String searchBox) { String
	 * url="https://www.google.com/search?q="+searchBox; RedirectView rv=new
	 * RedirectView(); rv.setUrl(url); return rv; }
	 */
	
	@RequestMapping("/handel")
	public String handler(@RequestParam("searchBox") String userName,Model m) {
		String user=userName;
		System.out.println(user);
		m.addAttribute("user","mujahid");
		return "handlerForm";
	}

}

