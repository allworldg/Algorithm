import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/20 17:10
 * @Created by 94493
 */
public class Main {
    public static int[] visiteds = new int[13];
    public static int[] cards = new int[13];
    public static int count = 0;
    public static HashSet<int[]> cardsSet = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < visiteds.length; i++) {
            visiteds[i] = 4;
        }
        dfs(0);
        System.out.println(cardsSet.size());
    }

    public static void dfs(int step) {
        if (step == 13) {//从0开始，自己拿完了14张，判断
            Arrays.sort(cards);
            cardsSet.add(cards);
        }
        else {
            for (int i = 0; i < cards.length; i++) {
                if (visiteds[i] > 0) {
                    visiteds[i]--;
                    cards[step] = i;
                    dfs(step+1);
                    visiteds[i]++;
                }
            }
        }


    }

}
