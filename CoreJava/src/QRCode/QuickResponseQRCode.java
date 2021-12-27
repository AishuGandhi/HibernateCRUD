package QRCode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QuickResponseQRCode
{
    public static void main(String[] args) throws IOException
    {
       String details = "Aishwarya Gandhi:Sample QR Code";
       //To Create QR Code Image
       ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
       
       File f = new File("C:\\MyData\\QRCodeImage\\MyQRCode.jpg");
       FileOutputStream fos = new FileOutputStream(f);  
       fos.write(out.toByteArray());
       fos.flush();
       fos.close();
    }
}
