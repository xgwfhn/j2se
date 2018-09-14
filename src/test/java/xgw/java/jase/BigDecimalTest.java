package xgw.java.jase;

import java.math.BigDecimal;

import junit.framework.TestCase;

public class BigDecimalTest extends TestCase {

	
	 
	 public void testInit() {
		 //精确计算结果  	
		 //double f1 = new BigDecimal(3.0008).setc(5, BigDecimal.ROUND_HALF_UP).doubleValue();
		 //BigDecimal b1 = new BigDecimal("1.34");//1.34
		 //BigDecimal b2 = BigDecimal.valueOf(1.34);//1.3
		 BigDecimal aa = new  BigDecimal(135.95 );  
		 BigDecimal bb=new  BigDecimal("100" );  

	 }
	 
	 public void commonOperaterMethod() {
		 BigDecimal aa = new  BigDecimal(135.95);  
		 BigDecimal bb=new  BigDecimal(100 );  
		 //System.out.println(aa.add(bb));  //加法 //235.94999999999998863131622783839702606201171875
		 //System.out.println(aa.subtract(bb));//减法 35.94999999999998863131622783839702606201171875
		 //System.out.println(aa.multiply(bb));  //乘法  13594.99999999999886313162278383970260620117187500
		
		 //System.out.println(aa.divide(bb,2,BigDecimal.ROUND_HALF_EVEN));//除法  保留2位小数点
		 //setScale(1)  表示保留1位小数
		 //System.out.println(new  BigDecimal(135.95).setScale(1,BigDecimal.ROUND_DOWN)) ;//135.9
		 //System.out.println(new  BigDecimal(135.95).setScale(1,BigDecimal.ROUND_UP)) ;//136.0
		 //System.out.println(new  BigDecimal(135.95).setScale(1,BigDecimal.ROUND_HALF_UP)) ;//135.9
		 //System.out.println(new  BigDecimal(135.95).setScale(2,BigDecimal.ROUND_HALF_DOWN)) ;//135.95
		 //System.out.println(new  BigDecimal(135.95).setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue()) ;//转double
		 //比较  返回值    -1 小于   0 等于    1 大于 
		 BigDecimal a=new  BigDecimal(135.01);
		 BigDecimal b=new  BigDecimal(135.02);
		// System.out.println(a.compareTo(b));
		 //System.out.println(a.max(b));////比较取最大值 
		// System.out.println(a.min(b));////比较取最小值 
		 //System.out.println(new  BigDecimal(-135).abs());//比较取最绝对值  
		 System.out.println(new  BigDecimal(135).negate());// -135 比较取相反数 
         //控制台打印较慢
	 }
}
