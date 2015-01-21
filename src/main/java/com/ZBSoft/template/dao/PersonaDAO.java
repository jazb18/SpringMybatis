package com.ZBSoft.template.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.ZBSoft.template.dominio.PersonaBean;


@Repository
public interface PersonaDAO {
	
	public void grabarPersona(PersonaBean personaBean);
	
	public List<PersonaBean> listarPersona();
}
