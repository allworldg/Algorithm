import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Stu> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for(int i=1;i<=n;i++){
            int no = scanner.nextInt();
            double score = scanner.nextDouble();
            Stu stu = new Stu(no,score);
            arrayList.add(stu);
        }
        arrayList.sort(new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                BigDecimal b1 = new BigDecimal(String.valueOf(o1.getScore()));
                BigDecimal b2 = new BigDecimal(String.valueOf(o2.getScore()));
                return b1.subtract(b2).compareTo(BigDecimal.ZERO)<0?1:-1;
            }
        });
        System.out.println(arrayList.get(k-1).getNo()+" "+arrayList.get(k-1).getScore());



    }


}
class Stu{
    public Stu(){}
    public Stu(int no,double score){
        this.no = no;
        this.score = score;
    }
    private int no;
    private double score;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}