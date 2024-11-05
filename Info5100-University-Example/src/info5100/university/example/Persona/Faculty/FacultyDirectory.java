/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Department department;
    ArrayList<FacultyProfile> teacherlist;
    HashMap<String, FacultyProfile> facultyMap;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();
        facultyMap = new HashMap<>();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        facultyMap.put(p.getPersonId(), sp);
        return sp;
    }
    
    public FacultyProfile getTopProfessor(){
        
        double bestratingsofar = 0.0;
        FacultyProfile BestProfSofar = null;
        for(FacultyProfile fp: teacherlist)
           if(fp.getProfAverageOverallRating()>bestratingsofar){
           bestratingsofar = fp.getProfAverageOverallRating();
           BestProfSofar = fp;
           }
        return BestProfSofar;
        
    }

    public FacultyProfile findTeachingFaculty(String id) {

        return facultyMap.get(id);

         }
    
    public ArrayList<FacultyProfile> getAllFaculty() {
        return new ArrayList<>(facultyMap.values());
    }
    
}
