/*
FileName:   Final_Part_One.java     
Section:    CSIS 212  D03 Spring 2019
Purpose:    to test a gpa collection
Citations:  N/A
*/


import javax.swing.*;



public class Final_Part_One {

    public static void main(String[] args) {
        System.out.println("Steven Bishop - Final Project Part 1 Module 8 \n\n");
        
        //program loop bool
        boolean gettingGPA = true;
        
        //set up student data
        StudentData data = new StudentData();
          
            
            while(gettingGPA){
             //display a menu to user, caputure thier selected course of action
            int menuSelection = showMenu(); 
            
            //handles menu requests
            switch(menuSelection){
                case 0: showGPA(data); //displays and and GPA by StudentID
                        break;
                case 1: showDirectory(data);
                        continue;
                default: gettingGPA = false;
                }
            }
    }

    static int showMenu(){
        Object[] options = {"Enter ID","Directory","Quit"};
        return JOptionPane.showOptionDialog(null, 
                "Enter student ID to retrieve GPA", "GPA Retrievial",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, options, options[2]);
    }
    
    public static void showGPA(StudentData data){
    //show dialog for user to enter Student ID    
    String userChoice = JOptionPane.showInputDialog(null,"Enter Student ID");
        
        //validate ID entry
        try{
            JOptionPane.showMessageDialog(null,data.getStudentByID(userChoice));
        }
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void showDirectory(StudentData data){
       //show dialog containing directory
    JOptionPane.showMessageDialog(null, data.getStudentDirectory());
    }

}