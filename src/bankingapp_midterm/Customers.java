/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp_midterm;

/**
 *
 * @author T
 */
public class Customers {
    
    private String FirstName, LastName, Location, Username, Password;
    
    
    public Customers(String fn, String ln, String lc, String usn, String pwd)
    {
        this.FirstName=fn;
        this.LastName=ln;
        this.Location=lc;
        this.Username=usn;
        this.Password=pwd;
    }
    public String getFullName()
    {
        return this.FirstName+" "+this.LastName;
    }

    
}
