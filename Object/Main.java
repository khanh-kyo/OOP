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
public class Main {
    public static void main(String[] args) {
        
        Employee Em=new Employee("AB","HA NOI","Programmer",1234567);
        Em.view();
        Programmer pr = new Programmer(new String[] {"Java"},"AB","HA NOI","Programmer",1234567);
        pr.view();
    }
}
