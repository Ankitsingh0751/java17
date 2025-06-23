package com.lti.demos7.generics;
//covariance : accept subtype 
 class Animal {
	String name;
		public Animal(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	// see return thpe 
	public Animal reproduce() {
		System.out.println("Base animal reproduces");
		return new Animal(name);
	}
	public Number display() {
		System.out.println("Base animal reproduces");
		return 100;
	}

	public Animal mate(Animal oher){
        System.out.println("in base animal");
        return new Animal(this.name+" "+oher.getName());
    }
}

 class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	// see return type 
	//java has automatic covariance on function return parameters.
	
	@Override
	public Cat reproduce() {
		System.out.println("Cat reproduces");
		return new Cat(this.name + "Junior");
	}
	
	public Number display() {
		System.out.println("Base animal reproduces");
		return 100;
	}
	// @Override
    public Cat mate(Animal a){
        System.out.println("in cat");
        return new Cat(this.name+ " "+a.getName());
    }
  //*** Java is covariant  on *** return types only.
//  this is not overriding bec input para is diff ..this is totaly new method 
    public Cat mate(Cat a){
        System.out.println("in cat");
        return new Cat(this.name+ " "+a.getName());
    }
}

public class CovarienceExInher {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Animal");
		a.reproduce();
		
		Cat c = new Cat("Tom");
		c.reproduce();
		
		c.mate(c); // method overloading 
		c.mate(a); //
		
		// if you want more excusive use generics 
		
		//exclusively with other cats and no other animals, 
		//we need to use generics.
		
		
		
		
		Integer one = Integer.valueOf(1);
		Number numberOne = one;
	}
	

}
