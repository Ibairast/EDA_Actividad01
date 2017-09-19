package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Web {

	public String id2String(int x) throws IOException {
		String path = "C:\\Users\\Paul\\Downloads\\dataset3-2M-vertices-10M-arcs\\index"; // GRANDE
		// String path = "C:\\Users\\Paul\\Downloads\\small files\\small
		// files\\smallindex";
		FileInputStream inputStream = null;
		String dev = "numero incorrecto";
		Scanner sc = null;
		int cont = 0;

		try {
			inputStream = new FileInputStream(path);
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if (cont == x) {
					return line;
				}
				cont++;
				// System.out.println(line);
			}
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (sc != null) {
				sc.close();
			}
			// System.out.println(sw.elapsedTime());
		}

		return dev;

	}

	public int string2Id(String s) throws IOException {
		String path = "C:\\Users\\Paul\\Downloads\\dataset3-2M-vertices-10M-arcs\\index"; // GRANDE
		// String path = "C:\\Users\\Paul\\Downloads\\small files\\small
		// files\\smallindex";
		FileInputStream inputStream = null;
		int dev = 0;
		Scanner sc = null;
		String[] aux = null;
		//String aux2 = "";
		try {
			inputStream = new FileInputStream(path);
			sc = new Scanner(inputStream, "UTF-8");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				
				//aux2 = line.length()-1;
				//System.out.println(aux2);
				aux = line.split(" ");
				//aux2 = aux[0];
				if (aux[0].equals(s)) {
					dev = Integer.parseInt(aux[1]);
					//return dev;
				}
				
				// System.out.println(line);
			}
			if (sc.ioException() != null) {
				throw sc.ioException();
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (sc != null) {
				sc.close();
			}
			// System.out.println(sw.elapsedTime());
		}

		return dev;
	}
}
