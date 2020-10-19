
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ºÕƒÓ»’ {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		Date date1 = (Date)sdf.parse("1921-7-23 12:00:00");
		Date date2 = (Date)sdf.parse("2020-7-1 12:00:00");
		long time = date2.getTime()-date1.getTime();
		System.out.println(time/60000);
	}
}
