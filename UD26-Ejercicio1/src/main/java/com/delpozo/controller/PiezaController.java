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

import com.delpozo.dto.Pieza;
import com.delpozo.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;

	@GetMapping("/piezas")
	public List<Pieza> listarPieza() {
		return piezaServiceImpl.listarPieza();
	}

	@PostMapping("/piezas")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.guardarPieza(pieza);
	}

	@GetMapping("/piezas/{codigo}")
	public Pieza piezaXID(@PathVariable(name = "codigo") Integer id) {

		Pieza pieza_xid = new Pieza();

		pieza_xid = piezaServiceImpl.piezaXID(id);

		System.out.println("Pieza XID: " + pieza_xid);

		return pieza_xid;
	}

	@PutMapping("/piezas/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name = "codigo") Integer id,
			@RequestBody Pieza pieza) {

		Pieza pieza_seleccionado = new Pieza();
		Pieza pieza_actualizado = new Pieza();

		pieza_seleccionado = piezaServiceImpl.piezaXID(id);

		pieza_seleccionado.setNombre(pieza.getNombre());
		
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);

		System.out.println("La pieza actualizada es: " + pieza_actualizado);

		return pieza_actualizado;
	}

	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name = "codigo") Integer id) {
		piezaServiceImpl.eliminarPieza(id);
	}

}
