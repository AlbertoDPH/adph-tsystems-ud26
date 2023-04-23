//package com.delpozo.dto;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class SuministraId implements Serializable{
//
//	private Integer piezaId;
//    private Integer proveedorId;
//
//    // Constructores, getters y setters
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SuministraId that = (SuministraId) o;
//        return Objects.equals(piezaId, that.piezaId) &&
//                Objects.equals(proveedorId, that.proveedorId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(piezaId, proveedorId);
//    }
//}
