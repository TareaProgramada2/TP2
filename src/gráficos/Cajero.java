/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

/**
 *
 * @author kenneth
 */
public class Cajero {
    public String condicion;
    public String [] cajas;
    public int maxSize;
 
    Cajero(int tamaño)
    {
        this.maxSize=tamaño;
        this.cajas=new String[this.maxSize];
        condicion = "vacio";
        Inicializa();
    }
    public void Inicializa()
    {
        for (int i=0;i<this.maxSize;i++)
        {
            this.cajas[i]=this.condicion;
        }
    }
    public void setCondicion(String cliente)
    {
        if (cliente!="vacio")
        {
            boolean bandera = false;
            for (int i=0;i<this.maxSize && bandera!=true;i++)
            {
                if(this.cajas[i]=="vacio")
                {
                    cajas[i]="ocupado";
                    bandera =true;
                }
            }
            if (bandera==false)
            {
                cajas[0]="vacio";
            }
        }
        else
        {
            boolean bandera = false;
            for (int i=0;i<this.maxSize && bandera!=true;i++)
            {
                if(this.cajas[i]=="ocupado")
                {
                    cajas[i]="vacio";
                    bandera =true;
                }
            }
        }
    }
    
    public String[] getCajas(){
        return this.cajas;
    }
}