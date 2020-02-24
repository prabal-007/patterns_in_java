package patterns;

public class boxpattern {
public static void main(String args[])
{
	int col = 4,row = 5;
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			if((i==1) || (i==row) || (j==1) || (j==col) )
			{
				System.out.print("$ ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println("");
	}
}
}
