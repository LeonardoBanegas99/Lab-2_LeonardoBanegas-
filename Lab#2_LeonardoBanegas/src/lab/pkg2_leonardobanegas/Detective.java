package lab.pkg2_leonardobanegas;

import java.util.ArrayList;

public class Detective {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private int anoslab;
    private int nivel;
    private ArrayList<String> casos = new ArrayList();
    private ArrayList<Mensaje> mensajes = new ArrayList();
    private String usuario;
    private String contra;

    public Detective() {
    }

    public Detective(String nombre, int edad, String nacionalidad, int anoslab, int nivel, String usuario, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.anoslab = anoslab;
        this.nivel = nivel;
        this.usuario = usuario;
        this.contra = contra;
    }

    public Detective(ArrayList<Mensaje> mensajes, ArrayList<String> casos) {
        this.mensajes = mensajes;
        this.casos = casos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnoslab() {
        return anoslab;
    }

    public void setAnoslab(int anoslab) {
        this.anoslab = anoslab;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<String> getCasos() {
        return casos;
    }

    public void setCasos(ArrayList<String> casos) {
        this.casos = casos;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + "\nnacionalidad=" + nacionalidad + ", años laborales=" + anoslab + "\nnivel=" + nivel +", usuario=" + usuario + ", contra=" + contra;
    }

}
