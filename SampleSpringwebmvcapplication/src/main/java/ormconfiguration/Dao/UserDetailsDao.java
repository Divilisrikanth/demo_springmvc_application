/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormconfiguration.Dao;

/**
 *
 * @author saibhagawan
 */
import ormconfiguration.entities.UserDetails;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDetailsDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(UserDetails user){
        sessionFactory.getCurrentSession().save(user);
    }
}
