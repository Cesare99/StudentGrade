package studentgrade;

import javax.swing.JOptionPane;

public class StudentGrade {

    public static void main(String[] args) {
        int gradeArray [] = new int [5];
        int average = 0;
        
        for (int x=0; x<2; x++) { //For Loop used to count the number of students
            for (int i=0; i<gradeArray.length; i++) { //For Loop used to input each student's marks
                gradeArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Please Enter Student's Result")); //Fill gradeArray with five values
            }
                
            average = averagePoints(gradeArray); //Allows the method averagePoints equal the variable average;
            JOptionPane.showMessageDialog(null, "Student Score: " +average +"\nStudent Point: " +qualityPoints(average)); //Displays Results
        }
    }
    
    public static int averagePoints(int gradeArray[]){
        int total = 0,
            average = 0;
        
        for (int i=0; i<gradeArray.length; i++) { //For Loop used to calculate the total
            total += gradeArray[i];
        }
        
        average = total / gradeArray.length; //Used in order to calculate the average
        return average;
    }
    
    public static int qualityPoints(int average) {
        if (average>=90 && average<100){ //If Else structure used in order to calculate the students points
            return 4;
        } else if (average>=80 && average<90){
            return 3;
        } else if (average>=70 && average<80){
            return 2;
        }  else if (average>=60 && average<70){
            return 1;
        }
        
        return 0;
    }
}
    

