package com.delpozo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "facultad") // en caso que la tabala sea diferente
public class Facultad {

	// Atributos de entidad facultad
	@Id
	private String id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "id")
	private List<Investigador> investigadores;

	@OneToMany(mappedBy = "id")
	private List<Equipo> equipos;

	// Constructores

	public Facultad() {

	}

	/**
	 * 
	 * @param codigo
	 * @param nombre
	 * @param investigadores
	 * @param equipos
	 */
	public Facultad(String id, String nombre, List<Investigador> investigadores, List<Equipo> equipos) {
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	// Getters y Setters
	public String getId() {
		return id;
	}

	public void setCodigo(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Investigador> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipos() {
		return equipos;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigadors() {
		return investigadores;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", investigadores=" + investigadores + ", equipos="
				+ equipos + "]";
	}

}
