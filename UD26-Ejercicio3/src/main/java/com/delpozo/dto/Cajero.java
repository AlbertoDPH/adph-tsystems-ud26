package com.delpozo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajeros") // en caso que la tabala sea diferente
public class Cajero {

	// Atributos de entidad cajero
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	private String nom_apelis;

	@OneToMany(mappedBy = "cajero")
	private List<Venta> venta;

	// Constructores

	public Cajero() {

	}

	public Cajero(int codigo, String nom_apelis) {
		this.codigo = codigo;
		this.nom_apelis = nom_apelis;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNom_apelis() {
		return nom_apelis;
	}

	public void setNom_apelis(String nom_apelis) {
		this.nom_apelis = nom_apelis;
	}

	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nom_apelis=" + nom_apelis + "]";
	}

}
