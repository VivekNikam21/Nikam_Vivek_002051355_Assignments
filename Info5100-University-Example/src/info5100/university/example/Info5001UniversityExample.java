/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department department = new Department("Information Systems");
        CourseCatalog courseCatalog = department.getCourseCatalog();

        // Create courses
        Course coreCourse = courseCatalog.newCourse("Application Engineering", "INFO 5100", 4);
        Course elective1 = courseCatalog.newCourse("Data Structures", "INFO 5200", 3);
        Course elective2 = courseCatalog.newCourse("Database Management", "INFO 5300", 3);
        Course elective3 = courseCatalog.newCourse("Web Development", "INFO 5400", 3);
        Course elective4 = courseCatalog.newCourse("Software Testing", "INFO 5500", 3);
        
        // Create a new course schedule
        CourseSchedule courseSchedule = department.newCourseSchedule("Fall2020");

        // Create course offers and generate seats
        CourseOffer coreCourseOffer = courseSchedule.newCourseOffer(coreCourse.getCourseNumber());
        if (coreCourseOffer != null) {
            coreCourseOffer.generatSeats(30); // Example: 30 seats for core course
        }

        CourseOffer electiveOffer1 = courseSchedule.newCourseOffer(elective1.getCourseNumber());
        if (electiveOffer1 != null) {
            electiveOffer1.generatSeats(20); // Example: 20 seats for Data Structures
        }

        CourseOffer electiveOffer2 = courseSchedule.newCourseOffer(elective2.getCourseNumber());
        if (electiveOffer2 != null) {
            electiveOffer2.generatSeats(20); // Example: 20 seats for Database Management
        }

        CourseOffer electiveOffer3 = courseSchedule.newCourseOffer(elective3.getCourseNumber());
        if (electiveOffer3 != null) {
            electiveOffer3.generatSeats(20); // Example: 20 seats for Web Development
        }

        CourseOffer electiveOffer4 = courseSchedule.newCourseOffer(elective4.getCourseNumber());
        if (electiveOffer4 != null) {
            electiveOffer4.generatSeats(20); // Example: 20 seats for Software Testing
        }

        // Create person directory and student directory
        PersonDirectory personDirectory = department.getPersonDirectory();
        StudentDirectory studentDirectory = department.getStudentDirectory();

        // Add students
        ArrayList<StudentProfile> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = personDirectory.newPerson("Student0" + (i + 1));
            StudentProfile studentProfile = studentDirectory.newStudentProfile(person);
            students.add(studentProfile);
            // Register each student for courses
            registerStudentForCourses(studentProfile, courseSchedule);
        }

        // Calculate and print total revenues for the semester
        int totalRevenue = department.calculateRevenuesBySemester("Fall2020");
        System.out.println("Total Revenue for Fall 2020: " + totalRevenue);

        // Print detailed report of student registrations
        printStudentReport(students, courseSchedule);
    }

    private static void registerStudentForCourses(StudentProfile studentProfile, CourseSchedule courseSchedule) {
        // Register the student for the core course and some electives
        CourseOffer coreOffer = courseSchedule.getCourseOffer("INFO 5100");
        CourseOffer electiveOffer1 = courseSchedule.getCourseOffer("INFO 5200"); // Example for one elective
        CourseOffer electiveOffer2 = courseSchedule.getCourseOffer("INFO 5300"); // Example for another elective
        
        // Assuming we have logic to check seat availability, etc.
        if (coreOffer != null) {
            studentProfile.newCourseLoad("Fall2020").newSeatAssignment(coreOffer);
        }
        if (electiveOffer1 != null) {
            studentProfile.newCourseLoad("Fall2020").newSeatAssignment(electiveOffer1);
        }
        if (electiveOffer2 != null) {
            studentProfile.newCourseLoad("Fall2020").newSeatAssignment(electiveOffer2);
        }
    }

    private static void printStudentReport(ArrayList<StudentProfile> students, CourseSchedule courseSchedule) {
        System.out.println("Student Registration Report for Fall 2020:");
        for (StudentProfile student : students) {
            System.out.println("Student: " + student.getPerson().getId());
            CourseLoad courseLoad = student.getCourseLoad("Fall2020");
            for (CourseOffer offer : courseLoad.getCourseOffers()) {
                System.out.println(" - Enrolled in: " + offer.getCourse().getCourseName() + 
                                   " taught by " + offer.getInstructor().getName());
                // Print grades, GPA, and tuition fees here
                // Assuming there's a method to retrieve these details
            }
            System.out.println(); // For spacing
        }
    }

}
