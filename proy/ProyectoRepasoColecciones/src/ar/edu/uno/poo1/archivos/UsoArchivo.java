package ar.edu.uno.poo1.archivos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsoArchivo {

	public static void main(String[] args) {
		File file = new File("src/ar/edu/uno/poo1/archivos/UsoArchivo.java");
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.canExecute());
		System.out.println(file.isHidden());
		System.out.println(file.lastModified());
		Date date = new Date(file.lastModified());
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));
		File dir = new File("src/ar/edu/uno/poo1/archivos/");
		System.out.println(dir.isDirectory());
		for (File f : dir.listFiles())
			System.out.println(f.getName());
	}

}