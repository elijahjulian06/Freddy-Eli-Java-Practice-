//private vars named length and width
//public var called color
//getters and setters for both length and width
//print method that prints the length,width,color
//user input -> that ask for the length, width, color
//main should make a rectangle object, then set the length, width, color with the constructor. Then print
//Then set them using the setters then print
//then set the using the user input method then print.

import java.util.Scanner;

public class Rectangle
{
    private int length;
    private int width;

    public String color;

    public Rectangle()
    {
        System.out.print("no-arg Rectangle");
    }

    public Rectangle(int length, int width, String color)
    {
        this.length = length;
        this.width = width;

        this.color = color;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        String str = "Length: " + length + " Width: " + width + " Colour: " + color;

        return str;
    }

    public void userInput(Scanner input)
    {
        System.out.println("Enter a length: ");
        length = input.nextInt();

        System.out.println("Enter a width: ");
        width = input.nextInt();

        input.nextLine();
        System.out.println("Enter a colour: ");
        color = input.nextLine();
    }

}
