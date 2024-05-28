package htmlGenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {
	String code = "";
	public void htmlImg(String img, String parts) {
		
		code =	String.format("<figure>\r\n"
				+ "                <img src=\"%s\">\r\n"
				+ "                <figcaption> %s </figcaption>\r\n"
				+ "            </figure>\r\n", img, parts);		
				
		
		appendStrToFile("C:/Users/ASUS FX 505DY R5/Desktop/Platzy HTML-CSS/workPattern/file.txt", code);
		
	}
	public void htmlText(String text) {
		code =	String.format("<p>\r\n"
				+ "%s\r\n"          
				+ "            </p>\r\n",text);		
				
		
		appendStrToFile("C:/Users/ASUS FX 505DY R5/Desktop/Platzy HTML-CSS/workPattern/file.txt", code);
		
	}
	public void htmlPrice(int price) {
		code =	String.format("<h3>\r\n"
				+ "El precio de la compra es de: $%s\r\n"          
				+ "            </h3>\r\n",price);		
				
		
		appendStrToFile("C:/Users/ASUS FX 505DY R5/Desktop/Platzy HTML-CSS/workPattern/file.txt", code);
		
	}
	
	public String closeHtml() {
		String close= "    \r\n"
				+ "</body>\r\n"
				+ "</html>";
		appendStrToFile("C:/Users/ASUS FX 505DY R5/Desktop/Platzy HTML-CSS/workPattern/file.txt", close);
		return close;
	}
	public void appendStrToFile(String fileName, String str)
		{
		// Try block to check for exceptions
		try {
			
			// Open given file in append mode by creating an
			// object of BufferedWriter class
			BufferedWriter out = new BufferedWriter(
			new FileWriter(fileName, true));
			
			// Writing on output stream
			File file = new File(fileName);
			if (file.length() ==0) {
				code = "<!DOCTYPE html>\r\n"
            			+ "<html lang=\"en\">\r\n"
            			+ "<head>\r\n"
            			+ "    <meta charset=\"UTF-8\">\r\n"
            			+ "    \r\n"
            			+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
            			+ "    <title>RESUMEN DE TU COMPRA</title>\r\n"
            			+ "</head>\r\n"
            			+ "<body>\r\n"
            			+ "    <main>\r\n"
            			+ "        <section>";
				out.write(code);
				
			}
			out.write(str);
			// Closing the connection
			out.close();
			}
			
			// Catch block to handle the exceptions
			catch (IOException e) {
			
			// Display message when exception occurs
			System.out.println("exception occurred" + e);
		}
	}
	
	
	
}
