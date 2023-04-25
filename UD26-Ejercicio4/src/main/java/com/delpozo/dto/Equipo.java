package com.delpozo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos") // en caso que la tabala sea diferente
public class Equipo {

	// Atributos de entidad equipo
	@Id
	@Column(length = 4)
	private String id;

	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "id_facultad")
	private Facultad facultad;
	
	@OneToMany(mappedBy = "id")
	private List<Reserva> reservas;

	// Constructores

	public Equipo() {

	}

	/**
	 * 
	 * @param numSerie
	 * @param nombre
	 * @param facultad
	 * @param reservas
	 */
	public Equipo(String id, String nombre, Facultad facultad, List<Reserva> reservas) {
		this.id = id;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reservas = reservas;
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

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reservas;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", facultad=" + facultad + ", reservas="
				+ reservas + "]";
	}

}
