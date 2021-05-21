package com.mvc.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
	public class AppointmentController {
		
		@Autowired
		private PatientDao patientDao;
		
		@RequestMapping("/")
		public String index(Model model) {
			model.addAttribute("register",new PatientBean());
			return "register";
		}
		@RequestMapping(value="/patientregister",method=RequestMethod.POST)
		public ModelAndView register(PatientBean register) {    
			patientDao.savePatient(register);
		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("display");
		    mv.addObject("name", register.getName());
		    mv.addObject("email",register.getEmail());
		    mv.addObject("phone",register.getPhone());
		    mv.addObject("city",register.getCity());
		    return mv;
		}
	}

