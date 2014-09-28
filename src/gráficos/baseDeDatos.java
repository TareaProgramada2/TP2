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
    private FileWriter escritorDeArchivos;
    public PrintWriter impresorDeArchibos;
    public listaEnlazada lista = new listaEnlazada();
    
    public baseDeDatos()
    {
        this.almacenadorTemporalDeLectura = null;
        this.fichero = null;
        this.lectorDeFichero = null;
        this.escritorDeArchivos = null;
        this.impresorDeArchibos = null;
    }
    
    public void leerFicheros() throws FileNotFoundException, IOException
    {        
        this.fichero = new File ("/home/andres/NetBeansProjects/TP2/src/base de datos/1.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void almacenamientoDeDatos() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        int contadorAuxiliar = 0;
        datosPersona persona = new datosPersona();
        String linea = "";
        
        while((linea=this.almacenadorTemporalDeLectura.readLine()) != null)
        {
            switch(contadorAuxiliar)
            {
                case 0:
                    persona.correo = linea;
                    break;
                case 1:
                    persona.nombre = linea;
                    break;
                case 3:
                    persona.tipo = linea;
                    break;
                case 4:
                    persona.horaIngreso = linea;
                    break;
                case 5:
                    persona.horaAtencion = linea;
                    break;
            }
            contadorAuxiliar++;
            if (contadorAuxiliar==6)
            {
                this.lista.add(persona);
                contadorAuxiliar = 0;
            }
        }
        this.lectorDeFichero.close();
    }
    
    public listaEnlazada getDatos()
    {
        return this.lista;
    }
    
    public void almacenarFicheros() throws IOException
    {
        this.escritorDeArchivos = new FileWriter("/home/andres/NetBeansProjects/TP2/src/base de datos/1.txt");
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        for (int i = 0; i < 10; i++)
            this.impresorDeArchibos.println("Linea " + i);
        this.escritorDeArchivos.close();
    } 
}
    

