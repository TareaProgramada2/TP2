package gráficos;

import java.io.*;
import gráficos.Matriz;

public class baseDeDatos 
{ 
    private BufferedReader almacenadorTemporalDeLectura;
    private File fichero;
    private FileReader lectorDeFichero;
    private FileWriter escritorDeArchivos;
    public PrintWriter impresorDeArchibos;
    public Matriz matrizClientes = new Matriz();
    
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
        this.fichero = new File ("/home/andres/NetBeansProjects/TP2/src/base de datos/5.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void listaDeDatos() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        
        while((linea=this.almacenadorTemporalDeLectura.readLine()) != null)
        {
            char[] arregloLinea = linea.toCharArray();
            linea="";
            for(int ind = 0; ind < arregloLinea.length +1 ; ind++ )
            {
                
                if(arregloLinea[ind]=='#')
                {
                    break;
                }
                if(arregloLinea[ind] != ',')
                {
                    linea = linea + arregloLinea[ind] + "";
                }
                else
                {
                    this.matrizClientes.add(linea);
                    linea="";
                }    
            }
        }
        this.lectorDeFichero.close();
    }
    
    public String[][] getDatos()
    {
        return this.matrizClientes.getMatriz();
    }
    
    public void imprimirDatos()
    {
        this.matrizClientes.imprimir();
    }
    
    public void almacenarFicherosClientes(String dato) throws IOException
    {
        this.escritorDeArchivos = new FileWriter("/home/andres/NetBeansProjects/TP2/src/base de datos/5.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(dato);
        this.escritorDeArchivos.close();
    }
    
    public void almacenarFicherosHoraAtencion(String dato,int prioridad,String fecha) throws IOException
    {
        this.escritorDeArchivos = new FileWriter("/home/andres/NetBeansProjects/TP2/src/base de datos/6.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(dato + "," + prioridad + "," + fecha);
        this.escritorDeArchivos.close();
    }
    public void almacenarnNombreyLogo(String nombre,String logo) throws IOException
    {
        this.escritorDeArchivos = new FileWriter("/home/andres/NetBeansProjects/TP2/src/base de datos/nombreylogo.txt");
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(nombre +  "," + logo);
        this.escritorDeArchivos.close();
    }
}
    

