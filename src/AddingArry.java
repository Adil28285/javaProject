
public class AddingArry {
	void adil()
	{
		
	}
	
	public static void main(String[] args) {
		
		
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arr3[][]=new int[3][3];
		
		arr1[0][0]=1;
		arr1[0][1]=2;
		arr1[0][2]=3;
		arr1[1][0]=4;
		arr1[1][1]=5;
		arr1[1][2]=6;
		arr1[2][0]=7;
		arr1[2][1]=8;
		arr1[2][2]=9;
		
		arr2[0][0]=1;
		arr2[0][1]=2;
		arr2[0][2]=3;
		arr2[1][0]=4;
		arr2[1][1]=5;
		arr2[1][2]=6;
		arr2[2][0]=7;
		arr2[2][1]=8;
		arr2[2][2]=9;
		
			for(int i=0;i<3;i++)
			{
				for (int j=0;j<3;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println();
				
			}
		
		
 	}

}
