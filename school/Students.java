/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.school;

import java.util.Scanner;

/**
 *
 * @author KhanhKyo
 */
public class Students {
     private String Fullname;
    private String Address;
    private int Phone;
    private float Amount;
    private float Percentage_of_discount;
    private float tax;

    public Students(String Fullname, String Address, int Phone, float Amount, float Percentage_of_discount, float tax) {
        this.Fullname = Fullname;
        this.Address = Address;
        this.Phone = Phone;
        this.Amount = Amount;
        this.Percentage_of_discount = Percentage_of_discount;
        this.tax = tax;
    }
    Scanner scan = new Scanner(System.in);

    

    /**
     *
     * @param FullName
     * @return
     */
    public String scanName(String FullName) {
        System.out.println("Nhap ten: ");
        this.Fullname = scan.nextLine();
         return null;
        
    }
    }
    

