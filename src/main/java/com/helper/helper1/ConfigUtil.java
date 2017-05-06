package com.helper.helper1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	
	public static String loadProperties(String filename){
		Properties prop= new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("C:\\Users\\Arti\\workspace1\\walmart12\\Resources\\SignPageLocator.properties")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	}
	


