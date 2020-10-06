/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/10/1 20:02
 * @Created by 94493
 */
public class Test {
    public static void main(String[] args) {
       String sb = "123";
       StringBuffer stringBuffer = new StringBuffer(sb);
       stringBuffer.append(3).append(1);
        System.out.println(stringBuffer.toString());
    }
}
