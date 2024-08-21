package day7;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] arr=new int[2][4];
        
        arr[0][0]=20;
        arr[0][1]=30;
        arr[0][2]=40;
        arr[0][3]=50;
        
        arr[1][0]=10;
        arr[1][1]=60;
        arr[1][2]=80;
        
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0][3]);
        System.out.println("printing an array for loop");
        for(int row=0;row<arr.length;row++) {
        	for(int col=0;col<arr[0].length;col++) {
        		System.out.println(arr[row][col]);
        	}
        }
       
        	

        
	}

}
