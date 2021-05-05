/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Object;

/**
 *
 * @author KhanhKyo
 */
public class Employee {
    String name,address,work;
    int PhoneNumber;

    public Employee(String name, String address, String work, int PhoneNumber) {
        this.name = name;
        this.address = address;
        this.work = work;
        this.PhoneNumber = PhoneNumber;
    }
    
    public void view(){
        System.out.println("I am a programmer!");
    }
    
}
