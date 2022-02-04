/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author aulak
 */
import java.util.Scanner;
public class StudentList {
    
    public static void main(String [] args){
    
        Student [] StudentList = new Student[4];
        
         StudentList[0] = new Student("s1","Harman");
         StudentList[1] = new Student("s1","Harman");
         StudentList[2] = new Student("s2","John");
         
         for(int i=0; i<StudentList.length;i++){

             System.out.println(StudentList[i].getStudentName());
             
         }
        
    }
    
}
