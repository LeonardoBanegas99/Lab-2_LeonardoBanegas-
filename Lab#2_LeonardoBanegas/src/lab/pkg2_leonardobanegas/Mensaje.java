package lab.pkg2_leonardobanegas;

public class Mensaje {

    private String emisor;
    private String receptor;
    private String contenido;
    private int prioridad;

    public Mensaje(String emisor, String receptor, String contenido, int prioridad) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        this.prioridad = prioridad;
    }

    public Mensaje() {
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", contenido=" + contenido + ", prioridad=" + prioridad + '}';
    }
    

}
