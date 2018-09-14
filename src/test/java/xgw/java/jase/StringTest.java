package xgw.java.jase;

import junit.framework.TestCase;

public class StringTest  extends TestCase {
    
	//初始化
	public void testInit() {
		String str2 = new String("asdf"); 
		String str3 = new String(str2); 
		System.out.println(str2);//asdf
		
		char[] value = {'a','b','c','d'};
		String str4 = new String(value);//
		System.out.println(str4);//abcd
		
		char[] value1 = {'a','b','c','d'};
	    String str5 = new String(value1, 1, 2);
	    System.out.println(str5);//bc
	    
	    byte[] strb = new byte[]{65,66};
	    String str6 = new String(strb);//相当于String str6 = new String("AB");
	    System.out.println(str6);//AB
	    
	}
	
	//String 常用方法
	public void testCommonMethod() {
		System.out.println("asdfzxc".length());//7
		//返回字符串中指定位置的字符；注意字符串中第一个字符索引是0，
		System.out.println(new String("asdfzxc").charAt(4));//z
		//截取子串
		//该方法从beginIndex位置起，从当前字符串中取出到endIndex-1位置的字符作为一个新的字符串返回。
		System.out.println("asdfzxc".substring(2));// dfzxc
		System.out.println("asdfzxc".substring(2,5));// dfz
		
		//字符串比较
		//若当前对象比参数大则返回正整数，反之返回负整数，相等返回0。
		Integer x = 5;
	    System.out.println(x.compareTo(3));
	    System.out.println(x.compareTo(5));
	    System.out.println(x.compareTo(8));        
	    String s="b";
	    System.out.println(s.compareToIgnoreCase("B"));//0 忽略大小写
	    
	    //查找字符串出现的位置  从下标0开始查找
	     String str = "I am a good student";
	     int a = str.indexOf('a');//a = 2
	     int b = str.indexOf("good");//b = 7
	     int c = str.indexOf("w",2);//c = -1
	     int d = str.lastIndexOf("a");//d = 5 从字符串的末尾位置向前查找。
	     int e = str.lastIndexOf("a",3);//e = 2
	     System.out.println(str.lastIndexOf("I"));//0
	     
	     //字符串替换
	    // String str = "asdzxcasd";
	     String str1 = "asdzxcasd".replace('a','g');//str1 = "gsdzxcgsd"
	     String str2 ="asdzxcasd".replace("asd","fgh");//str2 = "fghzxcfgh"
	     String str3 = "asdzxcasd".replaceFirst("asd","fgh");//str3 = "fghzxcasd"
	     String str4 = "asdzxcasd".replaceAll("asd","fgh");//str4 = "fghzxcfgh"
	     
	     //以什么开头
	     String strt = "asdfgh";
	     strt.startsWith("as");//a = true
	     strt.endsWith("gh");//b = true
	     System.out.println(strt.startsWith("g", 4));//true 从下标1开始算
	     
	     //包含
	     //String str = "student";
	     "student".contains("stu");//true
	     "student".contains("ok");//false
	     
	     //分割
	     String strp = "asd!qwe|zxc#";
	     String[] temp = strp.split("!|#");//str1[0] = "asd";str1[1] = "qwe";str1[2] = "zxc";
	     System.out.println(temp[0]);
	     System.out.println(temp[1]);
	     //System.out.println(temp[2]);
	     
	     String[] t="boo:and:foo".split(":");
	     System.out.println(t[2]);
	     
	     //字符串转换为基本类型
	     int n = Integer.parseInt("12");
	     float f = Float.parseFloat("12.34");
	     System.out.println(Double.parseDouble("1.124"));
	     
	     //基本类型转换为字符串类型
	     String s1 = String.valueOf(12);
	     String s2= String.valueOf(12.34);
	     
	   /*1)static String valueOf(char data[])
	     2)static String valueOf(char data[], int offset, int count)
	     3)static String valueOf(boolean b)
	     4)static String valueOf(char c)
	     5)static String valueOf(int i)
	     6)static String valueOf(long l)
	     7)static String valueOf(float f)
	     8)static String valueOf(double d)*/
	     
	     
	}
	
	
}
