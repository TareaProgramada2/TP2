package gráficos;

import java.util.*;
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
    public Calendar fechaYhora = new GregorianCalendar();
    public int Hora;
    public int Minutos;
    public int Dia;
    public int Mes;
    public int Año;
    
    public String getHora()
    {
        this.Hora = this.fechaYhora.get(Calendar.HOUR_OF_DAY);
        this.Minutos = this.fechaYhora.get(Calendar.MINUTE);
        String hor = Hora+""+":"+Minutos+"";
        return hor;
    }
    
    public String getFecha()
    {
        this.Año = this.fechaYhora.get(Calendar.YEAR);
        this.Mes = (this.fechaYhora.get(Calendar.MONTH)+1);
        this.Dia = this.fechaYhora.get(Calendar.DAY_OF_MONTH);
        String fecha = Dia+""+"/"+Mes+""+"/"+Año+"";
        return fecha;
    }
    
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
        this.fichero = new File ("base de datos/5.txt");
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
        String aux = getHora();
        dato = dato + "," + aux;
        aux = getFecha();
        dato = dato + "," + aux +",#";
        this.escritorDeArchivos = new FileWriter("base de datos/5.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(dato);
        this.escritorDeArchivos.close();
    }
    
    public void almacenarFicherosHoraAtencion(String dato) throws IOException
    {
        String aux = getHora();
        dato = aux +"," + dato;
        aux = getFecha();
        dato = dato + "," + aux +",#";
        this.escritorDeArchivos = new FileWriter("base de datos/6.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println( dato );
        this.escritorDeArchivos.close();
    }
    public void almacenarnNombreyLogo(String nombre,String ruta) throws IOException
    {
        this.escritorDeArchivos = new FileWriter("base de datos/nombreYlogo.txt");
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(nombre +  "," + ruta+  ",#");
        this.escritorDeArchivos.close();
    }
    
}
    

