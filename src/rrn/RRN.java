/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rrn;
import java.util.*;
import java.io.*;
/**
 *
 * @author Luis
 */
public class RRN {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {                                
        Articulo artaux = new Articulo();
        Scanner sc = new Scanner(System.in);
        Index index = new Index();       
        Consulta consulta = new Consulta();        
        int codigo;                                               
        int rrn; 
        
                        Articulo art1 = new Articulo("Filtro de agua        ", 3290, "1000", "5000", "13568");       
                        Articulo art2 = new Articulo("Taladro               ", 1890, "1815", "0300", "02569");                               
                        Articulo art3 = new Articulo("Voltimetro            ", 3508, "1280", "0300", "02598");       
                        Articulo art4 = new Articulo("Mezcladora de cartucho", 4596, "1760", "0005", "00236");
       
                                
              
                        art1.setRRN(0);       
                        art2.setRRN(1);       
                        art3.setRRN(2);       
                        art4.setRRN(3);
       
       
                        
                        ArrayList arreglo = new ArrayList();       
                        arreglo.add(art1);       
                        arreglo.add(art2);       
                        arreglo.add(art3);       
                        arreglo.add(art4);
                       
                        Sube sube = new Sube();

                        try{          
                            sube.abrir("Archivo");          
                            sube.escribir(arreglo);          
                            sube.cerrar();      
                        }catch (IOException e){}
                              
                        index.indexacion(art1);      
                        index.indexacion(art2);      
                        index.indexacion(art3);      
                        index.indexacion(art4);
                        
      
                        System.out.println(" Escribe el codigo a buscar ");
                        codigo = sc.nextInt();                      
                        
                        rrn = consulta.buscar(index, codigo);  
                        
                        System.out.println(rrn);
                        
                        if(rrn == -1){
                            System.out.println(" El codigo no existe ");
                        }else{                                                    
                        
                        Baja baja = new Baja();            
                        
                        try{   
                            baja.abrir("Archivo");    
                            baja.desplaza(rrn*51);    
                            artaux = baja.leer();    
                            System.out.println(artaux);            
                        }catch (IOException e){}    
                        catch(ClassNotFoundException z){}                                                                                                                                                                         
                        }
        
        sc.close();
        
              
    }
}
