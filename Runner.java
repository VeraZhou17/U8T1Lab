import java.util.Array;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] stringArr = {{Abby, Don, George, Kim}, {Brian, Eleanor, Harry, Lenny}, {Cathy, Fred, Jill, Matt}};

        for (String[] oneStrArr : stringArr)
        {
            System.out.println(Arrays.toString(oneStrArr));
        }
    }
}
