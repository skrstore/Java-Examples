import java.io.File;
import java.io.IOException;

class Test1 {
	public static void main(String[] args) throws IOException {
		File f = new File("hello.txt");
		System.out.println(f.exists());
		if (!f.exists()) {
			f.createNewFile();
		}
		System.out.println(f.exists());
	}
}
