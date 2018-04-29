/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrn;
import java.util.*;
import java.lang.*;


/**
 *
 * @author Luis
 */
public class Consulta{
    Index inde= new Index();
    
    //El método "buscar2 realiza una búsqueda binaria para ver si en la
    //lista que se obtiene como parametro se encuentra un objeto con las
    //características obtenidas como parámetro, en este caso el "código".
    
    public int buscar( Index ind, int cod) {
        inde = ind;
        int inicio = 0;
        int fin = inde.getArticulos().size()-1;
        int pos;
       
       
        while (inicio <= fin ) {
            pos = (inicio+fin) / 2; 
            
            if (((Articulo)inde.getArticulos().get(pos)).getCodigo() == cod){    
                return ((Articulo)getInde().getArticulos().get(pos)).getRRN();
            }    
            else if (((Articulo)inde.getArticulos().get(pos)).getCodigo() > cod ) {   
                inicio = pos+1;
            }   
            else if(((Articulo)inde.getArticulos().get(pos)).getCodigo() < cod ){
                fin = pos-1;    
            }
        }
        
        return -1; 
 }

    /**
     * @return the articulos
     */
    public Index getArt() {
        return getInde();
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArt(Index inde) {
        this.setInde(inde);
    }

    /**
     * @return the inde
     */
    public Index getInde() {
        return inde;
    }

    /**
     * @param inde the inde to set
     */
    public void setInde(Index inde) {
        this.inde = inde;
    }

    
}
