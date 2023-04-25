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
@Table(name = "maquina_registradoras") // en caso que la tabala sea diferente
public class MaquinaRegistradora {

	// Atributos de entidad maquinaRegistradora
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	private int piso;

	@OneToMany(mappedBy = "maquinaRegistradora")
	private List<Venta> venta;

	// Constructores

	public MaquinaRegistradora() {

	}

	/**
	 * 
	 * @param codigo
	 * @param piso
	 * @param venta
	 */
	public MaquinaRegistradora(int codigo, int piso, List<Venta> venta) {
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinaRegistradora [codigo=" + codigo + ", piso=" + piso + "]";
	}

}
