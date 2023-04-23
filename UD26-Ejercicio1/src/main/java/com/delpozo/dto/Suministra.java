package com.delpozo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suministra") // en caso que la tabla sea diferente
public class Suministra {

	// Atributos de la entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;

	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Pieza pieza;

	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor proveedor;

	private int precio;

	// Constructores

	public Suministra() {

	}

	/**
	 * 
	 * @param id
	 * @param pieza
	 * @param proveedor
	 * @param precio
	 */
	public Suministra(int id, Pieza pieza, Proveedor proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Suministra [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + ", precio=" + precio + "]";
	}

}
