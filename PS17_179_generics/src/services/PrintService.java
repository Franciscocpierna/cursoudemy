package services;

import java.util.ArrayList;
import java.util.List;

//public class PrintService {
public class PrintService<T> {

	//private List<Object> list = new ArrayList<>();
	private List<T> list = new ArrayList<>();

	//public void addValue(Object value) {
	public void addValue(T value) {
		list.add(value);
	}

	//public Object first() {
	public T first() {
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
		System.out.println("]");
	}
}
