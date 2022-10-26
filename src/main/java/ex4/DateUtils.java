package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/**
	 * @param date
	 * @param pattern
	 * @return date au bon format
	 */
	public static String format(Date date, String pattern) {
		pattern = pattern == null ? "dd/MM/yyyy HH:mm:ss" : pattern;
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
}
