package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class ReplaceItem extends BaseAction {
	private final Consumer<String> output;

	public ReplaceItem(int key, String info, Consumer<String> output) {
		super(key, info);
		this.output = output;
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		output.accept("------------- Замена заявки ---------------");
		String id = input.ask("Введите Id заявки, для ее изменения :");
		String name = input.ask("Введите новое имя заявки :");
		String desc = input.ask("Введите новое описание заявки :");
		Item item = new Item(name, desc);
		if (tracker.replace(id, item)) {
			output.accept("------------ Новая заявка с Id: " + item.getId() + " " + "заменена!");
		} else {
			output.accept("------------ Заявка не заменена!------------");
		}
	}
}