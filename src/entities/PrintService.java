package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Generic> {

	private List<Generic> list = new ArrayList<>();

	public void addValue(Generic value) {
		list.add(value);
	}

	public Generic first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}

		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}

		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.print("]");

	}

}
