//package com.delpozo.dto;
//
//import java.util.List;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.IdClass;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@IdClass(SuministraId.class)
//@Table(name = "suministra") // en caso que la tabala sea diferente
//public class Suministra {
//
//	// Atributos de entidad suministra
//	@Id
//	@Column(name = "pieza_id")
//	private Integer piezaId;
//
//	@Id
//	@Column(name = "proveedor_id")
//	private Integer proveedorId;
//
//	@Id
//	// @GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e
//	// incrementa desde id final de db
//	@Column(name = "codigo_pieza", insertable = false, updatable = false)
//	private int codigo_pieza;
//
//	@Id
//	@Column(name = "id_proveedor", insertable = false, updatable = false)
//	private String id_proveedor;
//	private int precio;
//
//	// La relacionamos con la tabla 'piezas' de la bbdd a traves de su PK,FK
//	@ManyToOne
//	@JoinColumn(name = "codigo_pieza")
//	Pieza pieza;
//
//	// La relacionamos con la tabla 'piezas' de la bbdd a traves de su PK,FK
//	@ManyToOne
//	@JoinColumn(name = "id_proveedor")
//	Proveedor proveedor;
//
//	// Constructores
//
//	public Suministra() {
//
//	}
//
//	/**
//	 * 
//	 * @param codigo_pieza
//	 * @param id_proveedor
//	 * @param precio
//	 * @param pieza
//	 * @param proveedor
//	 */
//	public Suministra(int codigo_pieza, String id_proveedor, int precio, Pieza pieza, Proveedor proveedor) {
//		this.codigo_pieza = codigo_pieza;
//		this.id_proveedor = id_proveedor;
//		this.precio = precio;
//		this.pieza = pieza;
//		this.proveedor = proveedor;
//	}
//
//	// Getters y Setters
//	public int getCodigo_pieza() {
//		return codigo_pieza;
//	}
//
//	public void setCodigo_pieza(int codigo_pieza) {
//		this.codigo_pieza = codigo_pieza;
//	}
//
//	public String getId_proveedor() {
//		return id_proveedor;
//	}
//
//	public void setId_proveedor(String id_proveedor) {
//		this.id_proveedor = id_proveedor;
//	}
//
//	public int getPrecio() {
//		return precio;
//	}
//
//	public void setPrecio(int precio) {
//		this.precio = precio;
//	}
//
//	public Pieza getPieza() {
//		return pieza;
//	}
//
//	public void setPieza(Pieza pieza) {
//		this.pieza = pieza;
//	}
//
//	public Proveedor getProveedor() {
//		return proveedor;
//	}
//
//	public void setProveedor(Proveedor proveedor) {
//		this.proveedor = proveedor;
//	}
//
////	@JsonIgnore
////	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
////	public List<Suministra> getSuministra() {
////		return suministra;
////	}
//
//	// Metodo toString
//	@Override
//	public String toString() {
//		return "Suministra [codigo_pieza=" + codigo_pieza + ", id_proveedor=" + id_proveedor + ", precio=" + precio
//				+ ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
//	}
//
//}
