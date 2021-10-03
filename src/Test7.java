//***BRP-java_fellowship-004(classroom practice) PROGRAM***
//7.program to prevent creation of second object

class NotMoreException extends Exception
{
    NotMoreException()
    {
        super("No more than 1 object");
    }
}
class Test
{
    static int cnt=0;
    Test() throws NotMoreException
    {
        if (cnt == 0)
        {
            cnt++;
        }
        else
            throw new NotMoreException();
    }
}
class Test7
{
    public static void main(String[] args)
    {
        try
        {
            Test t1 = new Test();
            Test t2 = new Test();
            Test t3 = new Test();
        }
        catch (NotMoreException ex)
        {
            System.out.println(ex);
        }
    }
}
