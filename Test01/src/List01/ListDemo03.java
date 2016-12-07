package List01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ListDemo03 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("test.txt");
			FileWriter fw=new FileWriter("test_new.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			String str;
			while((str=br.readLine())!=null)
			{
				bw.write(str);
			}
			bw.flush();
			bw.close();
			br.close();
			fw.close();
			fr.close();
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
//		try {
//			FileInputStream fis = new FileInputStream("test.txt");
//			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
//			BufferedReader br=new BufferedReader(isr);
//			FileOutputStream fos=new FileOutputStream("test2.txt");
//			OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
//			//BufferedWriter bw=new BufferedWriter(osw);
//			PrintWriter pw=new PrintWriter(osw, true);
//			String str;
//			while((str=br.readLine())!=null)
//			{
//				pw.println(str);
//			}
//		   //pw.flush();
//			pw.close();
//			osw.close();
//			fos.close();
//			br.close();
//			isr.close();
//			fis.close();
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		

	}

}
