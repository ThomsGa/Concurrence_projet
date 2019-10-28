package regexpSearch;

import java.net.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		
			String pagetest = "page1.html";
			
		    BufferedReader in = new BufferedReader( new FileReader(pagetest) );

		    String inputLine;
		    while ((inputLine = in.readLine()) != null)
		    	System.out.println(inputLine);
		    	in.close();
	
	}
}
