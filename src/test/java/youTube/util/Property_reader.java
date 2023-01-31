package youTube.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_reader {
	public Properties obj;
	 public void Elements(){
			try {
				obj = new Properties();
				FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/Resources/Object_Repo.properties");
				obj.load(objfile);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
	}

}
