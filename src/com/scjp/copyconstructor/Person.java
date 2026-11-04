package com.scjp.copyconstructor;

public class Person {
private String name;
private int age;

//default constructor
public Person() {
	
}
// Parameterized constructor
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

//copy constructor

 public Person(Person person) {
	 this.name=person.name;
	 this.age=person.age;
 }

}
