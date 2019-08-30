package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	// load the properties file from folder
	public static Properties  UserData = loadProperties(System.getProperty("user.dir")+"\\src\\main\\java\\Properties\\UserDataProperties");
	
	private static Properties loadProperties (String path) {

		Properties Pro = new Properties();

		// Stream for reading file
		try {
			FileInputStream Stream = new FileInputStream(path);
			Pro.load(Stream);
		} catch (FileNotFoundException e) {
			System.out.println("Error Occures : "+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Error Occures : "+ e.getMessage());
		}
		return Pro;

	}

}
