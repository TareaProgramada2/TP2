package gráficos;

public class Matriz 
{
     /**
    * atributos de la clase
    */
    String [][] matriz; 
    int columnasNum, filasNum ;
    String [] fila;
    
     /**
    * se dan valores iniciales a los atributos
    */
    public Matriz ()
    {
        matriz = new String [999999][5];
        fila = new String [5];
        filasNum = columnasNum =0;
    }
     /**
    * agrega segun fila o columna por orden
    */
    public void add(String dato)
    {
        if(columnasNum == 4)
        {
            matriz[filasNum][columnasNum] = dato;
            columnasNum = 0;
            filasNum ++;
        }
        else
        {
            matriz[filasNum][columnasNum] = dato;
            columnasNum ++;
        }
    }
    
     /**
    * retorna un valor segun el indice
    */
    public String[] getFila(int indice)
    {
        for(int i=0;i>filasNum;i++)
        {
            for(int j=0;j==4;j++)
            {
                fila[j] = matriz[i][j];
            }
        }
        return fila;
    }
    
     /**
    * devuelve la matriz de String
    */
    public String[][] getMatriz()
    {
        return matriz;
    }
    
     /**
    * imprime matriz por filas y columnas 
    */
    public void imprimir ()
    {
        for(int i=0;i<filasNum;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(matriz[i][j]);
            }
        }
    }
    
    
}