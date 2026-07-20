import java.util.*;

class rectangle 
{
int l;
int b;

void accept()
{
Scanner t=new Scanner(System.in);
System.out.println("Enter the lenght and breadth of a rectangle :");
l=t.nextInt();
b=t.nextInt();
}
	
void area()
{
int area =l*b;
System.out.println("Area of rectangle : "+area);
}
}


class rect
{
public static void main(String x[])
{
rectangle r1=new rectangle();
r1.accept();
r1.area();

rectangle r2=new rectangle();
r2.accept();
r2.area();
}
}
