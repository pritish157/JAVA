package Constructors;
//constructor is the special member of the class which carry same name as the class.
//it is also  a special setter provided by java[ context- we can set value using paramaterized constructors]
//also has no return.
//one const callling an other const. inside  the same class called as local const. chaining
//1-zero parameter constructor..-no input no output
//2-no arg. constructor-
//3-default constructor--addaed by compiler



class Tv {
 private  int volume;//encapsulated through private keyword
  private  int brightness;
  
  
  //non parameterized constructor:
  public Tv() {

System.out.println("non parameterized constructor.");
this(30,40);
}
  //parameterized constructor
  public Tv( int volume , int brightness) {
	
	  System.out.println("inside param.const.");
	 if(volume<=50 && brightness<=60) {
		 this.brightness = brightness;
		 this.volume = volume;
	 }else {
		 System.out.println("volume and brightness should be lesser than 50 and 60 respectively..");
	 }
}
  
  
  
 public int getVolume() {
	return volume;
}
//  public void setVolume(int volume) {
//    if(volume<=50) {
//    	this.volume=volume;
//    }
//    else {
//    	System.out.println("Volume can't be greater than 50.");
//    }
//  }
  public int getBrightness() {
	return brightness;
  }
//  public void setBrightness(int brightness) {
//	if(brightness<=60) {
//		this.brightness = brightness;
//	}
//	else {
//		System.out.println("Brighthness can't be more than 60");
//	}
//  }
	public void watchMovie() {
        System.out.println("Watching movie in a TV.");
    }
}

class Fan {
	int speed ;
	public void speed() {
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed <=30) {
			this.speed=speed;
		}
		else {
			System.out.println("maximum speed should be 30");
		}
	}
	
}

public class Home {
    public static void main(String... args) {
    	Tv t = new Tv();//default constructor
//        Tv t = new Tv(30,40);
        //t.volume = 50;
        //t.brightness = 60;

        //System.out.println(t.volume);
        //System.out.println(t.brightness);
        
//        t.setVolume(50);
//        t.setBrightness(60);
        System.out.println("volume is :"+t.getVolume());
        System.out.println("brightness is :"+t.getBrightness());
////for class Fan...
         Fan f =	new Fan();
         f.setSpeed(30);
        // System.out.println("speed of the fan:"+f.getSpeed());
   
    }
}
