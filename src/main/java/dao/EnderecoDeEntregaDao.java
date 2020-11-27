package dao;

import classes.EnderecoDeEntrega;

public interface EnderecoDeEntregaDao {

	public void salvar(EnderecoDeEntrega enderecoDeEntrega);
	
	public void alterar (EnderecoDeEntrega enderecoDeEntrega);
	
	public void remover(int idEndereco);
	
	public void pesquisar(int idEndereco);
	
	
}
