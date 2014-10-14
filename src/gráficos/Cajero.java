/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author kenneth
 */
public class Cajero {
    public String condicion;
    public String [] cajas;
    public int maxSize;
    public baseDeDatos baseData = new baseDeDatos();
 
    Cajero() throws IOException
    {
        this.baseData.leerFicherosCajas();
        this.maxSize=this.baseData.getNumeroCajas();
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
    
    public void asignar(String cliente)
    {
        System.out.println(cliente);
        boolean bandera = false;
        if (cliente!="vacio")
        {
            for (int i=0; i< maxSize && bandera != true ;i++)
            {
                if(cajas[i]=="vacio")
                {
                    cajas[i]="ocupado";
                    bandera = true;
                }
            }
            if (bandera == false)
            {
                setCondicion(0);
                asignar(cliente);
            }            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "no quedan clientes en la cola", "Atención", 1 );
        }
    }
    
    public void setCondicion(int index)
    {
        boolean bandera = false;
        for (int i=0; i< maxSize && bandera!=true;i++)
        {
            if(cajas[i]!="ocupado")
            {
                bandera = true;
            }
        }
        if (bandera == true)
        {
            for (int i=0; i< maxSize && bandera!=false;i++)
            {
                if(cajas[i]=="ocupado")
                {
                    cajas[i]="vacio";
                    bandera = false;
                }
            }            
        }
        else
        {
            cajas[index]="vacio";
        }
    }
    
    public int getCajas(){
        return this.maxSize;
    }
    
    public String getCajeros()
    {
        String linea= "";
        for (int j=0;j<this.maxSize;j++)
        {
            linea= linea +"cajero"+(j+1)+"      "+cajas[j]+"\n";
        }
        return linea;
    }

    
}