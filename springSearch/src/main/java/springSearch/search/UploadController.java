package springSearch.search;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/fileForm")
	public String showUploadForm() {
		return "uploadForm";
	}
	
	@RequestMapping(path="/uploadFile" , method=RequestMethod.POST)
	public String uploadfile(@RequestParam(name="profileForm" , required = true) CommonsMultipartFile file, HttpSession s ,Model m) throws IOException {
		System.out.println("File Upload Handle");
		System.out.println(file.getContentType());
		byte[] data=file.getBytes();
		//we have to save this file to server
		
		String path=s.getServletContext().getRealPath("/") +"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator + file.getOriginalFilename();
		System.out.println(path);
		
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file upload");
		m.addAttribute("success","Successfully upload this image");
		m.addAttribute("fileName" ,file.getOriginalFilename());
		return "uploadFile";
	}
	
	@RequestMapping("/pathVar/{id}/{userName}") // code for pathVariable
	public String pathVar(@PathVariable("id") int id,@PathVariable("userName") String userName) {
		System.out.println("here id is: "+id);
		System.out.println();
	    Integer.parseInt(userName);
		return "uploadForm";
	}
	
	
}
