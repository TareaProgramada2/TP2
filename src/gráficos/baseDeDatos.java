package gráficos;

import java.io.*;
import gráficos.listaEnlazada;

public class baseDeDatos {
    class datosPersona
    {
        public String correo, nombre, tipo, horaIngreso, horaAtencion;
        
        public datosPersona()
        {
            correo=nombre=tipo=horaIngreso=horaAtencion=null;
        }
    }
    
    private BufferedReader almacenadorTemporalDeLectura;
    private File fichero;
    private FileReader lectorDeFichero;
    public  listaEnlazada lista = new listaEnlazada();
    
    public baseDeDatos()
    {
        this.almacenadorTemporalDeLectura = null;
        this.fichero = null;
        this.lectorDeFichero = null;
    }
    
    public void leer() throws FileNotFoundException, IOException
    {        
        this.fichero = new File ("/home/andres/NetBeansProjects/TP2/src/base de datos/1.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void almacenamientoDeDatos() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        
        this.lectorDeFichero.close();
    }
    
   
}
    

