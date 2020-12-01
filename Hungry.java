import java.util.*;
class Hungry
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter stomach status");
String Stomach=sc.nextLine();
if(Stomach.equals("Empty"))
{
System.out.println("Yeah am hungry");
}
else if(Stomach.equals("Not Hungry"))
{
System.out.println("No am ok");
}
else
{
System.out.println("I am Full");
}
}
}