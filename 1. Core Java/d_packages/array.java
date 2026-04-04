public class array {
    public static void main(String a[]){
        int nums[] = {6, 7};
        System.out.println(nums[0]);
        nums[1] = 9;
        System.out.println(nums[1]);

        // dynamic
        int vals [] = new int[4];
        for (int i = 0; i < 4; i++) vals[i] = i + 1;
        for (int i = 0; i < 4; i++) System.out.println(vals[i]);

        // multidimensional array;
        int mat[][] = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for (int i[] : mat){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.err.println();
        }
        // jagged array
        int jag [][] = new int[3][];
        jag[0] = new int[3];
        jag[1] = new int[4];
        jag[2] = new int[2];
        for (int i = 0; i < jag.length; i++){
            for (int j = 0;j < jag[i].length; j++) System.out.print(jag[i][j]);
            System.err.println();
        }
        // enhanced for loop
        for (int i[] : jag){
            for (int j : i) System.out.print(j);
            System.err.println();
        }
    }
}
