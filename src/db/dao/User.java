/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.dao;

/**
 *
 * @author IVb
 */
public class User {
    
    public Integer ID;
    
    public String Username;
    
    public String Password;
    
    public String FirstName;
    
    public String LastName;
    
    public String Email;
    
    public String Image;
    
    public void print(){
        System.out.printf("ID: %d\tUsername:%s\tPassword:%s\tFirstName:%s\tLastName:%s\tEmail:%s\n", ID, Username, Password, FirstName, LastName,Email );
    }
    
}
