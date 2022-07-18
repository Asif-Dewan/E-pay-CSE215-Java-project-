import java.io.BufferedReader;
import java.io.FileReader;

public  class ShowItem {
	public ShowItem() {
		
	}
public String showUserName(String path,int serial) {
		
		String line;
		String userFirstName[] = new String[35];
		String userLastName[] = new String[35];
		
		try {
		FileReader r = new FileReader(path);
		BufferedReader br = new BufferedReader(r);
		int i=0;
		 while((line=br.readLine())!=null) {
			
         	userFirstName[i] = line.split(" ")[0];
         	userLastName[i] = line.split(" ")[1];
         	
         	i=i+1;
		
		}
		 } 
		catch (Exception ep) {
			System.out.println("ERROR 404! File-Not-Found");
            //ep.printStackTrace();
        }
		
		return userFirstName[0]+" "+userLastName[0] ;
		}
}
