package com.delpozo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delpozo.dto.Suministra;
import com.delpozo.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;

	@GetMapping("/suministra")
	public List<Suministra> listarSuministra() {
		return suministraServiceImpl.listarSuministra();
	}

	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}

	@GetMapping("/suministra/{id}")
	public Suministra suministraXID(@PathVariable(name = "id") Integer id) {

		Suministra suministra_xid = new Suministra();

		suministra_xid = suministraServiceImpl.suministraXID(id);

		System.out.println("Suministra XID: " + suministra_xid);

		return suministra_xid;
	}

	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name = "id") Integer id,
			@RequestBody Suministra suministra) {

		Suministra suministra_seleccionado = new Suministra();
		Suministra suministra_actualizado = new Suministra();

		suministra_seleccionado = suministraServiceImpl.suministraXID(id);

		suministra_seleccionado.setProveedor(suministra.getProveedor());
		suministra_seleccionado.setPieza(suministra.getPieza());
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		
		suministra_actualizado = suministraServiceImpl.actualizarSuministra(suministra_seleccionado);

		System.out.println("La suministra actualizada es: " + suministra_actualizado);

		return suministra_actualizado;
	}

	@DeleteMapping("/suministra/{id}")
	public void eliminarSuministra(@PathVariable(name = "id") Integer id) {
		suministraServiceImpl.eliminarSuministra(id);
	}

}
