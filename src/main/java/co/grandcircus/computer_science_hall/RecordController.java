package co.grandcircus.computer_science_hall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecordController {
	
	@Autowired
	private ApiService apiservice;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		
		return new ModelAndView("home", "tinies", apiservice.getTinyRecords());
	}
	
	@RequestMapping("/complete")
	public ModelAndView showComplete() {
		return new ModelAndView("complete", "completed", apiservice.getCompleteRecords());
	}
}
