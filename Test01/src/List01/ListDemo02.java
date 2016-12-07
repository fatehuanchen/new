package List01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ListDemo02 {

	public static void main(String[] args) {

		File file=new File("test1.txt");
		if(file.exists())
		{
			System.out.println("exists");
			try {
				FileInputStream ins=new  FileInputStream(file);
				InputStreamReader isr=new InputStreamReader(ins,"UTF-8");
				BufferedReader br=new BufferedReader(isr);
				String line;
				while((line=br.readLine())!=null)
				{
					System.out.println(line);
				}
				br.close();
				isr.close();
				ins.close();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File file1=new File("test.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file1) ;
			OutputStreamWriter os=new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw=new BufferedWriter(os);

			bw.write("hh\n");
			bw.write("444\n");
			bw.close();
			os.close();
			fos.close();


		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}



}
