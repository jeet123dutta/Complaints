package com.myapp.struts;
// Generated 13 Oct, 2015 4:47:35 PM by Hibernate Tools 3.2.1.GA



/**
 * Feedback generated by hbm2java
 */
public class Feedback extends org.apache.struts.action.ActionForm implements java.io.Serializable {


     private int id;
     private String description;

    public Feedback() {
    }

	
    public Feedback(int id) {
        this.id = id;
    }
    public Feedback(int id, String description) {
       this.id = id;
       this.description = description;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}


