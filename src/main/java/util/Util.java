package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static java.sql.Date getSqlDate(Date date) {
	  	if(date == null){
	  		return null;
	  	}
	    return java.sql.Date.valueOf(dateToStr(date, "yyyy-MM-dd"));
	  }
	  public static String dateToStr(Date date, String format) {

	    String retorno = null;

	    if ((null != date) && (null != format)) {

	      SimpleDateFormat formater = new SimpleDateFormat(format);
	      retorno = formater.format(date);
	    }

	    return retorno;
	  }
	
	
	
}
