import java.lang.*;
import java.io.*;
class basicIncrementingTrianglePatternInverted
{
    public static void main (String[]args) throws IOException
    {
        BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
        int n, i, j, a = 0;
        System.out.print ("Enter the N value:");
        n = Integer.parseInt (br.readLine ());
    
        for (i = n; i >= 1; i--)
        {
	        a = (i * (i - 1)) / 2 + 1;
	        for (j = 1; j < i; j++)
	        {
	            System.out.print ((a++) + "*");
	        }
	        System.out.println (a++);
        }
    }
}