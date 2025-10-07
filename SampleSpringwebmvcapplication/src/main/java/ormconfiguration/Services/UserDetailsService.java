/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormconfiguration.Services;

/**
 *
 * @author saibhagawan
 */
import ormconfiguration.Dao.UserDetailsDao;
import ormconfiguration.entities.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    
    @Autowired
    private UserDetailsDao userDetailsDao ;
    
    public void createUser(
            int id,
            String UserAccountNumber,
            String userName,
            String uniqueId,
            String panNumber,
            String Address, 
            String phoneNumber,
            String accountType,
            String ifsccode){
        UserDetails user = new UserDetails(
                id,UserAccountNumber,
                userName,
                uniqueId,
                panNumber,
                Address,
                phoneNumber,
                accountType,
                ifsccode);
        userDetailsDao.save(user);
        
    }
    
}
