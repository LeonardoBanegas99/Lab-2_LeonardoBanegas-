package lab.pkg2_leonardobanegas;

public class Evidencia {

    private String nombre;
    private String descripcion;
    private String nivelPeligro;

    public Evidencia() {
    }

    public Evidencia(String nombre, String descripcion, String nivelPeligro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelPeligro = nivelPeligro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    @Override
    public String toString() {
        return "Evidencia{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", nivelPeligro=" + nivelPeligro + '}';
    }

}
