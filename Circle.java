package com.cognizant.shapes;

import java.util.Scanner;
// problem Statement1
public class Circle
{
float radius; // declaring instance variable radius
static float pi=3.5f;

public Circle() // default constructor1
{
	radius=1.5f;
}


public Circle(float radius) // constructor 2
{
	this.radius=radius;
	
}

public Circle(float radius,float pi)  // constructor 3

// Constructor chaining using cons2
{
	
this.radius=radius;
}

static float calculateCircleArea(float radius) // Method 1
{
	return pi*radius*radius;
}

static float calculateCircumference(float radius) // Method2
{
	return 2*radius*radius;
}
public static void main(String args[]) {
	Circle c = new Circle();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Radius:- ");
	float radius = sc.nextFloat();
	System.out.println("The Area is: "+calculateCircleArea(radius));
	System.out.println("The Circumference is :- "+calculateCircumference(radius));
	
	
	
}
}