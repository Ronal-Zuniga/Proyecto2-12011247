package Clases;

import java.util.ArrayList;

public class Pila extends Lista{
    private int tope;

    public Pila() {
        this.tope = -1;
        this.list = new ArrayList<>();
    } 
    
    @Override
    public void mete(TipoElemento x) {
        this.list.add(x);
        this.tope++;
    }

    @Override
    public void saca() {
        
    }

    @Override
    public void imprimir() {
        for(int i = 0; i < this.list.size(); i++){
            System.out.println(this.list.get(i).getTransaccion());
        }
    }
    
}
