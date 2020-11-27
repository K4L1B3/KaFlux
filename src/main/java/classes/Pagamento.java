package classes;

public class Pagamento {

	private double dinheiro;
	
	private double cartao;
	
	public Pagamento (double dinheiro, double cartao) {
		
		this.dinheiro = dinheiro;
		this.cartao = cartao;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public double getCartao() {
		return cartao;
	}

	public void setCartao(double cartao) {
		this.cartao = cartao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cartao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dinheiro);
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
		Pagamento other = (Pagamento) obj;
		if (Double.doubleToLongBits(cartao) != Double.doubleToLongBits(other.cartao))
			return false;
		if (Double.doubleToLongBits(dinheiro) != Double.doubleToLongBits(other.dinheiro))
			return false;
		return true;
	}
	
	
	
	
	
	
}
