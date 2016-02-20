package virensam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Sam
 *
 */
public class ReadFile {
	
	static HashMap<String, String> symboltohex = new HashMap<>();
	
	/**
	 * Puts everything needed in a HashMap
	 */
	private void fileInit(){
		
		
		String line;
		File file = new File("ascii_table.csv");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()){
				String data = sc.nextLine();   //Gets whole line
				String [] values = data.split(",");
				symboltohex.put(values[4], values[2]);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

