/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;
import java.util.Scanner;

/**
 *
 * @author aulak
 */
public class Student_Week {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* char[] myWord = new char[8];
        
        myWord[0]='s';
        myWord[1]='t';
        myWord[2]='u';
        myWord[3]='d';
        myWord[4]='e';
        myWord[5]='n';
        myWord[6]='t';
        myWord[7]='s';
        
        for(int i=0;i<myWord.length;i++){
            System.out.println(myWord[i]);        
        }
        
        for(int i = myWord.length-1;i>0;i--){
              System.out.println(myWord[i]);
        }*/
       
       Scanner sc = new Scanner(System.in);
       
       
       String Word = sc.nextLine();
       
       char [] myLetters = new char[Word.length()];
       
       for(int i=0;i<myLetters.length;i++){
       myLetters[i]=Word.charAt(i);
           
           System.out.print(myLetters[i]);
       }
       
       
       
       
       
       
}
}