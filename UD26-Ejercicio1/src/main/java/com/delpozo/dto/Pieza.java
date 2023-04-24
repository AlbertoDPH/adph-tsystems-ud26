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
@Table(name = "piezas") // en caso que la tabala sea diferente
public class Pieza {

	// Atributos de entidad pieza
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Suministra> suministra;

	// Constructores

	public Pieza() {

	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param suministra
	 */
	public Pieza(int codigo, String nombre, List<Suministra> suministra) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}

}
