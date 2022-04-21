import java.io.*;         
public class BufferReaderInput{
	public static void main(String[] args) throws IOException{
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);

	    String name = "";

	    while(!name.equals("stop")){
	    	System.out.println("Enter name...");

	    	name = br.readLine();
	    	System.out.println("Name:"+name);
	    }

	    br.close();
	    isr.close();		
	}
}