package fileDois;

import java.io.File;
import java.util.Scanner;

public class FileDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Caminho: ");
			String camit = sc.nextLine();
			
		File path = new File(camit);
		
		//lista os diretórios da pasta informada no caminho
		
		File[] trio = path.listFiles(File :: isDirectory);
		
		System.out.println("Pastas: ");
		
		for(File trios: trio) {
			
			System.out.println(trios);
		}
		
	//lista os arquivos da pasta informada no caminho	
		File[] arqs = path.listFiles(File :: isFile);
		System.out.println("Arquivos: ");
		
		
		for(File aqrss : arqs) {

				System.out.println(aqrss);
		
		}
		sc.close();
	}

}
