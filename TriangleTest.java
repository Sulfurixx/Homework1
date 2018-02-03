////////////////////////////////////////////////
// CSCI 145
// Dr. Deneke
// TA: Trevor Donelly
// Lab 3
// Programmer: Micah Hollen
// Submission Date: 01/26/2018
/////////////////////////////////////////////////

/////////////////////////////////////////////////
//Class Description:
//  User inputs 3 sides for a triangle. Instantiate
//  Triangle class to determine if the triangle
//  is a right triangle and prints the result.
/////////////////////////////////////////////////

import java.util.Scanner;

public class TriangleTest {
    public void test(){
        Scanner input = new Scanner(System.in);
        Triangle userTriangle = new Triangle();

        while (true) {
            System.out.print("Enter side 1: ");
            userTriangle.setSide1(input.nextDouble());

            System.out.print("Enter side 2: ");
            userTriangle.setSide2(input.nextDouble());

            System.out.print("Enter side 3: ");
            userTriangle.setSide3(input.nextDouble());

            if (userTriangle.getSide1() == 0 && userTriangle.getSide2() == 0 && userTriangle.getSide3() == 0){
                System.out.println("Exiting...");
                break;
            }

            if (userTriangle.isRightTriangle()) {
                System.out.println("It IS a right triangle! ");
            } else {
                System.out.println("That is NOT a right triangle. ");
            }
        }
    }

    public static void main (String[] args){
        TriangleTest t = new TriangleTest();
        t.test();
    }
}
