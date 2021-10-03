//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//5.Program to create custom exception in java


public class UnderAgeException extends Exception { //class in checked exception category
    UnderAgeException()
    {
        super("you are under age");
    }

    UnderAgeException(String message) {
        super(message);   //super keyword is used to make the description available to the default exception handler

    }
}
class Voting {
    public static void main(String[] args) {
        int age = 16;
        try {

            if (age < 18) {
                throw new UnderAgeException("you cannot vote as your age is below 18");
            }
            else
            {
                System.out.println("you can vote now..........");
            }
        }
        catch (UnderAgeException e)
        {
            e.printStackTrace();
        }
    }
}

