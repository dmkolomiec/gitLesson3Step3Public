import java.util.Arrays;
import java.util.Scanner;

public class CustomerArray {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        int sz = 0, a[], max, min, sum, avg;

        System.out.print("Введіть розмір масиву: ");
        sz = inp.nextInt();
        sz = Math.abs(sz);
        if ((sz <= 0) || (sz > 100))
            return;

        a = new int[sz];
        for(int i= 0; i<a.length; i++) {
            a[i] = (int)(Math.random() * sz * 10);  // випадкове ціле у диапазоні [0, sz*10];
            System.out.printf("a[%2d] = %3d %c\n", i+1, a[i], (a[i] & 1) == 0 ? 'П' : ' ');
        }
        max = min = a[0];
        sum = 0;
        for (int ai : a) {// (int i= 0; i<a.length; i++) {
            min = Math.min(min, ai);
            max = Math.max(max, ai);
            sum += ai;
        }
       avg = sum / a.length;

        System.out.printf("\nmin = %d\nmax = %d\nsum = %d\navg = %d\n", min, max, sum, avg);

    }
}
