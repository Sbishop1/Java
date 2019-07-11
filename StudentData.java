/*
FileName:   Final_Part_One.java     
Section:    CSIS 212  D03 Spring 2019
Purpose:    to test a gpa collection
Citations:  N/A
*/


public class StudentData {
    
    //instance variables 
    private final int[] studentID;    
    private final String[] firstName;
    private final double[] GPA;

    //constructor, creates firstName,StudentId, & GPA Arrays
    public StudentData() {
        this.GPA = new double[]{
            //GPA     ID       Name
            3.85,   //2351     Adam
            3.35,   //2353     Justin
            2.97,   //2355     Daniel
            4.00,   //2357     Mahsa
            2.65,   //2359     Lajon
            3.45,   //2361     Amy
            2.55,   //2363     Layne
            2.90,   //2365     Clint
            3.87,   //2367     Carina
            3.65    //2369     Billy
        };
        this.firstName = new String[]{
            //Name       GPA       ID
            "Adam",     //3.85     2351
            "Justin",   //3.35     2353
            "Daniel",   //2.97     2355
            "Mahsa",    //4.00     2357
            "Lajon",    //2.65     2359
            "Amy",      //3.45     2361
            "Layne",    //2.55     2363
            "Clint",    //2.90     2365
            "Carina",   //3.87     2367
            "Billy"     //3.65     2369
        };
        this.studentID = new int[]{
            //ID     Name       GPA
            2351,   //Adam     3.85
            2353,   //Justin   3.35
            2355,   //Daniel   2.97
            2357,   //Mahsa    4.00
            2359,   //Lajon    2.65
            2361,   //Amy      3.45
            2363,   //Layne    2.55
            2365,   //Clint    2.90
            2367,   //Carina   3.87
            2369    //Billy    3.65
        };
    
    }

    
    //outputs a directory of all students and thier studentIDs
    public String getStudentDirectory(){
        
        String directory = String.format(
                    "-----------------------------%n"
                  + "Student ID Directory%n"
                  + "-----------------------------%n"
                  + "<html><table>"
                    );
        
        for (int i = 0; i < studentID.length; i++) {
            directory += String.format(
                    "<tr><td>%s</td>-----<td>%d</td></tr>",
                    firstName[i],
                    studentID[i]
            );
        }
        
        directory +=String.format("</table></html>");
        return directory;
    }
    
    
    //returns teh sutdent's name and GPA by passing in a student ID
    public String getStudentByID(String ID){
    
        int studentIndex = -1;
        
        for (int i = 0; i < studentID.length; i++) {
            if (ID.equals(Integer.toString(studentID[i]))) {
                studentIndex = i;
                break;
            }
        }
        //validate for a vaid ID number
        if (studentIndex == -1) {
            throw new IllegalArgumentException(
                "Student ID " + ID + " could not be found");
        }
        
        return String.format(
                "Student: %s%n"
              + "GPA: %8s%n",
                firstName[studentIndex],
                GPA[studentIndex]
        );
    }
    
     
}
