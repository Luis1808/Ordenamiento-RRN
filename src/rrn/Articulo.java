/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrn;

/**
 *
 * @author Luis
 */
public class Articulo {
    private String nombre;
    private int codigo;
    private String costo;
    private String existmin;
    private String existact;
    private int RRN;

    Articulo(){
        nombre = null;
        codigo = 0;
        costo = null;
        existmin = null;
        existact = null;
        RRN = 0;
    }
    
    Articulo(String nomb, int cod, String cost, String em, String ea){
        nombre = nomb;
        codigo = cod;
        costo = cost;
        existmin = em;
        existact = ea;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * @return the costo
     */
    public String getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

    /**
     * @return the existmin
     */
    public String getExistmin() {
        return existmin;
    }

    /**
     * @param existmin the existmin to set
     */
    public void setExistmin(String existmin) {
        this.existmin = existmin;
    }

    /**
     * @return the existact
     */
    public String getExistact() {
        return existact;
    }

    /**
     * @param existact the existact to set
     */
    public void setExistact(String existact) {
        this.existact = existact;
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
    
    public String toString(){
        String cadArt = "";
        
        cadArt += "Nombre: " + nombre + "\n";
        cadArt += "Codigo: " + codigo + "\n";
        cadArt += "Costo: " + costo + "\n";
        cadArt += "Existencias minimas: " + existmin + "\n";
        cadArt += "Existencias actuales: " + existact + "\n";
        
        cadArt += "RRN: " + RRN;
        
        return cadArt;
    } 

   
}
