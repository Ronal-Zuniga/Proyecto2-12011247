package Clases;

public class TipoElemento {
    private String transaccion;
    private Persona persona;

    public TipoElemento() {
    }

    public TipoElemento(String transaccion) {
        this.transaccion = transaccion;
    }

    public TipoElemento(Persona persona) {
        this.persona = persona;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
