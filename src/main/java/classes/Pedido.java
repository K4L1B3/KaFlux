package classes;

public class Pedido {

	private int id;
	private int idCliente;
	private double valorTotal;
	private int dataDoPedido;
	private int dataDeEntrega;
	private int horaDaEntrega;
	private boolean retirarEmLoja;
	private boolean statusDoProduto;
	private PedidoProduto listaPedidoProduto;
	private Pagamento formaDePagamento;
	private EnderecoDeEntrega enderecoDeEntrega;
	
	
	public Pedido (int id, int idCliente,double valorTotal, int dataDoPedido, int dataDeEntrega, int horaDaEntrega, Pagamento formaDePagamento, boolean retirarEmLoja, 
			PedidoProduto listaPedidoProduto, boolean statusDoProduto, EnderecoDeEntrega enderecoDeEntrega) {
		
		this.id = id;
		this.idCliente = idCliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
		this.valorTotal = valorTotal;
		this.dataDoPedido = dataDoPedido;
		this.dataDeEntrega = dataDeEntrega;
		this.horaDaEntrega = horaDaEntrega;
		this.formaDePagamento = formaDePagamento;
		this.retirarEmLoja = retirarEmLoja;
		this.listaPedidoProduto = listaPedidoProduto;
		this.statusDoProduto = statusDoProduto;
		
		
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int getDataDoPedido() {
		return dataDoPedido;
	}


	public void setDataDoPedido(int dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}


	public int getDataDeEntrega() {
		return dataDeEntrega;
	}


	public void setDataDeEntrega(int dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}


	public int getHoraDaEntrega() {
		return horaDaEntrega;
	}


	public void setHoraDaEntrega(int horaDaEntrega) {
		this.horaDaEntrega = horaDaEntrega;
	}


	public boolean isRetirarEmLoja() {
		return retirarEmLoja;
	}


	public void setRetirarEmLoja(boolean retirarEmLoja) {
		this.retirarEmLoja = retirarEmLoja;
	}


	public boolean isStatusDoProduto() {
		return statusDoProduto;
	}


	public void setStatusDoProduto(boolean statusDoProduto) {
		this.statusDoProduto = statusDoProduto;
	}


	public PedidoProduto getListaPedidoProduto() {
		return listaPedidoProduto;
	}


	public void setListaPedidoProduto(PedidoProduto listaPedidoProduto) {
		this.listaPedidoProduto = listaPedidoProduto;
	}


	public Pagamento getFormaDePagamento() {
		return formaDePagamento;
	}


	public void setFormaDePagamento(Pagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}


	public EnderecoDeEntrega getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}


	public void setEnderecoDeEntrega(EnderecoDeEntrega enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dataDeEntrega;
		result = prime * result + dataDoPedido;
		result = prime * result + ((enderecoDeEntrega == null) ? 0 : enderecoDeEntrega.hashCode());
		result = prime * result + ((formaDePagamento == null) ? 0 : formaDePagamento.hashCode());
		result = prime * result + horaDaEntrega;
		result = prime * result + id;
		result = prime * result + idCliente;
		result = prime * result + ((listaPedidoProduto == null) ? 0 : listaPedidoProduto.hashCode());
		result = prime * result + (retirarEmLoja ? 1231 : 1237);
		result = prime * result + (statusDoProduto ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(valorTotal);
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
		Pedido other = (Pedido) obj;
		if (dataDeEntrega != other.dataDeEntrega)
			return false;
		if (dataDoPedido != other.dataDoPedido)
			return false;
		if (enderecoDeEntrega == null) {
			if (other.enderecoDeEntrega != null)
				return false;
		} else if (!enderecoDeEntrega.equals(other.enderecoDeEntrega))
			return false;
		if (formaDePagamento == null) {
			if (other.formaDePagamento != null)
				return false;
		} else if (!formaDePagamento.equals(other.formaDePagamento))
			return false;
		if (horaDaEntrega != other.horaDaEntrega)
			return false;
		if (id != other.id)
			return false;
		if (idCliente != other.idCliente)
			return false;
		if (listaPedidoProduto == null) {
			if (other.listaPedidoProduto != null)
				return false;
		} else if (!listaPedidoProduto.equals(other.listaPedidoProduto))
			return false;
		if (retirarEmLoja != other.retirarEmLoja)
			return false;
		if (statusDoProduto != other.statusDoProduto)
			return false;
		if (Double.doubleToLongBits(valorTotal) != Double.doubleToLongBits(other.valorTotal))
			return false;
		return true;
	}


	
	
	
	
	
}
