import java.util.Scanner;

public class ReversedArray {
    static Scanner inp = new Scanner(System.in);
    static void PrintArray(char arrayName, int[] a) {
        for(int i= 0; i<a.length; i++)
            System.out.printf("%c[%d] = %3d\n", arrayName, i, a[i]);
    }
    static int[] myReverse(int [] a) {
        int b[] = new int[a.length];

        for(int i= 0; i<a.length; i++) {
            b[a.length-i-1] = a[i];
        }
        return b;
    }

    static int [] subArray (int [] a, int index, int count) {
        int b[] = new int[count], j=0;
        if(index > a.length) {
            System.out.println("Початкова позиція нового масиву більше розміру початкового масиву");
            return b;
        }
        for(int i= index; i < Math.min(a.length, index+count); i++)
            b[j++] = a[i];
        for (int i=j; i < b.length; i++)
           b[i] = 1;
        return b;
    }


    public static void main(String[] args) {
        int sz = 0, a[], b[], c[];

        System.out.print("Введіть розмір масиву (рек.10): ");
        sz = inp.nextInt();
        sz = Math.abs(sz);
        if ((sz <= 0) || (sz > 100))
            return;

        a = new int[sz];
        for(int i= 0; i<a.length; i++) {
            a[i] = (int)(Math.random() * sz * 10);  // випадкове ціле у диапазоні [0, sz*10];
        }
        PrintArray('a', a);

        // Інвертований масив
        System.out.println("\nІнвертований масив");
        b = myReverse(a);
        for(int i= 0; i<b.length; i++)
            System.out.printf("%3d %3d\n", a[i], b[i]);

        // Копіювання масиву
        System.out.println("\nКопіювання масиву (3, 6)");
        c = subArray(a,3, 6);
        PrintArray('c', c);

        System.out.println("\nКопіювання масиву (8, 5)");
//        c = new int[0];
        c = subArray(a, 8, 5);
        PrintArray('c', c);
    }
}
