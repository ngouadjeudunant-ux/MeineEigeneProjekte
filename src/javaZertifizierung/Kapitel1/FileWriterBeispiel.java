package javaZertifizierung.Kapitel1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterBeispiel {

	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("out"); 
			BufferedWriter br = new BufferedWriter(fr); 
			br.write("Wir schreiben ohne Umbruch ");
			br.write("in die Datei");
			br.newLine();
			br.write("und dann den Umbruch");
			System.out.println("done");
			br.close();
			fr.close();
			
 		}catch (Exception e) {
			
		}
		 

	}

}
