package Modelo;

public class dtoProductos {
	//Constructor completo
			public dtoProductos(String md,String mdf ,int id,String codP, String nom,String tipoP,String tProC,String desP,String altaP,String bajaP) {
				
				md_uuid = md;
				md_fch = mdf;
				id_producto = id;
				cod_producto = codP;
				nombre_producto=nom;
				tipo_producto_origen=tipoP;
				tipo_producto_case=tProC;
				des_producto=desP;
				fch_alta_producto=altaP;
				fch_baja_producto=bajaP;
				
			}
			
			//Atributos	
			String md_uuid;
			String md_fch;
			int id_producto;
			String cod_producto;
			String nombre_producto;
			String tipo_producto_origen;
			String tipo_producto_case;
			String des_producto;
			String fch_alta_producto;
			String fch_baja_producto;
			
			public String getMd_uuid() {
				return md_uuid;
			}
			public void setMd_uuid(String md_uuid) {
				this.md_uuid = md_uuid;
			}
			public String getMd_fch() {
				return md_fch;
			}
			public void setMd_fch(String md_fch) {
				this.md_fch = md_fch;
			}
			public int getId_producto() {
				return id_producto;
			}
			public void setId_producto(int id_producto) {
				this.id_producto = id_producto;
			}
			public String getCod_producto() {
				return cod_producto;
			}
			public void setCod_producto(String cod_producto) {
				this.cod_producto = cod_producto;
			}
			public String getNombre_producto() {
				return nombre_producto;
			}
			public void setNombre_producto(String nombre_producto) {
				this.nombre_producto = nombre_producto;
			}
			public String getTipo_producto_origen() {
				return tipo_producto_origen;
			}
			public void setTipo_producto_origen(String tipo_producto_origen) {
				this.tipo_producto_origen = tipo_producto_origen;
			}
			public String getTipo_producto_case() {
				return tipo_producto_case;
			}
			public void setTipo_producto_case(String tipo_producto_case) {
				this.tipo_producto_case = tipo_producto_case;
			}
			public String getDes_producto() {
				return des_producto;
			}
			public void setDes_producto(String des_producto) {
				this.des_producto = des_producto;
			}
			public String getFch_alta_producto() {
				return fch_alta_producto;
			}
			public void setFch_alta_producto(String fch_alta_producto) {
				this.fch_alta_producto = fch_alta_producto;
			}
			public String getFch_baja_producto() {
				return fch_baja_producto;
			}
			public void setFch_baja_producto(String fch_baja_producto) {
				this.fch_baja_producto = fch_baja_producto;
			}

			

}
