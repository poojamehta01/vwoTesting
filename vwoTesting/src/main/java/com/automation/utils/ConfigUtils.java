package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties")));
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\messages.properties")));
            System.out.println(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
    public String getReportConfigPath() {
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
}
