package gráficos;

import gráficos.baseDeDatos.*;

public class listaEnlazada 
{
    class Nodo
    {
        Object dato;
        Nodo siguiente;
    }
    
    Nodo ultimo;
    Nodo primero;
    Nodo actual;
    int tamaño;
    public listaEnlazada()
    {
        this.primero = null;
        this.ultimo = null;
        this.actual = null;
        this.tamaño = 0;
    }
    
    public void add(Object datPersona)
    {
        Nodo nuevo=null;
        nuevo.dato = datPersona;
        nuevo.siguiente = null;
        if (this.primero==null)
        {
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.actual = nuevo;
        }
        else
        {
            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }
    
    public Object getAlcual()
    {
        Object aux = this.actual.dato;
        this.actual = this.actual.siguiente;
        return aux;
    }
    
}