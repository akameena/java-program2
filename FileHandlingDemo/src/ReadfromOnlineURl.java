import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class ReadfromOnlineURl {
public static void main(String[] args) throws IOException {
	URL url= 
	new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
	InputStream inputStream= url.openStream();
	InputStreamReader inputStreamReader=
			new InputStreamReader(inputStream);
	BufferedReader bufferedReader= 
		new BufferedReader(inputStreamReader);
	String str;
	while((str= bufferedReader.readLine()) != null){
		System.out.println(str);
	}
	
	
	
}
}
