
public class Demo2 {

	public static void main(String[] args) {
	
		int[][] a = {{2,5,3}, {4,9,1}};
		
		{
			for (int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					System.out.print(a[i][j]+" " );
				}
				System.out.println();
			}
		}

	}

}
