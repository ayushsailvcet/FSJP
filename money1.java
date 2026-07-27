import java.util.*;
class money{
int rs,ps;
	
money(){
Scanner t=new Scanner(System.in);
System.out.println("enter the money in rupees and paise");
rs=t.nextInt();
ps=t.nextInt();
}

money(int a ,int b){
rs =a;
ps=b;
}
void convert(){
int a=rs*100+ps;
System.out.println("Amount in paise ="+a);
}
}

class money1{
public static void main(String args[])
{
money m1 =new money (5,50);
m1.convert();
money m2 =new money();
m2.convert();
}
}
