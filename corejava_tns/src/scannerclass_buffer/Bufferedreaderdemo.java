package scannerclass_buffer;


	
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Bufferedreaderdemo {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("\"C:\\Users\\sushu\\OneDrive\\Documents\\Desktop\\demo.txt\""));
		String data ="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
      br.close();
	}



	}


