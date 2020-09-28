import javax.xml.ws.AsyncHandler;
import java.util.Arrays;

/**
 * @Classname Test
 * @Description 比较次数只有3(n / 2)
 * @Date 2020/9/24 19:59
 * @Created by 94493
 */
public class Test {
    public static int count = 0;

    public static void main(String[] args) {
        MM mm = new MM();
        int[] arr = {2, 1, 3, 4, 12, 9, 3};
        findMM(arr, 0, arr.length - 1, mm);
        System.out.println(mm.Max);
        System.out.println(mm.Min);
    }

    public static void findMM(int[] arr, int l, int r, MM mm) {
        count++;
        if (l == r) {
            mm.Min = mm.Max = arr[l];
            return;
        }

        if (r - 1 == l) {
            if (arr[l] > arr[r]) {
                mm.Max = arr[l];
                mm.Min = arr[r];
            } else {
                mm.Max = arr[r];
                mm.Min = arr[l];
            }
            return;
        }

        int Lmin, Lmax, Rmin, Rmax;
        int mid = l + (r - l) / 2;
        findMM(arr, l, mid, mm);
        Lmin = mm.Min;
        Lmax = mm.Max;
        findMM(arr, mid + 1, r, mm);
        Rmin = mm.Min;
        Rmax = mm.Max;

        mm.Min = Math.min(Rmin, Lmin);
        mm.Max = Math.max(Lmax, Rmax);

    }

    static class MM {
        public int Max;
        public int Min;

        public MM() {
            this.Max = Integer.MIN_VALUE;
            this.Min = Integer.MAX_VALUE;
        }
    }


}
