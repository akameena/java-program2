import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class FileIODemo {
	
	public static void main(String[] args) {
		File file= new File("myfiles.doc");
	//	FileOutputStream fileOutputStream= null;
		FileWriter fileWriter= null;
		try {
			System.out.println("Create New File: "+file.createNewFile());
			System.out.println("Exits: "+file.exists());
			System.out.println("Path: "+file.getAbsolutePath());
			System.out.println("Hidden: "+file.isHidden());
			System.out.println("Name: "+file.getName());
		
			Scanner scanner= new Scanner(System.in);
			System.out.println("Please enter input");
			String str= scanner.nextLine();
	/*	fileOutputStream=
					new FileOutputStream(file, true);
			byte[] bb= str.getBytes();
			
			fileOutputStream.write(bb);
			*/
			fileWriter= new FileWriter(file, true);
			fileWriter.write(str);
			System.out.println("File Wriiten sucessfully");
			fileWriter.close();
			//Reading File
			
			/*FileInputStream fileInputStream=
					new FileInputStream(file);
			System.out.println(fileInputStream.available());
			int length;
			while((length= fileInputStream.read()) >= 0){
				System.out.print((char)length);
			}*/
		   /*  FileInputStream fileInputStream= new FileInputStream(file);
		     InputStreamReader inputStreamReader=
		    		 new InputStreamReader(fileInputStream);
		     BufferedReader bufferedReader=
		    		 new BufferedReader(inputStreamReader);
		     String linbe=  bufferedReader.readLine();
		     System.out.println(linbe);
		      */
			FileReader fileReader= new FileReader(file);
		    char[] c= new char[50];
			fileReader.read(c);
			
			for (char d : c) {
				System.out.print(d);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		}
	}


