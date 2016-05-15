/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springproject.DAO.impl;

import com.leapfrog.springproject.DAO.DepartmentDAO;
import com.leapfrog.springproject.entity.Department;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Narayan
 */
public class DepartmentDAOImpl implements DepartmentDAO{

    @Override
    public int insert() throws ClassNotFoundException, SQLException {
        
        return 1;
    }
    
    

    @Override
    public int update() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department getById(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
