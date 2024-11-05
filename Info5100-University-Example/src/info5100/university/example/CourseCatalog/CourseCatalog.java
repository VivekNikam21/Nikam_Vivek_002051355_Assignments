/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseCatalog {
    Department department;
    String lastupdated;
    ArrayList<Course> courselist; 
    public CourseCatalog(Department d){
        courselist = new ArrayList();
        department = d;
    }
    
    public ArrayList<Course> getCourseList(){
        return courselist;
    }
    
    public Course newCourse(String n, String nm, int cr){
        Course c = new Course(n, nm, cr);
        courselist.add(c);
        lastupdated = java.time.LocalDateTime.now().toString();
        return c;
    }
    
    public Course getCourseByNumber(String n){
        
        for( Course c: courselist){
            
            if(c.getCourseNumber().equals(n)) return c;
        }
        return null;
    }
    
    public void displayCourses() {
        System.out.println("Courses in the Course Catalog:");
        for (Course course : courselist) {
            System.out.println("Course Number: " + course.getCourseNumber()
                    + ", Name: " + course.getCourseName()
                    + ", Credits: " + course.getCredits()
                    + ", Price: $" + course.getCoursePrice());
        }
        System.out.println("Last updated: " + lastupdated);
    }

}