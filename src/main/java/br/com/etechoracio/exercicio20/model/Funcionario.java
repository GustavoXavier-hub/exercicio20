package br.com.etechoracio.exercicio20.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.etechoracio.exercicio20.enums.TipoFuncionarioEnum;
@Table (name="TBL_FUNCIONARIO")
@Entity
public class Funcionario {
	@Id
	@GeneratedValue
	@Column(name="ID_FUNCIONARIO")
	private Long id;
	
	@Column(name="TX_nome")
	private String  nome;
	@Column(name="TX_FONE")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TP_FUNCIONARIO")
	private TipoFuncionarioEnum tipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO")
	private Date dataCadastro;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoFuncionarioEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoFuncionarioEnum tipo) {
		this.tipo = tipo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	

}
