package skeleton;

import java.util.Scanner;

public class Main {
	//Scanner a user inputhoz
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Fõmenü
		Menu.menuPrint();
		Menu.input();
	}
}
