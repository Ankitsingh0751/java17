package spr_mvcc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/link")
	public String nav() {
		
		return "Welcome";
	}
	

}
