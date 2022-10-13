package Modelo;
import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class dtoADto {
public static ArrayList<dtoProductos> resultsetAdtoProducto(ResultSet resultadoConsulta){
		
		System.out.println("[INFORMACIÓN-resultsetAdtoProducto-resultsetAdtoProducto] Entrando en resultsetAdtoProducto");
		ArrayList<dtoProductos> listProductos = new ArrayList<>();
		
		//Leemos el resultado de la consulta hasta que no queden filas
		try {
			while ( resultadoConsulta.next() ) {
				
				listProductos.add(new dtoProductos(resultadoConsulta.getString("md_uuid"),
						resultadoConsulta.getString("md_fch"),
						resultadoConsulta.getInt("id_producto"),
						resultadoConsulta.getString("cod_producto"),
						resultadoConsulta.getString("nombre_producto"),
						resultadoConsulta.getString("tipo_producto_origen"),
						resultadoConsulta.getString("tipo_producto_clase"),
						resultadoConsulta.getString("des_producto"),
						resultadoConsulta.getString("fch_alta_producto"),
						resultadoConsulta.getString("fch_baja_producto")
						
						
						)
						);
			}
			
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-resultsetAdtoProducto-resultsetAdtoProducto] Número productos: "+i);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listProductos;
		
	}

}
