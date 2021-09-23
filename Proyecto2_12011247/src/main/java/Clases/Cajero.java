package Clases;

public class Cajero {
    private boolean vacio;
    private Persona p;
    private Cola q;
    private Pila pila;

    public Cajero() {
    }

    public Cajero(boolean vacio, Cola q, Pila pila) {
        this.vacio = vacio;
        this.q = q;
        this.pila = pila;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public Cola getQ() {
        return q;
    }

    public void setQ(Cola q) {
        this.q = q;
    }

    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila pila) {
        this.pila = pila;
    }
    
}
