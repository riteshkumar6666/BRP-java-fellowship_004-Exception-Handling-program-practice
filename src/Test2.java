//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//2.program for multiple catch block with single try block in java

public class Test2 {
    public static void main(String[] args) {
        try {
            int array[]=new int[10];
            array[10]=30/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
