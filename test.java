package CS1301Homework;

public class test 

{

public static void main(String[] args)
	
{

int a, b, c;
a = 1;
b = 2;
c = 6;

while (c > 0)
	
{
	
	if(c%2==1)
	{
		a = a*b;
	}
	
	b = b*b;
	c = c/2;
	
	System.out.println(a+ "," +b+ "," +c);
	
}
}

}