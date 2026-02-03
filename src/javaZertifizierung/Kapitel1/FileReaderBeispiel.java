package javaZertifizierung.Kapitel1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.foreign.VaList.Builder;

public class FileReaderBeispiel {

	public static void main(String[] args) {
		
		Reader reader = null; 
		
		/*try {
			reader = new FileReader("Texdatei"); 
			int c = -1; 
			while((c = reader.read())!= -1 ) {
				System.out.print((char)c); 
			}
		}catch (Exception e) {
			System.err.println("Fehler beim Lesen der Datei");
		}finally {
			try {reader.close();} catch (Exception e) {}
		}*/ 
		
		BufferedReader br = null; 
		
		try {
			FileReader fr = new FileReader("Texdatei");
			br = new BufferedReader(fr); 
			
			StringBuilder builder = new StringBuilder(); 
			String line = ""; 
			
			while((line = br.readLine()) != null) {
				builder.append(line).append(System.lineSeparator()); 
			}
			
			System.out.println(builder.toString());
		} 
		catch (IOException e) {
			System.err.println("Fehler beim Lesen der Datei");  
			
		}finally {
			try {br.close();}catch (Exception e) {}
		}
		

