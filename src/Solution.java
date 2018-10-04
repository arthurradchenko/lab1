public class Solution {
    int[][] array;
    public static int[][] solve(int[][] array){
        int counter, temp;
        for (int i=0; i<array.length; i++) {
            counter = 0; temp = 0;
            for (int j = 0; j < array[i].length - counter; j++) {
                if (array[i][j] == 0) {
                    temp = array[i][array[i].length - 1 - counter];
                    array[i][array[i].length - 1 - counter] = array[i][j];
                    array[i][j] = temp;
                    counter++;
                }
            }
        }
        return array;
    }
    public static int [][] random(int[][] array){
        for (int i=0;i<array.length;i++)
            for (int j=0;j<array[i].length;j++)
                array[i][j]=(int)(Math.random()*10);
        return array;
    }
    public static void out(int[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.print("\n");
            System.out.println();
        }
    }
}
