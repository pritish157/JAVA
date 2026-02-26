package Inheritance;
class Myparent extends Mychild{
	
}

class Mychild extends Myparent{
	
}
public class Cyclic {
public static void main(String[] args) {
	Mychild c=new Mychild();
}
}
