public class MultiDimStrings {
    public static void main(String[] args){
        int[][] brown= {
                {1, 2, 3, 4, 5},
                {2, 4, 6},
                {1, 2}
        };
        for(int row = 0; row<brown.length; row++){
            for(int col = 0; col<brown[row].length; col++){
                System.out.print(brown[row][col] + '\t');

            }
            System.out.println();
        }

    }
}
