package itpack;
import prograde.*; 
import java.util.*;
public class it
{
public static double sem1()
{
double gpa;	
String G1,G2,G3,G4,G5,G6,G7,G8;
int g1,g2,g3,g4,g5,g6,g7,g8;
Scanner s=new Scanner(System.in);
System.out.println("1st sem grade");
System.out.println("HS8151 Communicative English");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("MA8151 Engineering  Mathematics – 1");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("PH8151 Engineering Physics");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CY8151 Engineering Chemistry");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("GE8151 Problem Solving and Python Programming");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("GE8152 Engineering Graphics");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("GE8161 problem solving and python programming laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BS8161 Physics and Chemistry laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*4+g7*2+g8*2)/25;
return gpa;
}
public static double sem2()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("2st sem grade");
System.out.println("HS8251 technical english");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("MA8251 Enineering mathematics-2");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("PH8252 physics for information science");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BE8255  basic electrical and electronics engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("IT8201 Information Technology Essentials");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("CS8251 Programming in C");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("GE8261 Engineering Practices Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CS8261 C Programming laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("IT8211 Information Technology Essentials Laboratory");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
return gpa;
}
public static double sem3()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("3st sem grade");
System.out.println("MA8351 Discreate Mathematics") ;
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CS8351 Digital Principles and System Analysis");                  
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CS8391 Data Structures");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CS8392 Object Oriented Programming");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("EC8394 Analog and Digital Communication");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("CS8381 Data Structures Laboratory");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CS8383 Object Oriented programming Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CS8382 Digital System Laboratory ");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8381 Interpersonal Skills/Listening and Speaking");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*2+g7*2+g8*2+g9*1)/24;
return gpa;
}
public static double sem4()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("4st sem grade");
System.out.println("MA8391 Probability and Statistics");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CS8491 Computer Architecture");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CS8492 Database Management  System");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CS8451 Design and Analysis of Algorithms");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CS8493 Operating Systems");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("GE8291 Environmental science and Engineering");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CS8481 Database Management and Systems Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CS8461 Operating Systems Laboratory ");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8461 Advanced Reading and Writing");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/24;
return gpa;
}
public static double sem5()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("5st sem grade");
System.out.println("MA8551 Algebra and Number Theory");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CS8591  Computer Networks");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EC8691 Microprocessors and Microcontrollers");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("IT84501 Web  Technology");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CS8494 Software Engineering");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Open Elective 1");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EC8681 Microprocessor and Microcontroller Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CS8581 Networks Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("IT85811 Web Technology Laboratory");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*2)/25;
return gpa;
}
public static double sem6()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8, G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("6st sem grade");
System.out.println("IT8601 Computational Intelligence");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CS8592 Object Oriented Analysis and Design");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("IT8602 Mobile Communication");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CS8091 Big Data Analytics");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CS8092 Computer Graphics and Multimedia");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Professional Elective 1");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CS8662 Mobile Application Development Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CS8582 Object Oriented Analysis and Design Labpratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("IT8611 Mini Project");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/23;
return gpa;
}
public static double sem7()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8;
int g1,g2,g3,g4,g5,g6,g7,g8;
Scanner s=new Scanner(System.in);
System.out.println("7st sem grade");
System.out.println("MG8591 Principles of management");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CS8792 Cryptography and Network Security");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CS8791 Cloud Computing");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("Open Elective 2");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Professional Elective 2");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Professional Elective 3");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("IT8711 FOSS and Cloud Computing Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("IT8761 security Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/22;
return gpa;
}
public static double sem8()
{
double gpa;
String G1,G2,G3;
int g1,g2,g3;
Scanner s=new Scanner(System.in);
System.out.println("8st sem grade");
System.out.println("Professional Elective 4");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("Professional Elective 5");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("IT8811 Project Work");
G3=s.next();
g3=gradepro.grade(G3);
gpa=(g1*3+g2*3+g3*10)/16;
return gpa;
}
}