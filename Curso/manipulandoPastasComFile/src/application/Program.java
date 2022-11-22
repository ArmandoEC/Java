package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho da pasta"); //recebendo do usuário o caminho para a pasta
		String strPath = sc.nextLine();
		
		File path = new File(strPath);//lendo o arquivo da pasta
		
		File[] folders = path.listFiles(File::isDirectory);//função para pegar os nomes apenas dos diretórios
		System.out.println("FOLDERS: "); 
		for(File folder: folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);//função para pegar somente os arquivos
		System.out.println("FILES: ");
		for(File file: files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\novoDir").mkdir();//criando um diretório novo
		System.out.println("Diretório criado: "+sucess);
		
		
		
		System.out.print("Entre com o caminho do diretório: ");//entrando com o caminho para ler um arquivo
		String strPath1 = sc.nextLine();
			
		File path1 = new File(strPath1);
		
		System.out.println("getpath: "+path1.getPath());//imprimindo o caminho completo do arquivo com o nome dele
		System.out.println("getParent: "+path1.getParent());//pegando somento o caminho sem o nome do arquivo
		System.out.println("getName: "+path1.getName());//imprindo somente o nome do arquivo
		
		sc.close();

	}

}
