package com.ZBSoft.template.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ZBSoft.template.dao.PersonaDAO;
import com.ZBSoft.template.dominio.PersonaBean;


@Service
@Transactional
public class PersonaServiceImp implements PersonaService{
	
	@Autowired
	private PersonaDAO personaDAO;
	
	public void grabarPersona(PersonaBean personaBean){
		personaDAO.grabarPersona(personaBean);
	}
	public List<PersonaBean> listarPersona() {
		// TODO Auto-generated method stub
		return personaDAO.listarPersona();
	}
	
}
