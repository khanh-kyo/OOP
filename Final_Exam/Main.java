/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Final_Exam;



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
        
        Customer cu = new Customer();
        cu.scanName();
        cu.scanAdd();
        cu.scanPhone();
        cu.scanAmount();
        cu.scanTax();
        cu.scanPOD();
        cu.view();
        System.out.println("\n"+"Amount: "+cu.CalculateTheAmount());
                
        
        
        
        
    }
    
}
