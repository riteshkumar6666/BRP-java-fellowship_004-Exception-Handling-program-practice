//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//3.program illustrating throws keyword

import java.util.Scanner;
public class YoungerAgeException extends RuntimeException
{
    YoungerAgeException(String msg)
    {
        super(msg);
    }
}
class voting
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age: ");

        int age= sc.nextInt();

        if (age<18)
        {
            throw new YoungerAgeException("your are not eligible for voting");
        }
        else
        {
            System.out.println("you can vote successful");
        }
    }
}
