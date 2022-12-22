package Game;

public class Clear {
	public final static void clearcon()  
	{  
		try  
		{  
			final String os = System.getProperty("os.name");  
			if (os.contains("Windows"))  
			{  
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}  
			else  
			{  
				Runtime.getRuntime().exec("clear");  
			}  
		}  
		catch (Exception e)  
		{  
			e.printStackTrace();  
		}  
	}  
	
}
