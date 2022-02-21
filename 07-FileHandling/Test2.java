import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Test2 {
	public static void main(String[] args) throws IOException {
		// FileWriter fw = new FileWriter("hello.txt");
		FileReader fr = new FileReader("hello.txt");

		// fw.write("Hello Sachin");
		// fr.read();
		// System.out.println(fr);

		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();

		// fw.close();
	}
}
