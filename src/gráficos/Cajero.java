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
 
    /**
    * se abren ficheros que lean la cantidad de cajas
    * con la cantidad de cajas se genera un arreglo(cajeros)
    * y se inicializa todo en vacio
    */
    Cajero() throws IOException
    {
        this.baseData.leerFicherosCajas();
        this.maxSize=this.baseData.getNumeroCajas();
        this.cajas=new String[this.maxSize];
        condicion = "vacio";
        Inicializa();
    }
    
    /**
    * hace que el arreglo en todas sus pociciones contenga un String "vacio"
    */
    public void Inicializa()
    {
        for (int i=0;i<this.maxSize;i++)
        {
            this.cajas[i]=this.condicion;
        }
    }
    
    /**
    * recorre el arreglo a ver si todas las posiciones estas "ocupadas"
    * de ser asi guarda el cliente en la pos 0 del arreglo
    * si no se le ingresa un cliente tira un info en pantalla
    */
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
    
    /**
    * pone en vacio una de las posiciones del arreglo
    * si todas son "ocupado" lo hace de manera aleatoria
    */
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
    
    /**
    * devuelve el tamaño del arreglo (numero de cajas)
    */
    public int getCajas(){
        return this.maxSize;
    }
    
    /**
    *devuelve un string con las cajas y las condiciones actuales de las mismas
    */
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