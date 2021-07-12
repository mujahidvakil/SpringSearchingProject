package springSearch.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String homePage() {
		//return "redirect:showForm";
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("searchBox") String searchBox) {
		String url="https://www.google.com/search?q="+searchBox;
		RedirectView rv=new RedirectView();
		rv.setUrl(url);
		return rv;
	}
}

