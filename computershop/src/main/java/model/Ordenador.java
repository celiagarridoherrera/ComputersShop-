package model;

public class Ordenador {
    
    String marca;
    int memoria;
    String caracteristicasProcesador;
    String sistemaOperativo;
    double precio;

    public Ordenador(String marca, int memoria, String caracteristicasProcesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.caracteristicasProcesador = caracteristicasProcesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCaracteristicasProcesador() {
        return caracteristicasProcesador;
    }

    public void setCaracteristicasProcesador(String caracteristicasProcesador) {
        this.caracteristicasProcesador = caracteristicasProcesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
