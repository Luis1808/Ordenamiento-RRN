/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrn;
import java.util.*;

/**
 *
 * @author Luis
 */
public class Index extends ArrayList {
    
    private ArrayList articulos = new ArrayList();
    private int codigo;
    private int RRN;   
    
    //El método indexacion ordena los articulos que se reciben como parámetro,
    //los ordena en una lista la cual swe retornará con el metodo getArticulos.
    
    public void indexacion(Articulo art){
        articulos.add(art);
          
 boolean swapped = true;
      int j = 0;
      Articulo tmp;
      
      while (swapped) {
            swapped = false;
          
            for (int i = 0; i < getArticulos().size()-1; i++) {                                       
                  if (((Articulo)getArticulos().get(i)).getCodigo() < ((Articulo) getArticulos().get(i+1)).getCodigo()) {                          
                        tmp = (Articulo)getArticulos().get(i);
                        getArticulos().set(i,(Articulo) getArticulos().get(i+1));
                        getArticulos().set(i+1, tmp);
                        swapped = true;
                  }else{
                      
                  }      
            }                    
      }
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the RRN
     */
    public int getRRN() {
        return RRN;
    }

    /**
     * @param RRN the RRN to set
     */
    public void setRRN(int RRN) {
        this.RRN = RRN;
    }

    /**
     * @return the articulos
     */
    public ArrayList getArticulos() {
        return articulos;
    }

    /**
     * @param articulos the articulos to set
     */
    public void setArticulos(ArrayList articulos) {
        this.articulos = articulos;
    }
    
    public Integer getTam(){
        return articulos.size()-1;
    }
    
    public String toString(){
        String cadind = "";
        for(int i = 0; i <= articulos.size()-1; i++){        
            cadind += "    -Articulo-   " + "\n" 
                   + articulos.get(i) + "\n" 
                   + "_____________________" + "\n"; 
        }
        
        return cadind;
    }

}
