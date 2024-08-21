package day6;

public class Stringbufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer sb=new StringBuffer("namrata");//16+6=22
       System.out.println(sb.capacity());
       //System.out.println(sb.append("namrata"));//older capacity*2+2=16*2+2
       //System.out.println(sb.capacity());
      // System.out.println(sb.append("namrata jain"));
      // System.out.println(sb.capacity());
       System.out.println(sb.reverse());
	}

}
