package Clases;

import java.util.ArrayList;

public class Cola extends Lista{
    public Cola(){
        this.list = new ArrayList<>();
    }
    
    @Override
    public void mete(TipoElemento x) {
        this.list.add(x);
    }

    @Override
    public void saca() {
        this.list.remove(0);
    }

    @Override
    public void imprimir() {
        
    }

    public ArrayList<TipoElemento> getList() {
        return list;
    }

    public void setList(ArrayList<TipoElemento> list) {
        this.list = list;
    }
    
    
    
}
