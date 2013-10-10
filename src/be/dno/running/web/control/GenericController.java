package be.dno.running.web.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.dno.running.web.CalculationResult;

//import com.google.appengine.api.users.UserService;
//import com.google.appengine.api.users.UserServiceFactory;

@Controller
public class GenericController {
	
	@RequestMapping(value = "/calcul", method = RequestMethod.POST)
	public ModelAndView gotohomePost(HttpServletRequest request) {
		/*UserService userService = UserServiceFactory.getUserService();
		if (userService.getCurrentUser() != null){
			
		}*/
		CalculationResult cr = new CalculationResult();
		cr.setKms("100");
		return new ModelAndView("calcul","calculResult",cr);
	}
	
	@RequestMapping(value = "/calcul", method = RequestMethod.GET)
	public ModelAndView gotohomeGet(HttpServletRequest request) {
		return new ModelAndView("calcul","calculResult",new CalculationResult());
	}
	
}
