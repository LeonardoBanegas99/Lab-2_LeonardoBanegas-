package lab.pkg2_leonardobanegas;

import java.util.ArrayList;

public class Casos {

    private String lugar;
    private String descripcion;
    private String tipo;
    private String detACargo;
    private String estado;
    private ArrayList<Evidencia> evi = new ArrayList();

    public Casos(String lugar, String descripcion, String tipo, String detACargo, String estado, String nombre, String des, String niveldePeligro) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detACargo = detACargo;
        this.estado = estado;
        evi.add(new Evidencia(lugar, descripcion, tipo));

    }

    public Casos(String lugar, String descripcion, String tipo, String detACargo, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detACargo = detACargo;
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetACargo() {
        return detACargo;
    }

    public void setDetACargo(String detACargo) {
        this.detACargo = detACargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Evidencia> getEvi() {
        return evi;
    }

    public void setEvi(ArrayList<Evidencia> evi) {
        this.evi = evi;
    }

    /*public void setEvi(String nombre, String des, String niveldePeligro) {
        evi.add(new Evidencia(nombre, des, niveldePeligro));
    }*/
    @Override
    public String toString() {
        return "Casos{" + "lugar=" + lugar + ", descripcion=" + descripcion + ", tipo=" + tipo + ", detACargo=" + detACargo + ", estado=" + estado + ", evi=" + evi + '}';
    }

}
