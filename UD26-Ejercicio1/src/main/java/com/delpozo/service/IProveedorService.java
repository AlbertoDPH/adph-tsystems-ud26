package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Proveedor;

public interface IProveedorService {
	
	//Metodos del CRUD
		public List<Proveedor> listarProveedor(); // Listar All

		public Proveedor guardarProveedor(Proveedor proveedor); // Guarda un proveedor CREATE

		public Proveedor proveedorXID(Integer id); // Leer datos de un proveedor READ

		public Proveedor actualizarProveedor(Proveedor proveedor); // Actualiza datos del proveedor UPDATE

		public void eliminarProveedor(Integer id);// Elimina el proveedor DELETE

}
