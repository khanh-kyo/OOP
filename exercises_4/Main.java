/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.exercises_4;
import java.util.*;
/**
 *
 * @author KhanhKyo
 */
public class Main {
    public static void main(String[] args) {
        scan scan = new scan();
        Object[][] workerInfor = scan.scanWorker();
        
    }
}
class scan {
    Scanner worker = new Scanner(System.in);
    
    public Object[][] scanWorker() {
        Object[][] workers = new Object[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap ten va luong của thanh vien thu "+ (i+1) +":");
            workers[i][0] = worker.next();
            workers[i][1] = worker.nextInt();
    
        }
        return workers;
    }
}
