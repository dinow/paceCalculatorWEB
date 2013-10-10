package be.dno.running.web.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import be.dno.running.web.CalcHelper;
import be.dno.running.web.CalculationResult;
import be.dno.running.web.entities.VMA;
import be.dno.running.web.persistence.GenericDao;



@Controller
public class GenericController {
	
	private static GenericDao<VMA> vmaDao = new GenericDao<VMA>(VMA.class);
	
	@RequestMapping(value = "/calcul", method = RequestMethod.POST)
	public ModelAndView gotohomePost(HttpServletRequest request) {
		
		CalculationResult cr = new CalculationResult();
		
		cr.setKms(handleNull(request.getParameter("kms")));
		cr.setAllure(handleNull(request.getParameter("allure")));
		cr.setTemps(handleNull(request.getParameter("temps")));
		cr.setVitesse(handleNull(request.getParameter("vitesse")));
		cr.setVma(handleNull(request.getParameter("vma")));
		cr.setPourcVMA(handleNull(request.getParameter("pourcVMA")));
		
		
		UserService userService = UserServiceFactory.getUserService();
		if (userService.getCurrentUser() != null){
			String userId = userService.getCurrentUser().getUserId();
			VMA vma = vmaDao.getById(userId);
			if (vma == null){
				vma = new VMA();
				vma.setUserId(userId);
				vma.setVma(cr.getVma());
				vmaDao.create(vma);
			}else{
				vma.setVma(cr.getVma());
				vmaDao.update(vma);
			}
		}
		
		cr = CalcHelper.calculate(cr);

		return new ModelAndView("calcul","calculResult",cr);
	}
	
	private String handleNull(String input){
		return input == null || input.equals("0") ? "" : input;
	}
	
	@RequestMapping(value = "/calcul", method = RequestMethod.GET)
	public ModelAndView gotohomeGet(HttpServletRequest request) {
		CalculationResult cr = new CalculationResult();
		UserService userService = UserServiceFactory.getUserService();
		if (userService.getCurrentUser() != null){
			String userId = userService.getCurrentUser().getUserId();
			VMA vma = vmaDao.getById(userId);
			if (vma != null){
				cr.setVma(vma.getVma());
			}
		}
		return new ModelAndView("calcul","calculResult",cr);
		
	}
	
}
