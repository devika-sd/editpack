package prograde;
import java.util.*;
public class gradepro
{
public static int grade(String g)
{
String A="a+",B="b+",C="ra";
String O="o",a="a",b="b";
int t=0;
	if(g.equals(O))
	{
		t=10;
	}
	if(g.equals(A))
	{
		t=9;
	}
	if(g.equals(a))
	{
		t=8;
	}
	if(g.equals(B))
	{
		t=7;
	}
	if(g.equals(b))
	{
		t=6;
	}
	if(g.equals(C))
	{
		t=0;
	}

return t;
}
}