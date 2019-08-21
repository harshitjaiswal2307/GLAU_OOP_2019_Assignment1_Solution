/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
        double time;
        double distance;
        double speed;
        float gravity = 9.8;
        Scanner sc = new Scanner(System.in);
        time = sc.nextDouble();
        speed = gravity * (time);
        distance = 0.5 * gravity * (time * time);
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
		/* TODO 2:
         *   c.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
