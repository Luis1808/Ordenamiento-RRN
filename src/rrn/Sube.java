/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrn;
import java.io.*;
import java.lang.*;
import java.util.*;


/**
 *
 * @author Luis
 */
public class Sube{
    private RandomAccessFile output;

    public void abrir(String nomb) throws IOException {
        output = new RandomAccessFile( nomb + ".DAT","rw");
    }
    public void cerrar() throws IOException {
        if (output != null) output.close();
    }    
    
     public void desplaza(long offset)throws IOException{
        if (output != null) output.seek(offset);
    }

    public void escribir (ArrayList list) throws IOException {
       
        if (output != null) {
            for(int i = 0; i <= list.size()-1; i++){     
                
            output.writeUTF(((Articulo)list.get(i)).getNombre());
            output.writeInt(((Articulo)list.get(i)).getCodigo());
            output.writeUTF(((Articulo)list.get(i)).getCosto());
            output.writeUTF(((Articulo)list.get(i)).getExistmin());
            output.writeUTF(((Articulo)list.get(i)).getExistact()); 
            output.writeInt(((Articulo)list.get(i)).getRRN());
            
            }           
        }
    }                                       
}

  
