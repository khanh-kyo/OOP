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
public class Engineer extends User{
        private int duration;
        private float unitPrice=50_000f;

    

    public Engineer(int duration, int id, String name, String email) {
        super(id, name, email);
        this.duration = duration;
    }

    @Override
    public float calculateFee() {
       return (this.duration * this.unitPrice);
    }
        
        
}
