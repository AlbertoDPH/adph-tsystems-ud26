package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Pieza;

public interface IPiezaService {
	
	//Metodos del CRUD
		public List<Pieza> listarPieza(); // Listar All

		public Pieza guardarPieza(Pieza pieza); // Guarda un pieza CREATE

		public Pieza piezaXID(Integer id); // Leer datos de un pieza READ

		public Pieza actualizarPieza(Pieza pieza); // Actualiza datos del pieza UPDATE

		public void eliminarPieza(Integer id);// Elimina el pieza DELETE

}
