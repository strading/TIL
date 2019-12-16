package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import day06.ex.Book;
import day06.ex.BookApp;

public class Test08 {
	public static void main(String[] args) {
		System.out.println("-----------START--------------");
		Scanner scanner = null;

		try (Scanner scanner = new Scanner(new File("bookdata.txt"));) {
			StringTokenizer st = null;
			while (scanner.hasNextLine()) {
				st = new StringTokenizer(scanner.nextLine());

			}

		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일확인 해 주세요");
		}

		
		System.out.println("------------END---------------");
	}
}
