package classes;

import java.util.List;

public class Cliente {

	
	private String nome;
	private String nomeFantasia;
	private double cpf;
	private double cnpj;
	private int telefone;
	private String email;
	private int id;
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	
	
	public Cliente () {
		
	}
	
	public Cliente (String nome, String nomeFantasia, double cpf, double cnpj, int telefone, String email, 
			int id, String rua, int numero, String bairro, String complemento) {
		
		
		this.nome = nome;
		this.nomeFantasia = nomeFantasia;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		
	
}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cnpj);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		temp = Double.doubleToLongBits(cpf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeFantasia == null) ? 0 : nomeFantasia.hashCode());
		result = prime * result + numero;
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + telefone;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (Double.doubleToLongBits(cnpj) != Double.doubleToLongBits(other.cnpj))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (Double.doubleToLongBits(cpf) != Double.doubleToLongBits(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeFantasia == null) {
			if (other.nomeFantasia != null)
				return false;
		} else if (!nomeFantasia.equals(other.nomeFantasia))
			return false;
		if (numero != other.numero)
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}

	
	public void salvar (Cliente cliente) {
		
	}
		
	public void alterar (Cliente cliente) {
		
	}
	
	public void remover (int id) {
		
	}
	
	public void pesquisar(int id) {
		
	}
	
	public void listarTodos(){
		
	}
	
}