/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author verle
 */
public class Admin extends Organization{
    
    public Admin(){
    
    super(Type.Admin.getValue());
            
    }
    @Override
    public ArrayList<String> getSupportedRole()
    {
    ArrayList<String> roles =new ArrayList<>();
    roles.add("Admin");
    return roles;      
    }
            
}
