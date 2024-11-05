/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    EmployerDirectory employerdirectory;
    Degree degree;

    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        degree = new Degree("MSIS");
        facultydirectory = new FacultyDirectory(this);
        
    }
    public void addCoreCourse(Course c){
        degree.addCoreCourse(c);
        
    }
public void addElectiveCourse(Course c){
        degree.addElectiveCourse(c);
        
    }
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    public void assignFacultyToCourse(String facultyId, String courseNumber, String semester) {
        FacultyProfile faculty = facultydirectory.findTeachingFaculty(facultyId);
        if (faculty != null) {
            CourseSchedule courseSchedule = mastercoursecatalog.get(semester);
            if (courseSchedule != null) {
                CourseOffer courseOffer = courseSchedule.getCourseOfferByNumber(courseNumber);
                if (courseOffer != null) {
                    courseOffer.AssignAsTeacher(faculty);  // Assuming there's an assignFaculty method in CourseOffer
                }
            }
        }
    }
    
    public void printSemesterReport(String semester) {
        CourseSchedule courseSchedule = getCourseSchedule(semester);
        if (courseSchedule == null) {
            System.out.println("No course schedule found for semester: " + semester);
            return;
        }

        System.out.println("Report for Semester: " + semester);
        System.out.println("-----------------------------------------------------");

        for (CourseOffer courseOffer : courseSchedule.getAllCourseOffers()) {
            System.out.println("Course: " + courseOffer.getCourseNumber() + " - " + courseOffer.getSubjectCourse().getCourseName());
            for (Seat seat : courseOffer.getSeatList()) { // Assuming you have a method to get all seats for a course offer
                if (seat.isOccupied()) { // Check if the seat is occupied
                    StudentProfile student = seat.getAssignedStudent(); // Get the student assigned to the seat
                    int grade = seat.getGrade(); // Assuming the Seat class has a method to get the grade
                    int tuition = courseOffer.getTuitionForStudent(student); // Get tuition for the student

                    System.out.println("Student: " + student.getName() + " | Grade: " + grade + " | Tuition: $" + tuition);
                }
            }
        }

        System.out.println("-----------------------------------------------------");
    }



}
