import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFileDemo {
	
	public static void main(String[] args) throws IOException {
		File file= new File("d://abc//a.txt");
		File file2= new File("d://xyz//a.txt");
		file.createNewFile();
		file2.createNewFile();
		FileOutputStream fileOutputStream=
				new FileOutputStream(file);
		byte[] bb= "Hello Java".getBytes();
		
		fileOutputStream.write(bb);
		FileOutputStream fileOutputStream2=
				new FileOutputStream(file2);
		FileInputStream fileInputStream=
				new FileInputStream(file);
	//	System.out.println(fileInputStream.available());
		int length;
		while((length= fileInputStream.read()) >= 0){
		//	System.out.print((char)length);
			fileOutputStream2.write(length);
		}
		fileOutputStream.close();
		fileInputStream.close();
		fileOutputStream2.close();
		file.delete();
		System.out.println("File moved Sucessfully");
	}

}
