package model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    String nombre;
    String propietario;
    String idTributario;
    List<Ordenador> ordenadores = new ArrayList<Ordenador>();
    public Tienda(String nombre, String propietario, String idTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.idTributario = idTributario;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public String setPropietario(String propietario) {
        return this.propietario = propietario;
    }

    public String getIdTributario() {
        return idTributario;
    }

    public String setIdTributario(String id){
        return this.idTributario = id;
    }

    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(List<Ordenador> ordenadores) {
        this.ordenadores = ordenadores;
    }

}
