package bancoDeDados;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String Url = "jdbc:oracle:thin:@localhost:3306";
	private String User = "ESPETINHOS";
	private String Passworld = "root";
	
	/* Método responsavel por conectar o banco
	 * @return connection
	 * @throws ClassNotFundException
	 */
	
public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(Url, User, Passworld);
			
			if(conn !=  null) {
				System.out.println("Banco conectado");
			}
			
		} catch (Exception e) {
			System.out.println("Erro na conexão com o banco" + e.getMessage());
		}
		
		return conn;	
			
		}

	

/*Para fechar conexão
 * @param conn
 */

	public void fecharConexao(Connection conn) {
		
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexão." + e.getMessage());
		}
			
	}	
	
	
}
