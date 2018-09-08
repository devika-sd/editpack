package eeepack;
import prograde.*; 
import java.util.*;
public class eee
{
static Scanner s=new Scanner(System.in);
public static double sem1()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("1st sem grade");
System.out.println("HS8151 Communicative English");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("MA8151 Engineering Mathematics - I");
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
System.out.println("GE8161 Problem Solving and Python Programming Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BS8161 Physics and Chemistry Laboratory");
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
System.out.println("2st sem grade");
System.out.println("HS8251 technical english");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("MA8251 Engineering mathematics 2");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("PH8253 physics for electronics engineering");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BE8252 Basic civil and mechanical engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("EE8251 circuit theory");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("GE8291 environmental science and engineering");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("GE8261 engineering practices laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("EE8261 electric circuit laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*4+g3*3+g4*4+g5*3+g6*3+g7*2+g8*2)/25;
return gpa;
}
public static double sem3()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("3st sem grade");
System.out.println("MA8353 Transforms and Partial Differential Equations");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("EE8351 Digital Logic Circuits");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EE8391 Electromagnetic Theory");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("EE8301 Electrical Machines - I");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("EC8353 Electron Devices and Circuits");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("ME8792 Power Plant Engineering");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EC8311 Electronics Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("EE8311 Electrical Machines Laboratory - I");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/23;
return gpa;
}
public static double sem4()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("4st sem grade");
System.out.println("MA8491 Numerical methods");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("EE8401 Electrical machines-2");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EE8402 Transmission and Dietribution");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("EE8403 Measurements and instrumentation");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("EE8451 linear integrated circuits and application");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("IC8451 Control Systems");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EE8411 Electrical machines laboratory-2");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("EE8461 linear and digital integrated circuits laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("EE8412 Technical seminar");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*3+g3*3+g4*3+g5*3+g6*4+g7*2+g8*2+g9*1)/25;
return gpa;
}
public static double sem5()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("5st sem grade");
System.out.println("EE8501 Power System Analysis");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("EE8551 Microprocessors and Microcontrollers");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EE8552 Power Electronics");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("EE8591 Digital Signal Processing");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("CS8392 Object Oriented Programming");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Open Elective I*");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EE8511 Control and Instrumentation Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("HS8581 Professional Communication");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("CS8383 Object Oriented Programming Laboratory");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*1+g9*2)/23;
return gpa;
}
public static double sem6()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("6st sem grade");
System.out.println("EE8601 solid state drives");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("EE8602 protection and switchgear");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EE8691 Embedded systems");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("professional electives 1");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("professional electives 2");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("EE8661 power electronics and drives laboratory");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EE8681 Microprocessors and microcontrollers");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("EE8611 Mini project");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*2+g7*2+g8*2)/21;
return gpa;
}
public static double sem7()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("7st sem grade");
System.out.println("EE8701 High Voltage Engineering");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("EE8702 Power System Operation and Control");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("EE8703 Renewable Energy Systems");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("Open Elective II*");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Professional Elective III");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Professional Elective IV");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("EE8711 Power System Simulation Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("EE8712 Renewable Energy Systems Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/22;
return gpa;
}
public static double sem8()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("8st sem grade");
System.out.println("professional elective-5");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("professional elective-6");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("project work");
G3=s.next();
g3=gradepro.grade(G3);
gpa=(g1*3+g2*3+g3*10)/16;
return gpa;
}
}
