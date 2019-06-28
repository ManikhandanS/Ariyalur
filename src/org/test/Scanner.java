package org.test;
public class Scanner 
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter the Employee id");
int empid=sc.nextint();
System.out.println("Entered the empid is"+empid);
System.out.println("Please Enter the Employee Name");
String empname=sc.next();
System.out.println("Entered the empid is"+empname);
System.out.println("Please Enter the Employee mob no");
long empno=sc.nextlong();
System.out.println("Entered the empid is"+empno);

}
}
