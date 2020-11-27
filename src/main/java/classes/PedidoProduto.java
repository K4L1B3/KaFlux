package classes;

public class PedidoProduto {

	
	private int idProduto;
	private int idPedido;
	private int quantidade;
	private double valorUnitario;
	
	
	
	public PedidoProduto () {
		
	}
	
	public PedidoProduto (int idProduto, int idPedido, int quantidade, double valorUnitario) {
		
		this.idProduto = idProduto;
		this.idPedido = idPedido;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		
		
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPedido;
		result = prime * result + idProduto;
		result = prime * result + quantidade;
		long temp;
		temp = Double.doubleToLongBits(valorUnitario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		PedidoProduto other = (PedidoProduto) obj;
		if (idPedido != other.idPedido)
			return false;
		if (idProduto != other.idProduto)
			return false;
		if (quantidade != other.quantidade)
			return false;
		if (Double.doubleToLongBits(valorUnitario) != Double.doubleToLongBits(other.valorUnitario))
			return false;
		return true;
	}

	
	
	
	
	
}
