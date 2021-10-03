//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//4.program for chained exception in java


public class ChainedException
{
    public static void main(String[] args)
    {
        try
        {
            Exception ex = new Exception("Exception");
            ex.initCause(new ArithmeticException("Cause of the ArithmeticException"));
            throw ex;
        }
        catch (Exception ex)
        {
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
        try
        {
            NumberFormatException ex = new NumberFormatException("NumberFormatException");
            ex.initCause(new NullPointerException("Cause of the NullPointerException"));
            throw ex;
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}


