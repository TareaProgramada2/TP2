/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

import java.io.*;

public class Txt {
    public void leer() throws FileNotFoundException, IOException
    {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
 
     
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
        archivo = new File ("/home/andres/Documento sin título.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
 
         // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null)
        System.out.println(linea);
    
     
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta
         // una excepcion.
                         
        if( null != fr ){  
            fr.close();    
        }                 
        
     
         }
      
    }
    

