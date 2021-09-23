
package Clases;

import java.util.ArrayList;

public abstract class Lista{
    protected ArrayList<TipoElemento> list;
    public abstract void mete(TipoElemento x);
    public abstract void saca();
    public abstract void imprimir();
}