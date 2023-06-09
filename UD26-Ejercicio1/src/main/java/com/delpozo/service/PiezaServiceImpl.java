package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.IPiezaDAO;
import com.delpozo.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;
	
	@Override
	public List<Pieza> listarPieza() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(Integer id) {
		
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
	
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(Integer id) {
	
		iPiezaDAO.deleteById(id);
	}

}
