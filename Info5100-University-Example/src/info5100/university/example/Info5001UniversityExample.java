/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//all the packages and import statements
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;
import java.util.Map;

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

        // Creating courses
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Course coreCourse = courseCatalog.newCourse("AED", "INFO5100", 4);
        Course elect1 = courseCatalog.newCourse("Database Management and Design", "DAMG6210", 4);
        Course elect2 = courseCatalog.newCourse("Career Management", "ENCP6000", 1);
        Course elect3 = courseCatalog.newCourse("Data Science methods and application", "INFO5400", 4);
        Course elect4 = courseCatalog.newCourse("Web Design and User Experience Engineering", "INFO6150", 4);
        Course elect5 = courseCatalog.newCourse("UI/UX", "INFO5600", 4);

        // Creating Faculties
        FacultyDirectory facultyDirectory = department.getFacultyDirectory();
        FacultyProfile fac1 = facultyDirectory.newFacultyProfile(new Person("Prof. Kal Bugrara"));
        FacultyProfile fac2 = facultyDirectory.newFacultyProfile(new Person("Prof. Naveen Kuragayala"));
        FacultyProfile fac3 = facultyDirectory.newFacultyProfile(new Person("Prof. Ariana Brody"));
        FacultyProfile fac4 = facultyDirectory.newFacultyProfile(new Person("Prof. Dino Kostantopoulos"));
        FacultyProfile fac5 = facultyDirectory.newFacultyProfile(new Person("Prof. Amuthan Arulraj"));
        FacultyProfile fac6 = facultyDirectory.newFacultyProfile(new Person("Prof. John Doe"));

        CourseSchedule courseSchedule = department.newCourseSchedule("Fall2024");
        createCourseOffers(courseSchedule, coreCourse, elect1, elect2, elect3, elect4, elect5, fac1, fac2, fac3, fac4, fac5, fac6);

        // Student Directory and Registration
        Map<String, StudentProfile> students = registerStudents(department, courseSchedule, coreCourse, elect1, elect2, elect3, elect4, elect5);

        setFacultyRatings(courseSchedule);  //Facutly rating
        generateSemesterReport(students, courseSchedule); // report card

        // Department revenue
        int totalRevenue = department.calculateRevenuesBySemester("Fall2024");
        System.out.println("Total Department Revenue for Fall 2024- $ " + totalRevenue);
    }

 private static void createCourseOffers(CourseSchedule courseSchedule, Course coreCourse, Course elect1,
            Course elect2, Course elect3, Course elect4, Course elect5, FacultyProfile fac1,
            FacultyProfile fac2, FacultyProfile fac3, FacultyProfile fac4, FacultyProfile fac5, FacultyProfile fac6) {
    // Create course offers and assign faculty members
        CourseOffer offerCore = courseSchedule.newCourseOffer(coreCourse.getCOurseNumber());
        offerCore.AssignAsTeacher(fac1);
        offerCore.generatSeats(10);

        CourseOffer offerElect1 = courseSchedule.newCourseOffer(elect1.getCOurseNumber());
        offerElect1.AssignAsTeacher(fac2);
        offerElect1.generatSeats(10);

        CourseOffer offerElect2 = courseSchedule.newCourseOffer(elect2.getCOurseNumber());
        offerElect2.AssignAsTeacher(fac3);
        offerElect2.generatSeats(10);

        CourseOffer offerElect3 = courseSchedule.newCourseOffer(elect3.getCOurseNumber());
        offerElect3.AssignAsTeacher(fac4);
        offerElect3.generatSeats(10);

        CourseOffer offerElect4 = courseSchedule.newCourseOffer(elect4.getCOurseNumber());
        offerElect4.AssignAsTeacher(fac5);
        offerElect4.generatSeats(10);

        CourseOffer offerElect5 = courseSchedule.newCourseOffer(elect5.getCOurseNumber());
        offerElect5.AssignAsTeacher(fac6);
        offerElect5.generatSeats(10);

        courseSchedule.addCourseOffer(offerCore);
        courseSchedule.addCourseOffer(offerElect1);
        courseSchedule.addCourseOffer(offerElect2);
        courseSchedule.addCourseOffer(offerElect3);
        courseSchedule.addCourseOffer(offerElect4);
        courseSchedule.addCourseOffer(offerElect5);
}
 
    private static Map<String, StudentProfile> registerStudents(Department department, CourseSchedule courseSchedule,
            Course coreCourse, Course elect1, Course elect2, Course elect3, Course elect4, Course elect5) {
    PersonDirectory personDirectory = department.getPersonDirectory();
    StudentDirectory studentDirectory = department.getStudentDirectory();
    Map<String, StudentProfile> students = new HashMap<>();

    for (int i = 1; i <= 10; i++) {
        Person person = personDirectory.newPerson("002051355" + i);
        StudentProfile student = studentDirectory.newStudentProfile(person);
        students.put("Student" + i, student);

        // Course load for Fall 2023 semester
        CourseLoad courseLoad = student.newCourseLoad("Fall2024");
        
        // Use the correct method to get course offers by number
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(coreCourse.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(elect1.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(elect2.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(elect3.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(elect4.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(elect5.getCOurseNumber()));
    }
    return students;
}


}
