//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//1.program with try and catch & finally block in java

public class Test1 {
    public static void main(String[] args) {

        try {
              int a=100,b=0,c;
              c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("BridgelabzJava");

        }
    }
}
