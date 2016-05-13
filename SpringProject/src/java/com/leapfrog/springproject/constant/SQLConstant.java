/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springproject.constant;

/**
 *
 * @author SRS
 */
public class SQLConstant {
    public final static String EMPLOYEE_INSERT="INSERT INTO " + TableConstant.EMPLOYEE_TABLE
            + "(first_name,last_name,email,contact_no,status,department_id) VALUES(?,?,?,?,?,?)";
     
    public final static String EMPLOYEE_UPDATE="UPDATE " + TableConstant.EMPLOYEE_TABLE 
             +"SET first_name=?,last_name=?,email=?,contact_no=?,status=?,department_id=? WHERE id=?";
     
    public final static String EMPLOYEE_DELETE="DELETE FROM " + TableConstant.EMPLOYEE_TABLE + "WHERE id = ?";
    
    public final static String EMPLOYEE_GETALL="SELECT * FROM " + TableConstant.EMPLOYEE_TABLE;
    
    public final static String EMPLOYEE_GETBYID="SELECT * FROM " + TableConstant.EMPLOYEE_TABLE + "WHERE id = ?";
    
    public final static String DEPARTMENT_INSERT="INSERT INTO " +TableConstant.DEPARTMENT_TABLE
            + "(name) VALUES(?)";

    public final static String DEPARTMENT_UPDATE="UPDATE " +TableConstant.DEPARTMENT_TABLE
            + "SET name=? WHERE id=?";
    
    public final static String DEPARTMENT_DELETE="DELETE FROM " + TableConstant.DEPARTMENT_TABLE + "WHERE id = ?";
    
    public final static String DEPARTMENT_GETALL="SELECT * FROM " + TableConstant.DEPARTMENT_TABLE;
    
    public final static String DEPARTMENT_GETBYID="SELECT * FROM " + TableConstant.DEPARTMENT_TABLE + "WHERE id = ?";
    
}
