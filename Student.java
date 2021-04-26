/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;
import java.util.*;
/**
 *
 * @author KhanhKyo
 */

public class Student {
    
    public static void main(String[] args) {
//        String FirstName;
//        String LastName;
//        int age ;
//        Float c;
//        Float php;
        Input sv = new Input();
        sv.Inputs();
        sv.sayHello();
        sv.Score();
    }
    }
    
   

 class Input{
     String FirstName;
        String LastName;
        int age ;
        Float c;
        Float php;
//        Input(String FirstName,String LastName,int age ,Float c,Float php){
//        this.FirstName = FirstName;
//        this.LastName = LastName;
//        this.age = age;
//        this.c = c;
//        this.php = php;
//        }
        public void Inputs(){
        Scanner Input = new Scanner(System.in);
        System.out.print("First name : ");
        this.FirstName = Input.nextLine();
        System.out.print("Last name : ");
        this.LastName = Input.nextLine();
        System.out.print("Age : ");
        this.age = Input.nextInt();
        System.out.println("\nNhập điểm C: ");
         this.c=Input.nextFloat();
        System.out.println("Nhập điểm PHP: \n");
         this.php=Input.nextFloat();
        }
    
        public void sayHello() {
      System.out.println("Xin chao : " + this.FirstName +" "+ this.LastName);
    }
        public void Score(){
        float avg = (this.c + this.php) / 2;
        System.out.println("Diem trung binh: " + avg);
        System.out.print("Xep loai: ");
        if (avg >= 8) {
            System.out.println("Gioi");
        } else if (avg >= 6) {
            System.out.println("Kha");
        } else if (avg >= 5) {
            System.out.println("Trung Binh");
        } else {
            System.out.println("Yeu");
        }
       
    }
}


//class Students {
//    String FirstName;
//    String LastName;
//    int Age;
//    Students(String FirstName, String LastName, int Age) {
//      this.FirstName = FirstName;
//      this.LastName = LastName;
//      this.Age = Age;
//      
//    }
//    public void sayHello() {
//      System.out.println("Xin chao : " + this.FirstName +" "+ this.LastName);
//    }
//  }
//
//class Result {
//    Float c,php;
//    Result(Float c,Float php){
//        this.c = c;
//        this.php = php;
//    }
//    public void Score(){
//        float avg = (this.c + this.php) / 2;
//        System.out.println("Diem trung binh: " + avg);
//        System.out.print("Xep loai: ");
//        if (avg >= 8) {
//            System.out.println("Gioi");
//        } else if (avg >= 6) {
//            System.out.println("Kha");
//        } else if (avg >= 5) {
//            System.out.println("Trung Binh");
//        } else {
//            System.out.println("Yeu");
//        }
//       
//    }
//}

    
    









 
