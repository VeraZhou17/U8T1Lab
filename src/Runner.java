import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] stringArr = {{"Abby", "Don", "George", "Kim"},
                                {"Brian", "Eleanor", "Harry", "Lenny"},
                                {"Cathy", "Fred", "Jill", "Matt"}};
        stringArr[1][2] = "Paul";

        String temp = stringArr[0][0];
        stringArr[0][0] = stringArr[2][3];
        stringArr[2][3] = temp;

        String[] temp1 = stringArr[0];
        stringArr[0] = stringArr[1];
        stringArr[1] = temp1;


        for (String[] oneStrArr : stringArr)
        {
            System.out.println(Arrays.toString(oneStrArr));
        }
        System.out.println(stringArr[0][2] + stringArr[2][0]);

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;

        for (int[] innerArr : arr1)
        {
            System.out.println(Arrays.toString(innerArr));
        }

        for (int[] innerArr : arr2)
        {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println(arr1[0][2] + arr2[2][0]);
    }
}
