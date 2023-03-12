package challenges;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileWrite extends BaseTestNg {
	String fileName = "./files/MyFile.txt";


	@Test
	public void usingBufferWriter() {
		FileWriter fw;
		try {
			fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Amazon India Private Limited");
			bw.newLine();
			bw.write("TestLeaf Solutions Private Limited");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
