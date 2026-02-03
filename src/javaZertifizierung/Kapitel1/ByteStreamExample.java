package javaZertifizierung.Kapitel1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamExample {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("Texdatei"); 
			OutputStream out = new FileOutputStream("output.txt"); 
			byte[] buffer = new byte[in.available()]; 
			
			in.read(buffer, 0, buffer.length); 
			
			for(int i = 0; i < buffer.length; i++) {
				buffer[i]++; 
			}
			
			out.write(buffer, 0, buffer.length);
			in.close();
			out.close();
			
		} catch (Exception e) {}
	}

}
