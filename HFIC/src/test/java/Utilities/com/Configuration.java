package Utilities.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Configuration {
	public Properties pro;

	public Configuration() {

		File Src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(Src);
			pro = new Properties();
			pro.load(fis);

		} catch (IOException e) {
			System.out.println("Unable to read the Configuration File" + e.getMessage());
		}

	}

	public String getQAURL() {
		return pro.getProperty("URL");

	}

	public String getBrowser() {
		return pro.getProperty("Browser");

	}
	public String getPEGAURL() {
		return pro.getProperty("PEGAURL");

	}

}
