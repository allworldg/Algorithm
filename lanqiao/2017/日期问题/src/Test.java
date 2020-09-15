import java.util.HashSet;
import java.util.Scanner;

/**
 * @Classname Test
 * @Description 年/月/日的，月/日/年的，日/月/年
 * 1、是否大于等于60，是则+1900，否则+2000
 * 2、是否是闰年，是则考虑二月得情况
 * 3、月份，考虑是否是135781012
 * 4、日期，考虑是否在0-31 或0-30之间
 * @Date 2020/9/11 22:21
 * @Created by 94493
 */
public class Test {
    public static HashSet<Integer> hashSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strs = str.split("/");
        f(strs[0],strs[1],strs[2]);
        f(strs[2],strs[0],strs[1]);
        f(strs[2],strs[1],strs[0]);

        for(int num:hashSet){
            String s = ""+num;
            System.out.println(s.substring(0,4)+"-"+s.substring(4,6)+"-"+s.substring(6,s.length()));
        }
    }


    public static void f(String year,String month,String day){
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        if(y>=60){
            y = y+1900;
        } else {
            y = y+2000;
        }
        if(((y%400==0)||(y%4==0&&y%100!=0))&&m==2&&d>0&&d<30){
            hashSet.add(Integer.parseInt(""+y+month+day));
        }
        if(y%4!=0&&m==2&&d>0&&d<29){
            hashSet.add(Integer.parseInt(""+y+month+day));
        }
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12&&d>0&&d<32){
            hashSet.add(Integer.parseInt(""+y+month+day));
        }
        if(m==2||m==4||m==6||m==9||m==11&&d>0&&d<31){
            hashSet.add(Integer.parseInt(""+y+month+day));
        }
    }


}
