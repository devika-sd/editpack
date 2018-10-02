package promain;
import biopack.*;
import eeepack.*;
import Civilpack.*;
import itpack.*;
import java.util.*;
class projectpackmain
{
static double ini,frst2,secd1,secd2,trid1,trid2,fin1,fin2,cgpa,prev;
static double gpa[]=new double[8];
static Scanner s=new Scanner(System.in);
public static void main(String args[])
{
projectpackmain p=new projectpackmain();
biotech bio=new biotech();
System.out.println("enter the department");
System.out.println("1.biotech"+"\n"+"2.EEE"+"\n"+"3.Civil"+"\n"+"4.it");
int c=s.nextInt();
System.out.println("enter the semester");
int n=s.nextInt();
switch(c)
{
case 1: 
	switch(n)
	{
	case 1: 
		gpa[0]=biotech.sem1();
		System.out.println("The current GPA is"+gpa[0]);
		break;
	case 2:
		gpa[1]=bio.sem2();
		System.out.println("The current GPA is"+gpa[1]);
		break;
	case 3:
		gpa[2]=bio.sem3();
		System.out.println("The current GPA is"+gpa[2]);
		break;
	case 4:
		gpa[3]=bio.sem4();
		System.out.println("The current GPA is"+gpa[3]);
		break;
	case 5:
		gpa[4]=bio.sem5();
		System.out.println("The current GPA is"+gpa[4]);
		break;
	case 6:
		gpa[5]=bio.sem6();
		System.out.println("The current GPA is"+gpa[5]);
		break;
	case 7:
		gpa[6]=bio.sem7();
		System.out.println("The current GPA is"+gpa[6]);
		break;
	case 8:
		gpa[7]=bio.sem8();
		System.out.println("The current GPA is"+gpa[7]);
		break;
	}
	System.out.println("do you want to calculate cgpa");
	String y=s.next();
	if(y.equals("yes"))
	{
		p.cgpa(gpa[n-1],n,c);
	}
	break;
case 2: 
	switch(n)
	{
	case 1: 
		gpa[0]=eee.sem1();
		System.out.println("The current GPA is"+gpa[0]);
		break;
	case 2:
		gpa[1]=eee.sem2();
		System.out.println("The current GPA is"+gpa[1]);
		break;
	case 3:
		gpa[2]=eee.sem3();
		System.out.println("The current GPA is"+gpa[2]);
		break;
	case 4:
		gpa[3]=eee.sem4();
		System.out.println("The current GPA is"+gpa[3]);
		break;
	case 5:
		gpa[4]=eee.sem5();
		System.out.println("The current GPA is"+gpa[4]);
		break;
	case 6:
		gpa[5]=eee.sem6();
		System.out.println("The current GPA is"+gpa[5]);
		break;
	case 7:
		gpa[6]=eee.sem7();
		System.out.println("The current GPA is"+gpa[6]);
		break;
	case 8:
		gpa[7]=eee.sem8();
		System.out.println("The current GPA is"+gpa[7]);
		break;
	}
	System.out.println("do you want to calculate cgpa");
	String x=s.next();
	if(x.equals("yes"))
	{
		p.cgpa(gpa[n-1],n,c);
	}
	break;
case 3: 
	switch(n)
	{
	case 1: 
		gpa[0]=Civil.sem1();
		System.out.println("The current GPA is"+gpa[0]);
		break;
	case 2:
		gpa[1]=Civil.sem2();
		System.out.println("The current GPA is"+gpa[1]);
		break;
	case 3:
		gpa[2]=Civil.sem3();
		System.out.println("The current GPA is"+gpa[2]);
		break;
	case 4:
		gpa[3]=Civil.sem4();
		System.out.println("The current GPA is"+gpa[3]);
		break;
	case 5:
		gpa[4]=Civil.sem5();
		System.out.println("The current GPA is"+gpa[4]);
		break;
	case 6:
		gpa[5]=Civil.sem6();
		System.out.println("The current GPA is"+gpa[5]);
		break;
	case 7:
		gpa[6]=Civil.sem7();
		System.out.println("The current GPA is"+gpa[6]);
		break;
	case 8:
		gpa[7]=Civil.sem8();
		System.out.println("The current GPA is"+gpa[7]);
		break;
	}
	System.out.println("do you want to calculate cgpa");
	String z=s.next();
	if(z.equals("yes"))
	{
		p.cgpa(gpa[n-1],n,c);
	}
	break;
case 4: 
	switch(n)
	{
	case 1: 
		gpa[0]=it.sem1();
		System.out.println("The current GPA is"+gpa[0]);
		break;
	case 2:
		gpa[1]=it.sem2();
		System.out.println("The current GPA is"+gpa[1]);
		break;
	case 3:
		gpa[2]=it.sem3();
		System.out.println("The current GPA is"+gpa[2]);
		break;
	case 4:
		gpa[3]=it.sem4();
		System.out.println("The current GPA is"+gpa[3]);
		break;
	case 5:
		gpa[4]=it.sem5();
		System.out.println("The current GPA is"+gpa[4]);
		break;
	case 6:
		gpa[5]=it.sem6();
		System.out.println("The current GPA is"+gpa[5]);
		break;
	case 7:
		gpa[6]=it.sem7();
		System.out.println("The current GPA is"+gpa[6]);
		break;
	case 8:
		gpa[7]=it.sem8();
		System.out.println("The current GPA is"+gpa[7]);
		break;
	}
	System.out.println("do you want to calculate cgpa");
	String u=s.next();
	if(u.equals("yes"))
	{
		p.cgpa(gpa[n-1],n,c);
	}
	break;

}
}
public void cgpa(double gpa1,int t,int c)
{
biotech bio=new biotech();
eee eee=new eee();
it it=new it();
Civil Civil=new Civil();
//Scanner sc=new Scanner(System.in);
String no;
System.out.println("do you know the previous cgpa");
no=s.next();
	if(no.equals("yes"))
	{
		System.out.println("enter the previous cgpa");
		prev=s.nextDouble();
		cgpa=(gpa1+prev)/2;
		System.out.println("CGPA is"+cgpa);
	}
	else
	{
	switch(c)
	{
	case 1:
	switch(t)
	{
	case 1: cal();
		System.out.println("CGPA is"+ini);
		break;
	case 2: 
		gpa[0]=bio.sem1();
		cal();
		System.out.println("CGPA is"+frst2);
		break;
	case 3: 
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		cal();
		System.out.println("CGPA is"+secd1);
		break;
	case 4: 
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		gpa[2]=bio.sem3();
		cal();
		System.out.println("CGPA is"+secd2);
		break;
	case 5: 
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		gpa[2]=bio.sem3();
		gpa[3]=bio.sem4();
		cal();
		System.out.println("CGPA is"+trid1);
		break;
	case 6: 
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		gpa[2]=bio.sem3();
		gpa[3]=bio.sem4();
		gpa[4]=bio.sem5();
		cal();
		System.out.println("CGPA is"+trid2);
		break;
	case 7: 
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		gpa[2]=bio.sem3();
		gpa[3]=bio.sem4();
		gpa[4]=bio.sem5();
		gpa[5]=bio.sem6();
		cal();
		System.out.println("CGPA is"+fin1);
		break;
	case 8:
		gpa[0]=bio.sem1();
		gpa[1]=bio.sem2();
		gpa[2]=bio.sem3();
		gpa[3]=bio.sem4();
		gpa[4]=bio.sem5();
		gpa[5]=bio.sem6();
		gpa[6]=bio.sem7();
		cal();
		System.out.println("CGPA is"+fin2);
		break;
	}
	break;
	case 2:
	switch(t)
	{
	case 1: cal();
		System.out.println("CGPA is"+ini);
		break;
	case 2: 
		gpa[0]=eee.sem1();
		cal();
		System.out.println("CGPA is"+frst2);
		break;
	case 3: 
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		cal();
		System.out.println("CGPA is"+secd1);
		break;
	case 4: 
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		gpa[2]=eee.sem3();
		cal();
		System.out.println("CGPA is"+secd2);
		break;
	case 5: 
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		gpa[2]=eee.sem3();
		gpa[3]=eee.sem4();
		cal();
		System.out.println("CGPA is"+trid1);
		break;
	case 6: 
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		gpa[2]=eee.sem3();
		gpa[3]=eee.sem4();
		gpa[4]=eee.sem5();
		cal();
		System.out.println("CGPA is"+trid2);
		break;
	case 7: 
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		gpa[2]=eee.sem3();
		gpa[3]=eee.sem4();
		gpa[4]=eee.sem5();
		gpa[5]=eee.sem6();
		cal();
		System.out.println("CGPA is"+fin1);
		break;
	case 8:
		gpa[0]=eee.sem1();
		gpa[1]=eee.sem2();
		gpa[2]=eee.sem3();
		gpa[3]=eee.sem4();
		gpa[4]=eee.sem5();
		gpa[5]=eee.sem6();
		gpa[6]=eee.sem7();
		cal();
		System.out.println("CGPA is"+fin2);
		break;
	}
	break;
	case 3:
	switch(t)
	{
	case 1: cal();
		System.out.println("CGPA is"+ini);
		break;
	case 2: 
		gpa[0]=Civil.sem1();
		cal();
		System.out.println("CGPA is"+frst2);
		break;
	case 3: 
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		cal();
		System.out.println("CGPA is"+secd1);
		break;
	case 4: 
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		gpa[2]=Civil.sem3();
		cal();
		System.out.println("CGPA is"+secd2);
		break;
	case 5: 
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		gpa[2]=Civil.sem3();
		gpa[3]=Civil.sem4();
		cal();
		System.out.println("CGPA is"+trid1);
		break;
	case 6: 
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		gpa[2]=Civil.sem3();
		gpa[3]=Civil.sem4();
		gpa[4]=Civil.sem5();
		cal();
		System.out.println("CGPA is"+trid2);
		break;
	case 7: 
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		gpa[2]=Civil.sem3();
		gpa[3]=Civil.sem4();
		gpa[4]=Civil.sem5();
		gpa[5]=Civil.sem6();
		cal();
		System.out.println("CGPA is"+fin1);
		break;
	case 8:
		gpa[0]=Civil.sem1();
		gpa[1]=Civil.sem2();
		gpa[2]=Civil.sem3();
		gpa[3]=Civil.sem4();
		gpa[4]=Civil.sem5();
		gpa[5]=Civil.sem6();
		gpa[6]=Civil.sem7();
		cal();
		System.out.println("CGPA is"+fin2);
		break;
	}
	break;
case 4:
	switch(t)
	{
	case 1: cal();
		System.out.println("CGPA is"+ini);
		break;
	case 2: 
		gpa[0]=it.sem1();
		cal();
		System.out.println("CGPA is"+frst2);
		break;
	case 3: 
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		cal();
		System.out.println("CGPA is"+secd1);
		break;
	case 4: 
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		gpa[2]=it.sem3();
		cal();
		System.out.println("CGPA is"+secd2);
		break;
	case 5: 
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		gpa[2]=it.sem3();
		gpa[3]=it.sem4();
		cal();
		System.out.println("CGPA is"+trid1);
		break;
	case 6: 
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		gpa[2]=it.sem3();
		gpa[3]=it.sem4();
		gpa[4]=it.sem5();
		cal();
		System.out.println("CGPA is"+trid2);
		break;
	case 7: 
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		gpa[2]=it.sem3();
		gpa[3]=it.sem4();
		gpa[4]=it.sem5();
		gpa[5]=it.sem6();
		cal();
		System.out.println("CGPA is"+fin1);
		break;
	case 8:
		gpa[0]=it.sem1();
		gpa[1]=it.sem2();
		gpa[2]=it.sem3();
		gpa[3]=it.sem4();
		gpa[4]=it.sem5();
		gpa[5]=it.sem6();
		gpa[6]=it.sem7();
		cal();
		System.out.println("CGPA is"+fin2);
		break;
	}
	break;
	
	
	}
}
}
public void cal()
{
	
	ini=gpa[0];
	frst2=(gpa[0]+gpa[1])/2;
	secd1=(frst2+gpa[2])/2;
	secd2=(secd1+gpa[3])/2;
	trid1=(secd2+gpa[4])/2;
	trid2=(trid1+gpa[5])/2;
	fin1=(trid2+gpa[6])/2;
	fin2=(fin1+gpa[7])/2;
}
}
	