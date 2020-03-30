package skeleton;

import java.util.Scanner;

public class Main {
	//scanner a user inputhoz
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//fõmenü
		Menu.menuPrint();
		Menu.input();
	}
}
