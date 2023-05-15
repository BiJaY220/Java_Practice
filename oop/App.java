package com.examples.j2se.oop;

public class App {
	//collection of properties and behaviour
	//collection of methods 
	//create class contructors 
	//under class human objects john and joe 
	//Attributes are state of an object
	//Methods are behaviour of an object
	
	//changes can be easily implemented 
	public static void main(String[] args) {
		Dog dog = new Dog("pub","off white");
		Dog d2 = new Dog(2,"German Shepherd","brown");
		
		
		
		
		//dog.age = 2;
		dog.treat();
		dog.threat();
		System.out.println(dog.toString());
		System.out.println(d2);
		//System.out.println(d2);
		
		
	}
}
class Dog {
		 String breed;//static variable
		int age;//instance variable
		String color;
		public Dog(String breed, String color){
			this.breed= breed;
			this.color = color;
			
		}
		public Dog(String b, int a, String c) {
			super();
			this.breed = b;
			this.age = a;
			this.color = c;
		}

		public Dog() {
			super();//dog class is dependent on super class called object class
			// TODO Auto-generated constructor stub
		}
		public Dog(int age, String breed , String color) {
			this.age = age;
			this.breed = breed;
			this.color = color;
			
		}
		//multiple constructor of same class : constructor overloading  
		//if static then that property belongs to the class not to the object 
		
		
		 void threat() {
			System.out.println("Barking..");
		}
		 void treat() {
			System.out.println("sway tail");
		
		}
		@Override
		public String toString() {
			return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
		}
		
		 //here methods threat , treat and display has return type void .. and string 
	}

	//here App() is a constructor 
	//no explicit return type 
	//used to initializa a objects 
	//if constructor is not defined a default constructor is defined 
	

