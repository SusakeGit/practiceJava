package cn.com.github.array;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {

	static class ToDoItem implements Comparable<ToDoItem> {
		private char primary;
		private int secondary;
		private String item;

		public ToDoItem(String td, char pri, int sec) {
			primary = pri;
			secondary = sec;
			item = td;
		}

		public int compareTo(ToDoItem item) {
			if (primary > item.primary) {
				return 1;
			} else if (primary == item.primary) {
				if (secondary > item.secondary) {
					return 1;
				} else if (secondary == item.secondary) {
					return 0;
				}
			}
			return -1;
		}

		public String toString() {
			return Character.toString(primary) + secondary + ":" + item;
		}
	}

	public void add(String td, char pri, int sec) {
		super.add(new ToDoItem(td, pri, sec));
	}

	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.add("Empty trach", 'C', 4);
		list.add("Feed dog", 'A', 2);
		list.add("Feed bird", 'B', 7);
		list.add("Feed dog", 'C', 1);
		while (!list.isEmpty()) {
			System.out.println(list.remove());
		}
	}
}
