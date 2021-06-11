/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Polymophism;

import OOP.appQuanLiSach.DatabaseConnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author KhanhKyo
 */
public class Manager {
    private final List<User> listReaders=new ArrayList<>();
    
    public List<User> getReaders(){
        DatabaseConnect dc = new DatabaseConnect("localhost", "db2_students", "root", "");
        
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = dc.getConnection();
            statement = connection.createStatement();
            String sql ="SELECT * FROM sinhvien";
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
                int type = resultSet.getInt("type");
                
                if(type == 1){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("ten");
                    String email = resultSet.getString("email");
                    
                            
                    User student = new Student( id,name,  email);
                    this.listReaders.add(student);
                }
                else if(type ==2){
                    int duration = resultSet.getInt("duration");
                     int id = resultSet.getInt("id");
                    String name = resultSet.getString("ten");
                    String email = resultSet.getString("email");
                    
                    User engineer = new Engineer( duration,  id,  name,  email);
                    this.listReaders.add(engineer);
                    
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
        }
         return this.listReaders;
    }
   
    public float calculateSum(){
        float sum = 0.0f;
        
        for(User user: this.listReaders){
            sum = sum + user.calculateFee();
        }
        return sum;
    }
}
