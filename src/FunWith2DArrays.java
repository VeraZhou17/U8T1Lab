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
}
