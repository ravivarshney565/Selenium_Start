
public class RP4 {

	public static void main(String[] args) {

		int a[][] = {{2,6,8},{5,2,8}};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
		}
			System.out.println();
			
		}
		
for(int[] temp:a)
{
	for (int temp1:temp)
	{
	System.out.println(temp1);
	
	
	}
}
	}

}
