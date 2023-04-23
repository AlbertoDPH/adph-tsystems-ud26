//package com.delpozo.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.delpozo.dao.ISuministraDAO;
//import com.delpozo.dto.Suministra;
//
//@Service
//public class SuministraServiceImpl implements ISuministraService{
//
//	@Autowired
//	ISuministraDAO iSuministraDAO;
//	
//	@Override
//	public List<Suministra> listarSuministra() {
//		
//		return iSuministraDAO.findAll();
//	}
//
//	@Override
//	public Suministra guardarSuministra(Suministra suministra) {
//		
//		return iSuministraDAO.save(suministra);
//	}
//
//	@Override
//	public Suministra suministraXID(Integer id) {
//		
//		return iSuministraDAO.findById(id).get();
//	}
//
//	@Override
//	public Suministra actualizarSuministra(Suministra suministra) {
//	
//		return iSuministraDAO.save(suministra);
//	}
//
//	@Override
//	public void eliminarSuministra(Integer id) {
//	
//		iSuministraDAO.deleteById(id);
//	}
//
//}
