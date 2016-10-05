package primitivewriteutf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author oracle
 */
public class PrimitiveWriteUTF {

    public static void main(String[] args){
       
        
        File fichero=new File("text3.txt");
        try {
            fichero.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream(fichero));
            try {
                escribir.writeUTF("esta e unha cadea\n");
                System.out.println("Escribiu "+escribir.size()+" bytes");
                escribir.writeUTF("esta e unha cadea\n");
                
                
                escribir.close();
           } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        DataInputStream leer;
        try {
            leer = new DataInputStream(new FileInputStream(fichero));
            while(leer.available()!=0){
            System.out.println("Quedan "+leer.available()+" bytes");    
            System.out.println(leer.readUTF());
            
                }
                leer.close();
            
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
               
            
           
        }
        }
        
    }
    

