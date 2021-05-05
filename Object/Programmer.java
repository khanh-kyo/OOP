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
public class Programmer extends Employee{
    String[] ProgrammingLanguage;

    public Programmer(String[] ProgrammingLanguage, String name, String address, String work, int PhoneNumber) {
        super(name, address, work, PhoneNumber);
        this.ProgrammingLanguage = ProgrammingLanguage;
    }
    
    @Override
    public void view(){
        System.out.println("Name: "+this.name+"\n"+"Address: "+this.address+"\n"+"Work: "+this.work+"\n"+"PhoneNumber: "+this.PhoneNumber+"\n"+"ProgrammingLanguage: "+this.ProgrammingLanguage[0]);
    }
}
