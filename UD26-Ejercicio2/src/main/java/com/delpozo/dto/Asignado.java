package com.delpozo.dto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignado_a") // en caso que la tabla sea diferente
public class Asignado {

	// Atributos de la entidad asignado
	@EmbeddedId
	private AsignadoKey id;

	@ManyToOne
	@MapsId("dniCientifico")
	@JoinColumn(name = "dni", referencedColumnName = "dni", nullable = false)
	Cientifico cientifico;

	@ManyToOne
	@MapsId("idProyecto")
	@JoinColumn(name = "id_proyecto", referencedColumnName = "id", nullable = false)
	Proyecto proyecto;

	// Constructores

	public Asignado() {

	}

	/**
	 * 
	 * @param id
	 * @param cientifico
	 * @param proyecto
	 */
	public Asignado(AsignadoKey id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	// Getters y Setters
	public AsignadoKey getId() {
		return id;
	}

	public void setId(AsignadoKey id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
