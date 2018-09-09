package prograde;
import java.util.*;
public class gradepro
{
public static int grade(String g)
{
String A="a+",B="b+",C="ra";
String O="o",a="a",b="b";
int t=0;
	if(g.equalsIgnoreCase(O))
	{
		t=10;
	}
	if(g.equalsIgnoreCase(A))
	{
		t=9;
	}
	if(g.equalsIgnoreCase(a))
	{
		t=8;
	}
	if(g.equalsIgnoreCase(B))
	{
		t=7;
	}
	if(g.equalsIgnoreCase(b))
	{
		t=6;
	}
	if(g.equalsIgnoreCase(C))
	{
		t=0;
	}

return t;
}
}