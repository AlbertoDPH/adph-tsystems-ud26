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
@Table(name = "investigadores") // en caso que la tabala sea diferente
public class Investigador {

	// Atributos de entidad investigador
	@Id
	private String id;

	@Column(name = "nom_apels")
	private String nombreApellidos;

	@ManyToOne
	@JoinColumn(name = "id_facultad")
	private Facultad facultad;

	@OneToMany(mappedBy = "id")
	private List<Reserva> reservas;

	// Constructores

	public Investigador() {

	}

	/**
	 * 
	 * @param dni
	 * @param nombreApellidos
	 * @param facultad
	 * @param reservas
	 */
	public Investigador(String id, String nombreApellidos, Facultad facultad, List<Reserva> reservas) {
		this.id = id;
		this.nombreApellidos = nombreApellidos;
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

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	public List<Reserva> getReservas() {
		return reservas;
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
		return "Investigador [id=" + id + ", nombreApellidos=" + nombreApellidos + ", facultad=" + facultad
				+ ", reservas=" + reservas + "]";
	}

}
