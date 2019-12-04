/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_test;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Aldyth M. V. Nahak (672017081)
 */
public class Hibernate_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Session a = connection.Controller.getSessionFactory().openSession();
        Transaction tr = a.beginTransaction();
        pojos.Customer cus = new pojos.Customer();
        

        cus.setNama("Aldyth");
        cus.setEmail("672017081@uksw.edu");
        cus.setAlamat("Manchester");
        
        pojos.Customer Aon = new pojos.Customer();

        Aon.setNama("Bethran");
        Aon.setEmail("672017000@uksw.edu");
        Aon.setAlamat("London");
        
        a.save(cus);
        a.save(Aon);
        tr.commit();
        System.out.println("Success.........");
        a.close();
        tr = null;
        
    }
    
}
