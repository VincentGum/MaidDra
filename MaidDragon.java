import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;;

public class MaidDragon {
	public static void main(String[] args) throws Exception{
		BufferedReader br;
		String str = "",tmp;
		ArrayList<String> chars;
		
		int num = 1;
		chars = new ArrayList<String>();
		br = new BufferedReader(new FileReader("md.txt"));
		while((tmp = br.readLine()) != null){
			str += (tmp + "\n");
			num++;
			if(num>45){
				chars.add(str);
				str = "";
				num = 1;
			}
		}
		if(br != null) br.close();
		
		for(String ctmp:chars){
			System.out.println("\033[0;0H");
			System.out.print(ctmp);
			
		}
		
		
	}
}
