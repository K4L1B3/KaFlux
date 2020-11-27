package dao;

import java.util.List;

import classes.Cliente;

public interface ClienteDao {

	public void salvar (Cliente cliente);
	
	public void alterar (Cliente cliente);
	
	public void remover (int id);
	
	public Cliente pesquisar(int id);
	
	public List<Cliente> listarTodos();
	
}
