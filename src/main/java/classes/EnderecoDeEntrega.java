package classes;

public class EnderecoDeEntrega {

	
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	private int idEndereco;
	
	
	public EnderecoDeEntrega() {
		
	}
	
	public EnderecoDeEntrega ( String rua, int numero, String bairro, String complemento, int idEndereco) {
		
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.idEndereco = idEndereco;
	
		this.complemento = complemento;
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

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + idEndereco;
		result = prime * result + numero;
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
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
		EnderecoDeEntrega other = (EnderecoDeEntrega) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (idEndereco != other.idEndereco)
			return false;
		if (numero != other.numero)
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}

	
	
	public void salvar(EnderecoDeEntrega enderecoDeEntrega) {
		
	}
	
	public void alterar (EnderecoDeEntrega enderecoDeEntrega) {
		
	}
	
	public void remover(int idEndereco) {
		
	}
	
	public void pesquisar(int idEndereco) {
		
	}
	
	
	

	
	
	
	
}
