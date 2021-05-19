/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.appQuanLiSach;

/**
 *
 * @author KhanhKyoS
 */
public class SGK extends Book{
    int soluong;
    int status;
    
    

    public SGK(int soluong, int status, int ms, int price, String NXB, String Name, String loai) {
        super(ms, price, NXB, Name, loai);
        this.soluong = soluong;
        this.status = status;
       
    }

    

    

    
    
    
}
