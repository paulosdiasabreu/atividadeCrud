package br.com.aluno.atividade.crud.dao;

import javax.ejb.*;
import br.com.aluno.atividade.crud.entidade.*;

@Stateless
public class AgendaDAO extends GenericDAO<Agenda> {
	
	public AgendaDAO(){
		super(Agenda.class);
	}

}
