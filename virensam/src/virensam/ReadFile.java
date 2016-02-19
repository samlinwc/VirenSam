package virensam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFile {
	
	private void fileInit(){
		
		HashMap<String, String> map = new HashMap<>();
		String line;
		File file = new File("ascii_table.csv");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()){
				String data = sc.nextLine();   //Gets whole line
				String [] values = data.split(",");
				map.put(values[2], values[4]);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
	}
	
	
}

