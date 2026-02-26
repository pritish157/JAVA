package Inheritance;


class Dad{
public void calling() {
	System.out.println("dad is calling");

}
}
class Son1 extends Dad{
	
}
class Son2 extends Dad{
	
}
class Son3 extends Dad{
	
}

public class Hierarchial {
public static void main(String[] args) {
Son1 s = new Son1();
s.calling();
}
}
