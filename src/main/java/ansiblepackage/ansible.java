package ansiblepackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ansible {
	
	@GetMapping("/learn")
	public String greeting1() {
		
		return"index.html";
	}
	
	
	
	
	
}