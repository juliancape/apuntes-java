package operacion;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
 
public class operacionLeeryCrear {

	public static void main(String[] args) {
		//copia ("C:\\Users\\ASUS FX 505DY R5\\Desktop\\Cuarto Semestre\\go_Coffe.png", "C:\\Users\\ASUS FX 505DY R5\\Desktop\\Cuarto Semestre\\ficheroDestino.png");
	 	
        File file = new File("C:\\\\Users\\\\ASUS FX 505DY R5\\\\Desktop\\\\Cuarto Semestre\\\\go_Coffe.jpeg");
        System.out.println(file.exists() + "!!");
 
        FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[500];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
               
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            System.out.println("PAILAS");
        }
        byte[] bytes = bos.toByteArray();
       
 
 
 
         ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");
        
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream, it seems file is OK
 
        ImageInputStream iis = null;
		try {
			iis = ImageIO.createImageInputStream(source);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
 
        Image image = null;
		try {
			image = reader.read(0, param);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
        		image.getHeight(null), BufferedImage.TYPE_INT_RGB);
         Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);
        File imageFile = new 
        		File("C:\\\\Users\\\\ASUS FX 505DY R5\\\\Desktop\\\\Cuarto Semestre\\\\go_Coffe2.jpeg");
        try {
			ImageIO.write(bufferedImage, "jpg", imageFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        System.out.println(imageFile.getPath());
		
		
		
		
		
	}

	
	
}
