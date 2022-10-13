package Controlador;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.ConexionPostgreSQL;
import Modelo.ConexionPostgreSQL;
import Modelo.ConsultasPostgreSQL;
import Modelo.dtoProductos;
import Util.variablesConexionPostgreSQL;

public class ControladorPostgreSQL {
	public static void main(String[] args) throws SQLException {
	//CONSTANTES
			final String HOST = variablesConexionPostgreSQL.getHost();
			final String PORT = variablesConexionPostgreSQL.getPort();
			final String DB = variablesConexionPostgreSQL.getDb();
			final String USER = variablesConexionPostgreSQL.getUser();
			final String PASS = variablesConexionPostgreSQL.getPass();
			ArrayList<dtoProductos> listProductos = new ArrayList<>();
			

			/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
			*utilizando el método generaConexion
			*/
			System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
			ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
			Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
			
			if(conexionGenerada != null) {
				
				//Llamar al método que ejecuta la consulta
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Llamada selectAllProductos");
				listProductos = ConsultasPostgreSQL.selectAllProductos(conexionGenerada);
				int i = listProductos.size();
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Número productos: "+i);
				for(Modelo.dtoProductos productos: listProductos) {
					System.out.println(productos.getMd_uuid()+" "+productos.getMd_fch()+" "+productos.getId_producto()+" "+productos.getCod_producto()+" "+productos.getNombre_producto()+" "+productos.getTipo_producto_origen()+" "+productos.getTipo_producto_case()+" "+productos.getDes_producto()+" "+productos.getFch_alta_producto()+" "+productos.getFch_baja_producto());			
					}
				
				conexionGenerada.close();

}
}
}

