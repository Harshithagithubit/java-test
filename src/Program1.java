
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][][]=new int[3][3][4];
		for(int i=0;i<3;i++)
		   {
			for(int j=0;j<3;j++) {
				for (int k=0;k<4;k++) {
				
				     nums[i][j][k]= (int)(Math.random() * 10);
				
		    }
         }
	  }
		for(int i=0;i<3;i++) {
		   	  for(int j=0;j<3;j++) {
			     for (int k=0;k<4;k++){
				       System.out.print(nums[i][j][k]+" ");
			                             }
			  System.out.println();
  		     }
	      }
	

}

}


