import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fifththird.abp.common.exception.BaseException;


public class ApplicationUtility {

	public static Date addDaysToMonth(String dateRequested, int month)
			throws BaseException {

		Date parseDate = null;
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		try {
			parseDate = df.parse(dateRequested);

		} catch (ParseException parseException) {
			parseException.printStackTrace();

		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parseDate);
		calendar.add(Calendar.MONTH, month);

		return calendar.getTime();
	}
}
