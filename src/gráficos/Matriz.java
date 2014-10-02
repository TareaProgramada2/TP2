package gráficos;

public class Matriz 
{
    String [][] matriz; 
    int columnasNum, filasNum ;
    String [] fila;
    
    public Matriz ()
    {
        matriz = new String [999999][5];
        fila = new String [5];
        filasNum = columnasNum =0;
    }
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
    
    public String[][] getMatriz()
    {
        return matriz;
    }
    
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