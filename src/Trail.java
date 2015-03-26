import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

This class is used to trail spaces in string

*/
public class Trail {

	public static void main(String[] args) {

		
		String idate = "07/04/2015";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date inputDate = null;
		try {
			inputDate = sdf.parse(idate);
			System.out.println(inputDate.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SimpleDateFormat sdfo = new SimpleDateFormat("MMM dd");
		String outputDate = sdfo.format(inputDate);
		System.out.println("ouptu"+outputDate);
		
	}

}
