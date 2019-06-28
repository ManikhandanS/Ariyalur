package org.test;

public class Methodol {
	
	public void dataBase(int id)
		{
		System.out.println("My id is");
			System.out.println(id);
		}
		private void dataBase(int id, String name)
		{
			System.out.println("My id and name is:"+id+"\t"+name);
		}
		private void dataBase(String email, float Salary, long mobno)
		{	
			System.out.println("My Email, Salary, Mob No is: \t"+email+"\t"+Salary+"\t"+mobno);
						
		}
	public static void main(String[] args)
	{
		Methodol t=new Methodol();
		t.dataBase(123);
		t.dataBase(1234,"Mani");
		t.dataBase("abc@gmail.com",150000,9865879632l);
		
		
	}

}
