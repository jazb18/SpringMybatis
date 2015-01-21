package com.ZBSoft.template.service;


import java.util.List;

import com.ZBSoft.template.dominio.PersonaBean;

public interface PersonaService{
	public void grabarPersona(PersonaBean personaBean);
	public List<PersonaBean> listarPersona();
}
