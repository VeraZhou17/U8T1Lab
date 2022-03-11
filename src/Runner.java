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

        // TEST CODE for totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));


    }
}
