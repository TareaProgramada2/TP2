/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gráficos;

/**
 *
 * @author kenneth
 */
public class Cajero {
    public String condicion;
    Cajero(){
        condicion = "vacio";
    }
    public void setCondicion(){
        if ("vacio".equals(condicion)){
            condicion = "ocupado";
        }
        else{
            condicion = "vacio";
        }
    }
    public String getCondicion(){
        return condicion;
    }
}