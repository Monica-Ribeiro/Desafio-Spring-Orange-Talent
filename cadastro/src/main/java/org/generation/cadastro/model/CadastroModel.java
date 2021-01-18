package org.generation.cadastro.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity//
@Table(name = "Cadastro_Usuario")
public class CadastroModel {

	//CRIANDO OS ATRIBUTOS:
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String nome;
	
	@Column(unique = true)
	@NotEmpty
	@Email
	private String email;
	

	@Column(unique = true)
	@NotEmpty
	@CPF
	private String cpf;
	
	@NotNull
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date dataNasc;
	
	
	/*GERANDO OS GETTERS.*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
	
}
