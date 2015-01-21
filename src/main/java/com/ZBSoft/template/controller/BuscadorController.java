package com.ZBSoft.template.controller;





import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.ZBSoft.template.dominio.PersonaBean;
import com.ZBSoft.template.entity.Persona;
import com.ZBSoft.template.service.PersonaService;

@Controller
public class BuscadorController {
	
	private final Logger logger = Logger.getLogger(getClass()); 
	
	@Autowired
	private Persona persona; 
	@Autowired
	private PersonaService personaService;
	@Autowired
	private PersonaBean personaBean; 
	@RequestMapping(value="/index.htm",method = RequestMethod.GET)
	public ModelAndView handlerRequest(HttpServletRequest request , HttpServletResponse response) throws Exception{
		String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
		return new ModelAndView("buscador");
		
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public void grabarPersona(HttpServletRequest request, HttpServletResponse response)throws IOException{
		ServletWebRequest webRequest = new ServletWebRequest(request);
			try {
								
				String nombre = webRequest.getParameter("nombre");
				String email = webRequest.getParameter("email");
				String phone = webRequest.getParameter("phone");
								
				personaBean.setId_contact("0");
				personaBean.setName(nombre);
				personaBean.setEmail(email);
				personaBean.setPhone(phone);
				personaService.grabarPersona(personaBean);
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(e.getMessage());
				System.out.println(e.getMessage());
			}
			
	}
	
}
