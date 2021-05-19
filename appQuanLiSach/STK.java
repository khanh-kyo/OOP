/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.appQuanLiSach;

/**
 *
 * @author KhanhKyo
 */
public class STK extends Book{
    private int soluong;
    private String author;

    public STK(int soluong, String author, int ms, int price, String NXB, String Name, String loai) {
        super(ms, price, NXB, Name, loai);
        this.soluong = soluong;
        this.author = author;
    }

    

    
}
