package ru.job4j.tracker;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);

	@Override
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	@Override
	public int ask(String question, List<Integer> range) {
		int key = Integer.parseInt(this.ask(question));
		boolean exist = false;
		for (int answer : range) {
			if (answer == key) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			throw new MenuOutException("Нет такого пункта меню");
		}
		return key;
	}
}