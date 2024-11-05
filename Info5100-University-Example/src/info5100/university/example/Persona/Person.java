/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    private String firstName;
    private String lastName;
    
    public Person(String id) {
        this.id = id;
    }
    
    public Person (String id, String firstName, String lastName){
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    public String getPersonId(){
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    
        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
       
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + getFullName();
    }
    
}
