import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class JavaClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket= new Socket("localhost", 4040);
		InputStream in= socket.getInputStream();
		OutputStream out= socket.getOutputStream();
		DataInputStream dataInputStream= new DataInputStream(in);
		DataOutputStream dataOutputStream= new DataOutputStream(out);
		InputStream inputStream= System.in;
		InputStreamReader inputStreamReader=
				new InputStreamReader(inputStream);
		BufferedReader bufferedReader=
				new BufferedReader(inputStreamReader);
		String str1="";
		String str2="";
		
		while(!str1.equals("stop") && !str2.equals("stop")){
			str1= bufferedReader.readLine();
			dataOutputStream.writeUTF(str1);
			
			str2= dataInputStream.readUTF();
			System.out.println("Server Says: "+str2);
			
		}
	}
}
