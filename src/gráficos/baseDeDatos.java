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
    
    public int[] lis() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        int[] datos= new int[31];
        int aux=0;
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31;
        a1=a2=a3=a4=a5=a6=a7=a8=a9=a10=a11=a12=a13=a14=a15=a16=a17=a18=a19=a20=a21=a22=a23=a24=a25=a26=a27=a28=a29=a30=a31=0;
        while((linea=this.almacenadorTemporalDeLectura.readLine()) != null)
        {
            char[] arregloLinea = linea.toCharArray();
            linea="";
            for(int ind = 0; ind < arregloLinea.length +1 ; ind++ )
            {
                
                if(arregloLinea[ind]=='/')
                {
                    if(linea=="1")
                    {
                        a1++;
                    }
                    else if (linea=="2")
                    {
                        a2++;
                    }
                    else if (linea=="3")
                    {
                        a3++;
                    }
                    else if (linea=="4")
                    {
                        a4++;
                    }
                    else if (linea=="5")
                    {
                        a5++;
                    }
                    else if (linea=="6")
                    {
                        a6++;
                    }
                    else if (linea=="7")
                    {
                        a7++;
                    }
                    else if (linea=="8")
                    {
                        a8++;
                    }
                    else if (linea=="9")
                    {
                        a9++;
                    }
                    else if (linea=="10")
                    {
                        a10++;
                    }
                    else if (linea=="11")
                    {
                        a11++;
                    }
                    else if (linea=="12")
                    {
                        a12++;
                    }
                    else if (linea=="13")
                    {
                        a13++;
                    }
                    else if (linea=="14")
                    {
                        a14++;
                    }
                    else if (linea=="15")
                    {
                        a15++;
                    }
                    else if (linea=="16")
                    {
                        a16++;
                    }
                    else if (linea=="17")
                    {
                        a17++;
                    }
                    else if (linea=="18")
                    {
                        a18++;
                    }
                    else if (linea=="19")
                    {
                        a19++;
                    }
                    else if (linea=="20")
                    {
                        a20++;
                    }
                    else if (linea=="21")
                    {
                        a21++;
                    }
                    else if (linea=="22")
                    {
                        a22++;
                    }
                    else if (linea=="23")
                    {
                        a23++;
                    }
                    else if (linea=="24")
                    {
                        a24++;
                    }
                    else if (linea=="25")
                    {
                        a25++;
                    }
                    else if (linea=="26")
                    {
                        a26++;
                    }
                    else if (linea=="27")
                    {
                        a27++;
                    }
                    else if (linea=="28")
                    {
                        a28++;
                    }
                    else if (linea=="29")
                    {
                        a29++;
                    }
                    else if (linea=="30")
                    {
                        a30++;
                    }
                    else if (linea=="31")
                    {
                        a31++;
                    }
                    
                    break;
                }
                if(arregloLinea[ind] != ',')
                {
                    linea = linea + arregloLinea[ind] + "";
                }
                else
                {
                    linea="";
                }    
            }
        }
        this.lectorDeFichero.close();
        datos[0]=a1;
        datos[1]=a2;
        datos[2]=a3;
        datos[3]=a4;
        datos[4]=a5;
        datos[5]=a6;
        datos[6]=a7;
        datos[7]=a8;
        datos[8]=a9;
        datos[9]=a10;
        datos[10]=a11;
        datos[11]=a12;
        datos[12]=a13;
        datos[13]=a14;
        datos[14]=a15;
        datos[15]=a16;
        datos[16]=a17;
        datos[17]=a18;
        datos[18]=a19;
        datos[19]=a20;
        datos[20]=a21;
        datos[21]=a22;
        datos[22]=a23;
        datos[23]=a24;
        datos[24]=a25;
        datos[25]=a26;
        datos[26]=a27;
        datos[27]=a28;
        datos[28]=a29;
        datos[29]=a30;
        datos[30]=a31;
        return datos;
    }
    
    
    public String getRutLogo()
    {
        return this.generica[1];
    }
    String getLogo()
    {
        return this.generica[2];
    }
    public int[] listaParaGraficosPorPrioridad() throws IOException
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
    public int[] listaGraficosHora() throws IOException
    {
        this.almacenadorTemporalDeLectura = new BufferedReader(this.lectorDeFichero);
        String linea = "";
        int aux=0;
        int[] datos= new int[10];
        int hora;
        int a,b,c,d,e,f,g,h,i,j;
        a=b=c=d=e=f=g=h=i=j=0;
        while((linea=this.almacenadorTemporalDeLectura.readLine()) != null)
        {
            char[] arregloLinea = linea.toCharArray();
            linea="";
            
            for(int ind = 0; ind < arregloLinea.length +1 ; ind++ )
            {
                
                if(arregloLinea[ind]==':')
                {
                    hora=Integer.parseInt(linea);
                    switch(hora){
                        case 7:
                            a++;
                            break;
                        case 8:
                            b++;
                            break;
                        case 9:
                            c++;
                            break;
                        case 10:
                            d++;
                            break;
                        case 11:
                            e++;
                            break;
                        case 12:
                            f++;
                            break;
                        case 1:
                            g++;
                            break;
                        case 2:
                            h++;
                            break;
                        case 3:
                            i++;
                            break;
                        case 4:
                            j++;
                            break;                                                                         
                    }                                       
                    break;
                }
                if(arregloLinea[ind] != ',')
                {
                    linea = linea + arregloLinea[ind] + "";
                }
                else
                {
                    linea="";
                }    
            }
        }
        datos[0]=a;
        datos[1]=b;
        datos[2]=c;
        datos[3]=d;
        datos[4]=e;
        datos[5]=f;
        datos[6]=g;
        datos[7]=h;
        datos[8]=i;
        datos[9]=j;       
        this.lectorDeFichero.close();
        return datos;
    
    }
    
     public void listaDeDatosClientes() throws IOException
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
