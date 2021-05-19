/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.appQuanLiSach;

import java.sql.*;
import java.util.*;

/**
 * /**
 *
 * @author KhanhKyo
 */
public class Main {
private Object b;
    public static void main(String[] args) {
        // TODO code application logic here

        DatabaseConnect dc = new DatabaseConnect("localhost", "oop", "root", "");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        ArrayList<Book> arrBooks = null;
        Book b = null;
        String loai = null;
        SGK sgk = null;
        TapChi tt = null;
        STK stk = null;
        try {
            arrBooks = new ArrayList<Book>();
            connection = dc.getConnection();

            statement = connection.createStatement();

            String sql = "SELECT * FROM book";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                loai = resultSet.getString("type");

                if (loai.indexOf("SGK") != -1) {
                    b = new SGK(resultSet.getInt("soluong"),resultSet.getInt("status"),resultSet.getInt("MS"), resultSet.getInt("price"),resultSet.getString("NXB"), resultSet.getString("name"),    resultSet.getString("type"));
                }
                if(loai.indexOf("TT")!=-1) {
                    b = new TapChi(resultSet.getInt("MS"),resultSet.getInt("price"), resultSet.getString("NXB"), resultSet.getString("name"),resultSet.getString("type"));
                }
                if(loai.indexOf("STK")!=-1) {
                    b = new STK(resultSet.getInt("soluong"),resultSet.getString("author"),resultSet.getInt("MS"), resultSet.getInt("price"),resultSet.getString("NXB"), resultSet.getString("name"),resultSet.getString("type"));
                }

                arrBooks.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close(connection, statement, resultSet);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            
        }

    
    String status = null;
    int price=0;

for(int i = 0; i < arrBooks.size ();i++){
            b = arrBooks.get(i);
        if( b.loai.contains("SGK")){
            sgk = (SGK) arrBooks.get(i);
            if(sgk.status == 1){
                status = "moi";
                price=sgk.price;
            }else{
                status = "cu";
                price=sgk.price/2;
            }
            
            System.out.println(sgk.ms+" "+ sgk.Name+" "+sgk.NXB+" "+sgk.soluong+" "+price+" "+status);
        } else {
        }
        if (b.loai.contains("TT")) {
            tt = (TapChi) arrBooks.get(i);
            System.out.println(tt.ms+" "+tt.Name+" "+tt.NXB+" "+tt.price);
        }
        if (b.loai.contains("STK")) {
            stk = (STK) arrBooks.get(i);
            price=stk.price+(stk.price)/1/10;
            System.out.println(stk.ms+" "+stk.Name+" "+stk.NXB+" "+price);
        }
    }
}

private static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
