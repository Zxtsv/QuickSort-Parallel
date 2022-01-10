/*
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
*/

public class MyFirstRunnable implements Runnable {
    int[] arr;
    int l;
    int r;

    public MyFirstRunnable(int[] arr, int l, int r) {
        this.arr = arr;
        this.l = l;
        this.r = r;

    }

    @Override
    public void run() {
        QuickParallel sort = new QuickParallel();
        try {
            QuickParallel.quickSort(arr, l, r);
        } catch (InterruptedException ex) {
            //Logger.getLogger(MyFirstRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
