package main;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] arg) throws IOException {
		Stopwatch sw = new Stopwatch();
		Web prueba = new Web();
		//System.out.println(prueba.id2String(2000000));  //Busqueda por numero
		System.out.println(prueba.string2Id("zzzwebhosting.com")); // Busqueda por nombre web
		System.out.println(sw.elapsedTime());
	}
}
