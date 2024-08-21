package day7;

public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int [2][];
        a[0]=new int[3];
        a[1]=new int[2];
        
        
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=40;
        a[1][0]=30;
        a[1][1]=60;
        		
        	for(int row=0;row<a.length;row++) {
        		for(int col=0;col<a[row].length;col++) {
        			System.out.println(a[row][col]+" ");
        		}
        		System.out.println();
        	}
	}

}
