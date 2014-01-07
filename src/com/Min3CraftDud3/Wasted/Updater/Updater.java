package com.Min3CraftDud3.Wasted.Updater;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class Updater {

	public static String checkForUpdate() throws IOException,
			InterruptedException {
		URL url = new URL("https://dl.dropboxusercontent.com/u/41398001/Wasted/Verison.txt");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(url.openStream());
		double update = s.nextDouble();
		//double vers = Wasted.version;
		double vers = 2.0;
		if (vers < update) {
			return "An update is avaliable click options to download it!";
		} else {
			return "Wasted is up to date!";
		}
	}
	
	public static void updateGame() throws MalformedURLException, IOException{
				String filename = "Wasted.jar";
				String urlString = "https://dl.dropboxusercontent.com/u/41398001/Wasted/Wasted.jar";
		        BufferedInputStream in = null;
		        FileOutputStream fout = null;
		        try
		        {		        	
		            in = new BufferedInputStream(new URL(urlString).openStream());
		            fout = new FileOutputStream(filename);
		            byte data[] = new byte[1024];
		            int count;
		            while ((count = in.read(data, 0, 1024)) != -1)
		            {
		                fout.write(data, 0, count);
		            }
		        }
		        finally
		        {
		            if (in != null)
		                in.close();
		            if (fout != null)
		                fout.close();
		        }
		    }
}