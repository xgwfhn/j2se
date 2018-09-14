package xgw.java.jase;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import junit.framework.TestCase;

public class DateTest extends TestCase {

	/**
	 * 相差月份
	 */
	public void testDifferMonth() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = "2018-01-01";
		String str2 = "2019-12-01";
		Calendar bef = Calendar.getInstance();
		Calendar aft = Calendar.getInstance();
		try {
			bef.setTime(sdf1.parse(str1));
			aft.setTime(sdf1.parse(str2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
		int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
		System.out.println("月份" + Math.abs(month + result));
	}

	
	public void testDate2String() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(new Date());
		System.out.println(dateString);
	}
	
	public void testStr2Date() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	    try { 
	       Date d=sdf.parse("2018-09-12 17:54:14"); 
	       System.out.println(d);
	    } catch (ParseException ex) { 
	      ex.printStackTrace(); 
	      throw new RuntimeException(ex.toString()); 
	    } 
	}
	
	public void testParseTimestampToStr() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=df.format(new Timestamp(System.currentTimeMillis()));
		System.out.println(str);
	}
	
	public void testGetYear() {
		Calendar cal = Calendar.getInstance();
   	 	cal.setTime(new Date());
	    //System.out.println(cal.get(Calendar.YEAR));//2018
   	 	//System.out.println(cal.get(Calendar.MONTH)+1);//9
   	 	//System.out.println(cal.get(Calendar.DATE));//13
   	    //System.out.println(cal.get(Calendar.DAY_OF_MONTH));//13
   	 	System.out.println(cal.get(Calendar.DAY_OF_WEEK));//5 从周日算起
	}
	
	public void testGetMonthListOfDate() {
		List<String> list=DateUtil.getMonthListOfDate("2018-01-01","2018-09-01");
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	public void testGetDayListOfDate() {
		List<String> list=DateUtil.getDayListOfDate("2018-01-01","2018-09-01");
		for(String s:list) {
			System.out.println(s);
		}
	}
	
	public void testGetYearListOfYears() {
		List<Integer> list=DateUtil.getYearListOfYears(2,2);
		for(Integer s:list) {
			System.out.println(s);
		}
		/*2016
		2017
		2018
		2019*/

	}
	
	public void testGetDayWeekOfDate2() {
		System.out.println(DateUtil.getDayWeekOfDate2(new Date()));
	}
	
	
	public void testFormatHhMmSsOfDate() {
		Date d=DateUtil.formatHhMmSsOfDate(new Date());
		String str=DateUtil.parseDateToStr(d,"yyyy-MM-dd HH:mm:ss");
		System.out.println(str);
	}
	
	public void testgetDistanceDays() {
		try {
			long days=DateUtil.getDistanceDays("2018-01-01 00:00:00","2018-02-01 00:00:00");//31
			System.out.println(days);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
