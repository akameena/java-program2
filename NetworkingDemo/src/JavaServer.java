import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class JavaServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket= new ServerSocket(4040);
		Socket socket= serverSocket.accept();
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
			
			str1= dataInputStream.readUTF();
			System.out.println("Client Says: "+str1);
			
			str2= bufferedReader.readLine();
			dataOutputStream.writeUTF(str2);
			
		}
	}
	
}
