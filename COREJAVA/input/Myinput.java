package input;

import java.util.Scanner;

public class Myinput {
String name; int age; boolean status; double salary;

	public static void main(String[] args) {
Myinput i =new Myinput();
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter your name:");
   i.name = scanner.next();
  
  System.out.println("enter your age:");
  i.age = scanner.nextInt();
  System.out.println("enter your marital status:");
  i.status=scanner.nextBoolean();
  System.out.println("enter your salary:");
  i.salary=scanner.nextDouble();

  System.out.println("My name is :"+i.name);
  System.out.println("My salary is :"+i.salary); 
  System.out.println("My marital status is :"+i.status); 
  System.out.println("My age is :"+i.age);
  
  
 scanner.close();
 

//System.out.println(i.age);
//System.out.println(i.name);
//System.out.println(i.salary);
//System.out.println(i.status);
//
//i.name ="raj";
//i.age = 12;
//i.status=false;
//i.salary=20;
//
//
//System.out.println(i.age);
//System.out.println(i.name);
//System.out.println(i.salary);
//System.out.println(i.status);
	}

}
