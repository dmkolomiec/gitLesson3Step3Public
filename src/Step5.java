public class Step5 {
    static void PrintArray(char arrayName, int[][][] a) {
        System.out.println("");
        for(int i= 0; i<a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++)
                    System.out.printf("%c[%d][%d][%d] = %3d ", arrayName, i, j, k, a[i][j][k]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int a[][][] = new int[3][3][3],
                b[][][] = new int[3][3][3],
                c[][][] = new int[3][3][3];
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                for(int k=0; k<a[i][j].length; k++) {
                    a[i][j][k] = (int)(Math.random() * a.length * 10);  // випадкове ціле у диапазоні [0, sz*10];
                    b[i][j][k] = (int)(Math.random() * a.length * 10);  // випадкове ціле у диапазоні [0, sz*10];
                    c[i][j][k] = a[i][j][k] + b[i][j][k];
                }

        PrintArray('a', a);
        PrintArray('b', b);
        PrintArray('c', c);

    }
}
