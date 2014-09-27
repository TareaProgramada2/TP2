package gráficos;

import java.io.*;

public class baseDeDatos {
    private BufferedReader almacenadorTemporalDeLectura;
    private File fichero;
    private FileReader lectorDeFichero;
    
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
        this.almacenadorTemporalDeLectura.readLine();
        this.lectorDeFichero.close();
    }
    
   
}
    

