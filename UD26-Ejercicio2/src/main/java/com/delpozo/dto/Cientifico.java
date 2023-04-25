package com.delpozo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cientificos") // en caso que la tabala sea diferente
public class Cientifico {

	// Atributos de entidad cientifico
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String dni;
	
	@Column(name = "nom_apel")
	private String nomApel;

	@OneToMany
	@JoinColumn(name = "dni")
	private List<Asignado> asignado;

	// Constructores

	public Cientifico() {

	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param asignado
	 */
	public Cientifico(String dni, String nomApel, List<Asignado> asignado) {
		this.dni = dni;
		this.nomApel = nomApel;
		this.asignado = asignado;
	}
	// Getters y Setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	

	public String getNomApel() {
		return nomApel;
	}

	public void setNomApel(String nomApel) {
		this.nomApel = nomApel;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientificos")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", NomApels=" + nomApel + "]";
	}

}
