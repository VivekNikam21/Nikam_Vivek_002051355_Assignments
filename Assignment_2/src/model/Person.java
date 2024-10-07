/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nikam
 */
public class Person {

    private String fname;
    private String lname;
    private long ssn;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(String hstreetadd, String hunitno, String hcity, String hstate, Long hzip, Double hphone, String wstreetadd, String wunitno, String wcity, String wstate, Long wzip, Double wphone) {
        Address address = new Address();  // Create a new Address object
        address.setHstreetadd(hstreetadd);
        address.setHunitno(hunitno);
        address.setHcity(hcity);
        address.setHstate(hstate);
        address.setHzip(hzip);
        address.setHphone(hphone);  // Assuming phone is String

        // Set work address details
        address.setWstreetadd(wstreetadd);
        address.setWunitno(wunitno);
        address.setWcity(wcity);
        address.setWstate(wstate);
        address.setWzip(wzip);
        address.setWphone(wphone);
        
        this.address = address;
    }
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
