package supportMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class FileRead {

	public static FileInputStream readFile(String file) throws FileNotFoundException {
		return new FileInputStream(new File(file));
	}
	
	public static Map<String, String> readProperties() throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(readFile("src/test/resources/config.properties"));
		
		Map<String, String> properties = new HashMap<String, String>();
		
		Enumeration<Object> KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) {
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			properties.put(key, System.getProperty(key, value));
		}
		
		return properties;
	}
	
	
}
