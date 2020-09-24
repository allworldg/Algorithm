/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/20 10:25
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int count=0;
        char[] chars;
        for(int i=1;i<=100;i++){
            int num = i*i*i;
            chars = Integer.toString(num).toCharArray();
            int nums = 0;
            for(int j=0;j<chars.length;j++){
                nums+=chars[j]-48;
            }
            if(nums == i){
                System.out.println(i);
                count++;
            }

        }

        System.out.println(count);
    }
}
