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
public class Student extends User{

   
    
public Student(int id, String name, String email) {
        super(id, name, email);
        
    }
    
    @Override
    public float calculateFee(){
        return 20_000f;
    }
    
    
}
