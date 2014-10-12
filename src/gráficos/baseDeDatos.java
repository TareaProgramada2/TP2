package gráficos;

import java.util.*;
import java.io.*;
import gráficos.Matriz;

public class baseDeDatos 
{ 
    public BufferedReader almacenadorTemporalDeLectura;
    public File fichero;
    public FileReader lectorDeFichero;
    public FileWriter escritorDeArchivos;
    public PrintWriter impresorDeArchibos;
    public Matriz matrizClientes = new Matriz();
    public Calendar fechaYhora = new GregorianCalendar();
    public int Hora;
    public int Minutos;
    public int Dia;
    public int Mes;
    public int Año;
    String [] generica = new String [8];
    
    public String getHora()
    {
        this.Hora = this.fechaYhora.get(Calendar.HOUR_OF_DAY);
        this.Minutos = this.fechaYhora.get(Calendar.MINUTE);  
        String hor  = Integer.toString(Hora);
        hor = hor+":";
        hor = hor + Integer.toString(Minutos);
        return hor;
    }
    
    public String getFecha()
    {
        this.Año = this.fechaYhora.get(Calendar.YEAR);
        this.Mes = (this.fechaYhora.get(Calendar.MONTH)+1);
        this.Dia = this.fechaYhora.get(Calendar.DAY_OF_MONTH);
        String fecha  = Integer.toString(Dia);
        fecha = fecha+"/";
        fecha = fecha + Integer.toString(Mes);
        fecha = fecha+"/";
        fecha = fecha + Integer.toString(Año);
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
    
    public void leerFicherosClientes() throws FileNotFoundException, IOException
    {        
        this.fichero = new File ("src/base de datos/cliente.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void leerFicherosHoraAtencion() throws FileNotFoundException, IOException
    {        
        this.fichero = new File ("src/base de datos/atendidos.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void leerFicherosNombreLogo() throws FileNotFoundException, IOException
    {        
        this.fichero = new File ("src/base de datos/nombreYlogo.txt");
        this.lectorDeFichero = new FileReader (this.fichero);
    }
    
    public void listaNombreLogo() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        int aux=0;
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
                    this.generica[aux]=(linea);
                    linea="";
                    aux++;
                }    
            }
        }
        this.lectorDeFichero.close();
        char[] arregloLinea = this.generica[1].toCharArray();
            linea="";
        
        for(int ind = 0; ind < arregloLinea.length +1 ; ind++ )
        {
                
            if(arregloLinea[ind]=='.')
            {
                linea = linea + ".jpg";
                this.generica[aux]=(linea);
                break;
            }
            if(arregloLinea[ind] != '/')
            {
                linea = linea + arregloLinea[ind] + "";
            }
            else
            {
                linea="";
            }
        }    
    }
    
    public void listaParaGraficosPorPrioridad() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        int aux=0;
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
                    this.generica[aux]=(linea);
                    linea="";
                    aux++;
                }    
            }
        }
        this.lectorDeFichero.close();
            
    }
    
    
    public String getRutLogo()
    {
        return this.generica[1];
    }
    String getLogo()
    {
        return this.generica[2];
    }
    public int[] listaDeDatos() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        int[] datos= new int[5];
        int a,b,c,d,e;
        a=b=c=d=e=0;
        while((linea=this.almacenadorTemporalDeLectura.readLine()) != null)
        {
            char[] arregloLinea = linea.toCharArray();
            linea="";
            if(arregloLinea[0]=='1')
            {
                a++;
            }
            else if(arregloLinea[0]=='2')
            {
                b++;
            }
            else if(arregloLinea[0]=='3')
            {
                c++;
            }
            else if(arregloLinea[0]=='4')
            {
                d++;
            }
            else if(arregloLinea[0]=='5')
            {
                e++;
            }
        }
        datos[0]=a;
        datos[1]=b;
        datos[2]=c;
        datos[3]=d;
        datos[4]=e;
        this.lectorDeFichero.close();
        return datos;
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
        String aux="";
        aux = dato +","+ getHora();
        aux = aux +","+ getFecha() +",#";
        this.escritorDeArchivos = new FileWriter("src/base de datos/cliente.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(aux);
        this.escritorDeArchivos.close();
    }
    
    public void almacenarFicherosHoraAtencion(String dato) throws IOException
    {
        String aux= dato+","+getFecha();
        aux= aux+","+getHora()+",#";
        this.escritorDeArchivos = new FileWriter("src/base de datos/atendidos.txt",true);
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println( aux );
        this.escritorDeArchivos.close();
    }
    public void almacenarnNombreyLogo(String nombre,String ruta) throws IOException
    {
        this.escritorDeArchivos = new FileWriter("src/base de datos/nombreYlogo.txt");
        this.impresorDeArchibos = new PrintWriter(this.escritorDeArchivos);
        this.impresorDeArchibos.println(nombre +  "," + ruta+  ",#");
        this.escritorDeArchivos.close();
    }   
}
