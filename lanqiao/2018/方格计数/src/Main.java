/**
 * @Classname Main
 * @Description 在二维平面上有无数个1x1的小方格。
 * 我们以某个小方格的一个顶点为圆心画一个半径为1000的圆。
 * 你能计算出这个圆里有多少个完整的小方格吗？
 * @Date 2020/8/29 23:44
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int r = 1000;
        int count = 0;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(Math.pow(i,2)+Math.pow(j,2)<=Math.pow(r,2)){
                    count++;
                }
            }
        }

        System.out.println(count*4);
    }
}
