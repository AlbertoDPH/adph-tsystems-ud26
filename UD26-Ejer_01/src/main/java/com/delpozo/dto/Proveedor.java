package com.delpozo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores") // en caso que la tabala sea diferente
public class Proveedor {

	// Atributos de entidad proveedor
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String id;
	private String nombre;

//	@OneToMany
//	@JoinColumn(name = "id")
//	private List<Suministra> suministra;

	// Constructores

	public Proveedor() {

	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 */
	public Proveedor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public void setSuministra(List<Suministra> suministra) {
//		this.suministra = suministra;
//	}

//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
//	public List<Suministra> getSuministra() {
//		return suministra;
//	}

	// Metodo toString
//	@Override
//	public String toString() {
//		return "Proveedor [id=" + id + ", nombre=" + nombre + ", suministra=" + suministra + "]";
//	}

}
