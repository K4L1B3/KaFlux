package classes;

public class Produto {

	
	private int id;
	private String descricao; //tipo
	private double preco;
	private int qtdItens;
	
	
	public Produto () {
		
	}
	
	public Produto (int id, String descricao, double preco, int qtdItens) {
		
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.qtdItens = qtdItens;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtdItens;
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
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		if (qtdItens != other.qtdItens)
			return false;
		return true;
	}
	
	
	
	
}
