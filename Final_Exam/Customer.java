/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Final_Exam;

import java.util.Scanner;

/**
 *
 * @author KhanhKyo
 */
public class Customer {
    String Fullname;
    String Address;
    int Phone;
    float Amount;
    float Percentage_of_discount;
    float tax;
    

//    Customer(String Fullname, String Address, int Phone, float Amount, float Percentage_of_discount, float tax) {
//        this.Fullname = Fullname;
//        this.Address = Address;
//        this.Phone = Phone;
//        this.Amount = Amount;
//        this.Percentage_of_discount = Percentage_of_discount;
//        this.tax = tax;
//    }

    Scanner scan = new Scanner(System.in);
    
    public String scanName() {
        System.out.println("Nhap ten: ");
        Fullname= scan.nextLine();
        return null;
        
    }
    public String scanAdd(){
        System.out.println("Nhap dia chi: ");
        Address= scan.nextLine();
        return null;
    }
    public int scanPhone(){
        System.out.println("Nhap Phone: ");
        Phone = scan.nextInt();
        return 0;
        
    }
    public Float scanAmount(){
        System.out.println("Nhap so tien: ");
        Amount =  scan.nextFloat();
        return null;
    }
    public Float scanPOD(){
        System.out.println("Nhap phan tram chiet khau: ");
         Percentage_of_discount = scan.nextFloat();
        return null;
    }public Float scanTax(){
        System.out.println("Nhap phan tram thue: ");
        tax=  scan.nextFloat();
        return null;
    }
    
    
   
    public void view() {
      System.out.println("Name: "+this.Fullname+"\n"+"Address: "+this.Address+"\n"+"Phone: "+this.Phone );
    }
   public float CalculateTheAmount(){
       float sum = 0.0f;
        sum = Amount-((tax+Percentage_of_discount)*1/100)*Amount;
        return sum;
   }
     

}
    

    

   
    
    
    

