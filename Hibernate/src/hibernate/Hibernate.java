/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Session s = connection.connection.getSessionFactory().openSession();
        Transaction tr = s.beginTransaction();
        pojos.Customers cus = new pojos.Customers();
        
        cus.setNama("Aldyth");
        cus.setEmail("672017@uksw.edu");
        cus.setAlamat("Manchester");
        
        s.save(cus);
        tr.commit();
        System.out.println("Success.........");
        s.close();
        tr = null;
        
        String[] kalimat1 = new String[20];
        
        System.out.println("Rental Kamera");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
    
        System.out.print("1.input sewa\n ");
        System.out.print("2.update\n");
        System.out.print("3.delete\n");
        System.out.print("(untuk berhenti tekan nomor lain selain yang tertera)\n");
        System.out.print("________________________\n");
        System.out.print("masukan pilihan: ");
        int pilihan = input.nextInt();
        System.out.print("________________________\n");
        
          switch(pilihan){
            
 case 1:
         System.out.println("masukan nama");
          
          
          }
    }
    
}
