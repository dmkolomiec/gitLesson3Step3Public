import java.util.Scanner;

public class UserArray {
    static Scanner inp = new Scanner(System.in);
    static void PrintArray(char arrayName, int[] a) {
        System.out.printf("%c : ", arrayName);
        for(int ai : a)
            System.out.printf("%4d ", ai);
        System.out.println("");
    }
    static int[] IncreaseArray(int[] a) {
        int b[] = new int[a.length+1];
        for(int i=0; i<a.length; i++)
            b[i] = a[i];
        return b;
    }
    static int[] InsertElemInArray(int[] a, int val) {
        int b[] = new int[a.length+1];
        b[0] = val;
        for(int i=0; i<a.length; i++)
            b[i+1] = a[i];
        return b;
    }

    public static void main(String[] args) {
        int sz = 0, a[], b[];

        System.out.print("Введіть розмір масиву (рек.<=10): ");
        sz = inp.nextInt();
        sz = Math.abs(sz);
        if ((sz <= 0) || (sz > 100))
            return;

        a = new int[sz];
        for(int i= 0; i<a.length; i++) {
            a[i] = (int)(Math.random() * sz * 10);  // випадкове ціле у диапазоні [0, sz*10];
        }

        PrintArray('a', a);

        System.out.println("Збільшення на 1 елемент");
        b = IncreaseArray(a);
        PrintArray('b', b);

        System.out.println("Збільшення на 1 елемент");
        b = IncreaseArray(b);
        PrintArray('b', b);

        System.out.println("Додавання 1-го ел-та");
        b = InsertElemInArray(a, -33);
        PrintArray('b', b);

        System.out.println("Додавання 1-го ел-та");
        b = InsertElemInArray(b, -66);
        PrintArray('b', b);
    }
}
