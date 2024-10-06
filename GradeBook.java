/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesyakochenko
 */

class GradeBook {
 
  String [] students = {"Student A", "Student B", "Student C", "Student D", "Student E"};
  String [] tests = {"Test 1", "Test 2", "Test 3", "Test 4", "Test 5"};
  String [] grades = {"A", "B", "C", "D","F"};
 
  double marks [][]  = {{67,50,93,83,43},
                          {70,52,96,85,48},
                          {90,81,100,93,68},
                          {55,32,71,72,58},
                          {60,47,65,74,61}};
 
  public static void main(String[ ] args) {
    GradeBook gb = new GradeBook();
    double averageOverall = 0.0;
    double totalMarks = 0.0;
    double averageStudent = 0.0;
    double averageTest = 0.0;
    int gradeIndex = 0;
    
    
    for (int i = 0; i < gb.marks.length; i++) {
        double totalStudent = 0.0;
        double totalTest = 0.0;
        
        
        
        for (int j = 0; j < gb.marks[i].length; j++) {
          
           totalMarks += gb.marks [i][j];
           totalStudent += gb.marks[i][j];
           totalTest += gb.marks[j][i];
                   
                   
        }
        averageStudent = totalStudent/gb.tests.length;
      
        if (averageStudent >= 85) {
            gradeIndex = 0;
        }
        else if (averageStudent >= 70) {
            gradeIndex = 1;
        }
        else if (averageStudent >= 55) {
            gradeIndex = 2;
        }
        else if (averageStudent >= 40) {
            gradeIndex = 3;
        }
        else {
            gradeIndex = 4;
        }
        
        
        
        
        System.out.println("The average mark for " + gb.students[i] + " is : " + averageStudent + ", their grade is :" + gb.grades[gradeIndex]);
        
        averageTest = totalTest/gb.students.length;
        System.out.println("The average mark for " + gb.tests[i] + " is : " + averageTest);
        
        
   
  }
    int totalElements = gb.students.length * gb.tests.length;
    
    averageOverall = totalMarks/totalElements;
    
    System.out.println("The overall average mark is : " + averageOverall);
    
}
}
