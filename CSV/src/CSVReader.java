import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:/Users/marce/Desktop/realEstate.csv";
		String line = "";
				
		try {
			BufferedReader br = new BufferedReader(new FileReader(path)); 
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				System.out.println("Address: " + values[0] +" " + values[1]+ " " + values[2] + " " + values[3] + " Price: $" + values[9] );
			 
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
