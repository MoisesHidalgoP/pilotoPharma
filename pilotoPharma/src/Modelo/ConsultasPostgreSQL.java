package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultasPostgreSQL {

public static ArrayList<dtoProductos> selectAllProductos(Connection conexionGenerada) {
		
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Entra en selectAllProductos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<dtoProductos> listProductos = new ArrayList<>();
		
		try {
			
			//Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"");
		    
			//Llamada a la conversión a dtoAlumno
			listProductos = dtoADto.resultsetAdtoProducto(resultadoConsulta);
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Número productos: "+i);
			
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Cierre conexión, declaración y resultado");				
		    resultadoConsulta.close();
		    declaracionSQL.close();
		    //conexionGenerada.close();
			
		} catch (SQLException e) {
			
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			return listProductos;
			
		}
		return listProductos;
		
	}
}

