/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class PersonDirectory {

    private ArrayList<Person>personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
        
    }
    
    public ArrayList<Person> getPerson() {
        return personList;
    }

   public Person addPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
}
    public void deletePerson(Person person){
        personList.remove(person);
    }
    
    public Person searchPerson(String search){
        for (Person p:personList){
            Address add = p.getAddress();
            if(p.getFname().contains(search) || p.getLname().contains(search) ||
               add.getHstreetadd().contains(search) || String.valueOf(add.getHunitno()).contains(search) || add.getHcity().contains(search) || add.getHstate().contains(search) || String.valueOf(add.getHzip()).contains(search) || String.valueOf(add.getHphone()).contains(search)
               || add.getWstreetadd().contains(search) || String.valueOf(add.getWunitno()).contains(search) || add.getWcity().contains(search) || add.getWstate().contains(search) || String.valueOf(add.getWzip()).contains(search) || String.valueOf(add.getWphone()).contains(search)) {
                return p;
        }
     
    }

         return null; 
    
    } 
}
