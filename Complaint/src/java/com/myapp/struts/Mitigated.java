package com.myapp.struts;
// Generated 13 Oct, 2015 4:47:35 PM by Hibernate Tools 3.2.1.GA



/**
 * Mitigated generated by hbm2java
 */
public class Mitigated extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private int id;
     private String subject;
     private String description;

    public Mitigated() {
    }

	
    public Mitigated(int id) {
        this.id = id;
    }
    public Mitigated(int id, String subject, String description) {
       this.id = id;
       this.subject = subject;
       this.description = description;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


