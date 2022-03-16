public class FunWith2DArrays
{
    public static int totalElements(int[][] intArr)
    {
        return (intArr.length) * (intArr[0].length);
    }

    public static void fourCorners(String[][] strArr)
    {
        int numOfRows = strArr.length;
        int numOfCol = strArr[0].length;

        System.out.println(strArr[0][0]);
        System.out.println(strArr[0][numOfCol - 1]);
        System.out.println(strArr[numOfRows - 1][0]);
        System.out.println(strArr[numOfRows - 1][numOfCol - 1]);
    }

    public static double average(int[][] intArr)
    {
        double total = 0;
        int countOfNums = 0;
        for (int[] row : intArr)
        {
            for (int col : row)
            {
                countOfNums++;
                total += col;
            }
        }
        return total / countOfNums;
    }

    public static int[] indexFound(String[][] strArr, String target)
    {
        int[] idxArr = new int[2];
        idxArr[0] = -1;
        idxArr[1] = -1;
        for (int row = 0; row < strArr.length; row++)
        {
            for (int col = 0; col < strArr[0].length; col++)
            {
                String output = strArr[row][col];
                if (output.equals(target))
                {
                    idxArr[0] = row;
                    idxArr[1] = col;
                }
            }
        }
        return idxArr;
    }
}
