/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Polymophism;

/**
 *
 * @author KhanhKyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Manager ma =new Manager();
       ma.getReaders();
        System.out.println(ma.calculateSum());
       
        
    }
    
}
