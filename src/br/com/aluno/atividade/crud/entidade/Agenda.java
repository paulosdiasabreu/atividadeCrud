package br.com.aluno.atividade.crud.entidade;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Agenda {
	
	@Id
	private Integer matricula;
	
	@NotNull(message="O nome não foi informado")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message="O Data de nascimento não foi informada")
	private Date dataNascimento;
	
	@NotNull(message="O CPF não foi informado")
	private String CPF;
	
	@NotNull(message="O salário não foi informado")
	private Float salario;

	public Integer getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public String getCPF() {
		return CPF;
	}

	public Float getSalario() {
		return salario;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}
	
	

}
