package Civilpack;
import prograde.*; 
import java.util.*;
public class Civil
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
String G1,G2,G3,G4,G5,G6,G7,G8;
int g1,g2,g3,g4,g5,g6,g7,g8;
Scanner s=new Scanner(System.in);
System.out.println("2st sem grade");
System.out.println("HS8251 technical english");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("MA8251 Enineering mathematics-2");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("PH8201 Physics for Civil Engineering");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BE8251 Basic Electrical and Electronics Engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("GE8291 Environmental science and Engineering");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("GE8292 Engineering Mechanics");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("GE8261 Engineering Practices Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CE8211 Computer Aided Building Drawing");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*4+g7*2+g8*2)/25;
return gpa;
}
public static double sem3()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("3st sem grade");
System.out.println("MA8353 Transforms and Partial Differential Equations") ;
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CE8301 Strength of Materials 1");                  
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CE8302 Fluid Mechanics");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CE8351 Surveying");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CE8391 Construction Material");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("CE8392 Engineering Geology");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CE8311 Construction Materials Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CE8361 Surveying Laboratory ");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8381 Interpersonal Skills/Listening and Speaking");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/24;
return gpa;
}
public static double sem4()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
Scanner s=new Scanner(System.in);
System.out.println("4st sem grade");
System.out.println("MA8491 Numerical Methods");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CE8401 Construction Techniques and practices");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CE8402 Strength of materials 2");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CE8403 Applied Hydraulic Engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CE8404 Concreate Technology");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("CE8491 Soil Mechanics");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CE8481 Strength of Materials Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CE8461 Hydraulic Engineering Laboratory ");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8461 Advanced Reading and writing");
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
System.out.println("CE8501 Design of Reinforced Cement Concreate Element");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CE8502 Structural Analysis 1");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EN8491 Water supply Engineering");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CE8591 Foundation Engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Professional Elective 1");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Open Elective 1*");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CE8511 Soil Mechanics Laboratry");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CE8512 Water and Waste water Analysis Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("CE8513 Survey Camp ");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*2)/25;
return gpa;
}
public static double sem6()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8;
int g1,g2,g3,g4,g5,g6,g7,g8;
Scanner s=new Scanner(System.in);
System.out.println("6st sem grade");
System.out.println("CE8601 Design of steel Structural Elements");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CE8602 Structural Analysis 2");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CE8603 Irrigation Engineering");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("CE8604 Highway Engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("EN8592 Waste Water Engineering");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Professional Elective 2");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CE8611 Highway Engineering Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("CE8612 Irrigation and environmental Engineering Drawing");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/23;
return gpa;
}
public static double sem7()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7;
int g1,g2,g3,g4,g5,g6,g7;
Scanner s=new Scanner(System.in);
System.out.println("7st sem grade");
System.out.println("CE8701 Estimation Costing Valuation Engineering");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("CE8702 Railways , Airports, Docks and Harbour Engineering");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CE8703 Structural Design and Drawing");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("Professional Elective 3");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Open Elective 2*");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("CE8711 Creative and Innovative Project ");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("CE8712 Industrial Training");
G7=s.next();
g7=gradepro.grade(G7);
gpa=(g1*3+g2*3+g3*4+g4*3+g5*3+g6*2+g7*2)/20;
return gpa;
}
public static double sem8()
{
double gpa;
String G1,G2,G3;
int g1,g2,g3;
Scanner s=new Scanner(System.in);
System.out.println("8th sem Grade");
System.out.println("Professional Elective 4");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("Professional Elective 5 ");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("CE8811 Project Work");
G3=s.next();
g3=gradepro.grade(G3);
gpa=(g1*3+g2*3+g3*10)/16;
return gpa;
}
}