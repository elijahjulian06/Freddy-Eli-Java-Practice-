import java.util.Scanner;

public class Main
{


// public boolean isPrime(int n)
// {
//     //n is prime if it divisible by only its self and one.
//     //we know n is diviible by itself
//     //we know its divible by 1 
//     // so we check whats between 1 and n
//     //
//     //
//     //loop throught ever single variable less then 7 and greater or equal to 2 

//     for(int i = 2; i < n ; i++)
//     {
//         //
//         if(n % i == 0)
//         {
//             return false;
//         }
//     }
//     return true;

// }
// // palidrome checker
// // takes in a string
// // and return true if it is a palidrome -> else false.
// public boolean palidromeChecker(String p)
// {
    
//     //need a for loop
//     //if statements inside for loop. if index is equal to another.
//     //if it is not equal we return false. else its true 
//     if(p.isEmpty() == true)
//     {
//       return false;
//     }

//     for(int i = 0, j = p.length() - 1; i < p.length(); i++, j--)
//     {
//         if(p.charAt(i) != p.charAt(j))
//         {
//             return false;
//         }
//     }
//     return true;
// }

// public static void main(String[] args)
// {
    
//     //System.out.println("poop".length());
//     Main main = new Main();
//     /**
//     System.out.println(main.palidromeChecker("101010101010101")); //false
//     System.out.println(main.palidromeChecker("poop")); //true
//     System.out.println(main.palidromeChecker("dog")); //false
//     */
//     System.out.println(main.isPrime(7)); //true
//     System.out.println(main.isPrime(10)); //false
//     System.out.println(main.isPrime(1));

// }

public static void main(String[] args)
{
    //main should make a rectangle object, then set the length, width, color with the constructor. Then print
    //Then set them using the setters then print
    //then set the using the user input method then print.
    int length = 0;
    int width = 0;
    String color = "blue";

    Rectangle rectangle = new Rectangle(length, width, color);

    rectangle.setLength(6);
    rectangle.setWidth(4);

    rectangle.color = "pink";

    Scanner input = new Scanner(System.in);

    rectangle.userInput(input);


    System.out.println(rectangle.toString());


    
}

}
