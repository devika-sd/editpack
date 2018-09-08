package biopack;
import prograde.*; 
import java.util.*;
public class biotech
{
gradepro d=new gradepro();
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
System.out.println("GE8161 problem solving and python programming");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BS8161 Physics and Chemistry laborary");
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
System.out.println("MA8251 Enineering mathematics");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("PH8254 physics of material");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BE8252 basic civil and machanical engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("BT8291 Microbiology");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("BT8251 biochemistry");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("GE8261 Engineering Practices Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8261 Biochemistry Laboratory");
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
System.out.println("MA8353 Transforms and Partial Differential  Equations");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("BT8301 Stoichiometry");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("BT8302 Applied Thermodynamics for Biotechnologists");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BT8303 Basic Industrial Biotechnology");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("BT8304 Bioorganic Chemistry");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("BT8305 Cell Biology");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("BT8361 Microbiology Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8311 Cell Biology Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8381 Interpersonal Skills/Listening and Speaking");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
return gpa;
}
public static double sem4()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("4st sem grade");
System.out.println("MA8391 Probability and statistics");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("BT8401 Fluid mechanics and heat transfer operations");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("BT8402 molecular biology");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BT8403 enzyme technology and bio-transformations");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("BT8404 bioprocess principles");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("GE8291 environmental science and engineering");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("BT8411 chemical engineering laboratory for biotechnologists");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8412 molecular biology laboratory");
G8=s.next();
g8=gradepro.grade(G8);
System.out.println("HS8461 Advanced Reading and Writing");
G9=s.next();
g9=gradepro.grade(G9);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2+g9*1)/25;
return gpa;
}
public static double sem5()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("5st sem grade");
System.out.println("BT8501 Mass Transfer Operations");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("BT8591 Bioprocess Engineering");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("BT8502 Analytical Methods and instrumentation");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("BT8503 Protein Engineering");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Professional Elective I");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("Open Elective I*");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("BT8511 Bioprocess Laboratory I");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8512 Analytical Methods and Instrumentation Laboratory ");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/22;
return gpa;
}
public static double sem6()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8,G9;
int g1,g2,g3,g4,g5,g6,g7,g8,g9;
System.out.println("6st sem grade");
System.out.println("BT8651 bioinformatics");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("BT8601 genetic engineering");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("BT8691 applied chemical reaction engineering");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("profession elective 2");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("profession elective 3");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("profession elective 4");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("BT8611 bioprocess laboratory 2");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8612 genetic engineering laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*4+g2*4+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/24;
return gpa;
}
public static double sem7()
{
double gpa;
String G1,G2,G3,G4,G5,G6,G7,G8;
int g1,g2,g3,g4,g5,g6,g7,g8;
System.out.println("7st sem grade");
System.out.println("GE8077 Total Quality Management");
G1=s.next();
g1=gradepro.grade(G1);
System.out.println("BT8751 Downstream Processing");
G2=s.next();
g2=gradepro.grade(G2);
System.out.println("BT8791 Immunology");
G3=s.next();
g3=gradepro.grade(G3);
System.out.println("Professional Elective 5");
G4=s.next();
g4=gradepro.grade(G4);
System.out.println("Professional Elective 6");
G5=s.next();
g5=gradepro.grade(G5);
System.out.println("open elective 2*");
G6=s.next();
g6=gradepro.grade(G6);
System.out.println("BT8711 Downstream Processing Laboratory");
G7=s.next();
g7=gradepro.grade(G7);
System.out.println("BT8712 Immunology Laboratory");
G8=s.next();
g8=gradepro.grade(G8);
gpa=(g1*3+g2*3+g3*3+g4*3+g5*3+g6*3+g7*2+g8*2)/22;
return gpa;
}
public static double sem8()
{
double gpa;
String G1;
int g1;
System.out.println("8st sem grade");
System.out.println("project work");
G1=s.next();
g1=gradepro.grade(G1);
gpa=(g1*10)/10;
return gpa;
}
}