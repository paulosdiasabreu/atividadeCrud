package br.com.aluno.atividade.crud.controller;

import br.com.aluno.atividade.crud.entidade.*;
import br.com.aluno.atividade.crud.dao.*;
import br.com.aluno.atividade.crud.util.*;
import java.util.*;
import javax.ejb.*;
import javax.faces.bean.*;

@ManagedBean
public class AgendaController {
	
	private Agenda agenda;
	
	@EJB
	private AgendaDAO agendaDAO;
	
	
	public AgendaController(){
		this.agenda = new Agenda();
	}
	
	public void salvar(){
		String erro = agendaDAO.salvar(agenda);
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Salvo com sucesso.");
			this.agenda = new Agenda(); //Limpar os campos
		}	
	}
	
	public void excluir(Agenda agenda){
		String erro = agendaDAO.excluir(agenda.getMatricula());				
	
		if(erro != null){
			Mensagem.erro("Ocorreu um erro: "+erro);
		}else{
			Mensagem.sucesso("Excluído com sucesso.");
		}
	}
	
	public void editar(Agenda agendaEditado){
		this.agenda = agendaEditado;
	}
	
	public List<Agenda> consultar(){
		return agendaDAO.todos();
	}
	

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

}
