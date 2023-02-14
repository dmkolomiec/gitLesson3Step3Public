public class Step6 {
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

    static int[][][] Array3Add(int[][][] a, int[][][] b) {
        int c[][][] = new int[a.length][a[0].length][a[0][0].length];

        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                for(int k=0; k<a[i][j].length; k++) {
                    c[i][j][k] = a[i][j][k] + b[i][j][k];
                }
        return c;
    }

    public static void main(String[] args) {
        int a[][][] = new int[3][3][3],
            b[][][] = new int[3][3][3],
            c[][][] ;
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[i].length; j++)
                for(int k=0; k<a[i][j].length; k++) {
                    a[i][j][k] = (int)(Math.random() * 100);  // випадкове ціле у диапазоні [0, 100];
                    b[i][j][k] = (int)(Math.random() * 100);  // випадкове ціле у диапазоні [0, 100];
                }

        PrintArray('a', a);
        PrintArray('b', b);
        c = Array3Add(a,b);
        PrintArray('c', c);

    }
}
