package com.myapp.struts;
// Generated 13 Oct, 2015 4:47:35 PM by Hibernate Tools 3.2.1.GA



/**
 * Team generated by hbm2java
 */
public class Team extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private int id;
     private String type;
     private String head;
     private String phone;
     private String email;
     private String password;

    public Team() {
    }

	
    public Team(int id) {
        this.id = id;
    }
    public Team(int id, String type, String head, String phone, String email, String password) {
       this.id = id;
       this.type = type;
       this.head = head;
       this.phone = phone;
       this.email = email;
       this.password = password;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getHead() {
        return this.head;
    }
    
    public void setHead(String head) {
        this.head = head;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

