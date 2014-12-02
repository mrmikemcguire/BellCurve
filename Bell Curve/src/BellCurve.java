import java.util.Random;

public class BellCurve
	{
	public static int [] myArray = new int [500];
	
	public static void main(String[] args)
		{
		generateRegularRandom();
		displayGraph();
		System.out.println();
		generateGaussianRandom();
		displayGraph();

		}
	public static void generateRegularRandom()
		{
		for (int i = 0; i < 500; i++)
			{
			int r = (int) (Math.random() * 10) + 1;
			myArray[i] = r;
			}
		}
	
	public static void displayGraph()
		{
        	String[] values = new String[10];
        for (int i = 0; i < 10; i++)
	        	{
	        	values[i] = "";
	        	}
        
		for (int fred : myArray)
			{
            if (fred < 11 && fred > 0)
            		values[fred - 1] += "*";
			}
		
		for (int i = 1; i <= 10; ++i) 
            {
            System.out.println(i + ":\t" + values[i-1]);
            }
		}
	
	public static void generateGaussianRandom()
		{
		for (int i = 0; i < 500; i++)
			{
			Random r = new Random();
			double d = Math.abs(r.nextGaussian() * 3 + 5);
			myArray[i] = (int) Math.round(d);
			}
		}
	}