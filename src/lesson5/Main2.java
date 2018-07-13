package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int [][] numbers=new int[3][9];
        for (int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                numbers[i][j] = 2;
            }
        }

        for (int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
