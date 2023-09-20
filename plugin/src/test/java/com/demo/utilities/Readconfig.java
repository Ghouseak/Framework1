package com.demo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}	
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;	
	}
	
	public String getchomepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;	
	}
	public String getfoldername() {
		String folder = pro.getProperty("foldername");
		return folder;	
	}
	
	public String getdeletefoldername() {
		String folder = pro.getProperty("deletefoldername");
		return folder;	
	}
	public String getprocessname() {
		String process = pro.getProperty("processname");
		return process;	
	}
	public String getchildtodimensionname() {
		String process = pro.getProperty("childtodimensionname");
		return process;	
	}
	public String getsiblingtodimensionname() {
		String process = pro.getProperty("siblingtodimensionname");
		return process;	
	}
	
	public String getcopyname() {
		String process = pro.getProperty("copymember");
		return process;	
	}
	public String getcutname() {
		String process = pro.getProperty("cutmember");
		return process;	
	}
	public String getmoveupdowndimesionname() {
		String process = pro.getProperty("moveupdown");
		return process;	
	}
	public String getcopychildtoanothermembername() {
		String process = pro.getProperty("copychildtoanothermember");
		return process;	
	}
	public String getdraganddrop1() {
		String process = pro.getProperty("DragandDrop1");
		return process;	
	}
	public String getdraganddrop2() {
		String process = pro.getProperty("DragandDrop2");
		return process;	
	}
	
	public String getmoveupdownrelative() {
		String process = pro.getProperty("moveupdownrelative");
		return process;	
	}
	public String getmoveup1() {
		String process = pro.getProperty("moveup1");
		return process;	
	}
	public String getmoverelative() {
		String process = pro.getProperty("moverelative");
		return process;	
	}
	public String getHierarchy() {
		String process = pro.getProperty("Hierarchy");
		return process;	
	}
	
	public String getdraganddrophierarchy() {
		String process = pro.getProperty("draganddrophierarchy");
		return process;	
	}
	public String getAschildanothermember() {
		String process = pro.getProperty("Aschildanothermember");
		return process;	
	}
	
}
