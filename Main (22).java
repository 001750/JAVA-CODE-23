public class Main
{
	public static void t(int a,int b) 
	{
	if(a>20)
	{
	 return;
	}
	System.out.print(a + " " );
	
	t(b,a + b);
	    
	}
	public static void main(String[] args){
	    t(0,1);
	}
	} 
