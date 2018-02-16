
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMMM-yyyy");
        String date_format = sdf.format(date);
        System.out.println(date_format);
    }
}
