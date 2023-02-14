public class Arrays {
    static void PrintArray(char arrayName, int[] a) {
        for(int i= 0; i<a.length; i++)
            System.out.printf("%c[%d] = %3d\n", arrayName, i, a[i]);
    }
    static void PrintArrayRev(char arrayName, int[] a) {
        for(int i=a.length - 1; i>=0; i--)
            System.out.printf("%c[%d] = %3d\n", arrayName, i, a[i]);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i= 0; i<a.length; i++)
            a[i] = (int)(Math.random() * 100);  // випадкове ціле у диапазоні [0, 100];
        PrintArray('a', a);
        System.out.println("");
        PrintArrayRev('a', a);

    }
}
