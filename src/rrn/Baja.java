/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rrn;
import java.io.*;
import java.lang.*;

/**
 *
 * @author Luis
 */
public class Baja {
    private RandomAccessFile input;
 
    public Baja(){
        input = null;
    }
    
    public void abrir(String nomb) throws IOException{
        input = new  RandomAccessFile(nomb + ".DAT","r");
    }
    
    public void cerrar() throws IOException{
        if (input != null )
        input.close();
    }
    public void desplaza(long offset)throws IOException{
        if (input != null) input.seek(offset);
    }
    
    public Articulo leer () throws IOException, ClassNotFoundException{
        Articulo art = new Articulo();
        if (input != null) {
            try {
                art.setNombre(input.readUTF());
                art.setCodigo(input.readInt());
                art.setCosto(input.readUTF());
                art.setExistmin(input.readUTF());
                art.setExistact(input.readUTF());
                art.setRRN(input.readInt());
                  
            }
            catch (EOFException eof){ }        
        }
        return art;
    }   
}
    

