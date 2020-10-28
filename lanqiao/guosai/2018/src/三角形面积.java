import java.math.BigDecimal;

/**
 * @Classname 三角形面积
 * @Description 已知三角形三个顶点在直角坐标系下的坐标分别为：
 * (2.3, 2.5)
 * (6.4, 3.1)
 * (5.1, 7.2)
 *
 * 求该三角形的面积。
 * @Date 2020/10/26 20:14
 * @Created by 94493
 */
public class 三角形面积 {
    public static void main(String[] args) {
       double a = Math.sqrt((6.4-2.3)*(6.4-2.3)+(3.1-2.5)*(3.1-2.5));
       double b = Math.sqrt((6.4-5.1)*(6.4-5.1)+(3.1-7.2)*(3.1-7.2));
       double c = Math.sqrt((5.1-2.3)*(5.1-2.3)+(7.2-2.5)*(7.2-2.5));
       double p = (a+b+c)/2;

       double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.3f",area);
    }
}
