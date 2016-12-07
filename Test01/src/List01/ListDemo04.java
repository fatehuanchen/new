package List01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ListDemo04 {
	public static void main(String[] args) {

		File file=new File("test.txt");
		if(file.exists())
		{
			file.delete();
			System.out.println("删除文件");
		}
		new ListDemo04_test(file, 0).start();
		new ListDemo04_test(file, 1).start();
		new ListDemo04_test(file, 2).start();
		new ListDemo04_test(file, 3).start();
		new ListDemo04_test(file, 4).start();

	}
}

class ListDemo04_test extends Thread
{   File file;
int b;
int L=100;



public ListDemo04_test(File file,int b) {
	this.file=file;
	this.b=b;
}

@Override
public void run() {
	try {
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		raf.seek(b*L);
		String str="这是第"+b+"个区";
		raf.writeBytes(str);







	} catch (IOException e) {

		e.printStackTrace();
	}
}





}