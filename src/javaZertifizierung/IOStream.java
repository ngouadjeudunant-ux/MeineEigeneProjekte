package javaZertifizierung;

import java.io.FileReader;
import java.io.Reader;

public class IOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reader reader = null; 
		
		try {
			reader = new FileReader("Texdatei"); 
			int c = -1; 
			while((c = reader.read())!= -1 ) {
				System.out.print((char)c); 
			}
		}catch (Exception e) {
			System.err.println("Fehler beim Lesen der Datei");
		}finally {
			try {reader.close();} catch (Exception e) {}
		}
	}

}
