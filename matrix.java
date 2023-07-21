public class matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        System.out.println("The matrix is: ");
        for(int[] row : matrix){
            for(int column : row){
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
