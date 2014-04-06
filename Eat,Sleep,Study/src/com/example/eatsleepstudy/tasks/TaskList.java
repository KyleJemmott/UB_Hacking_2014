package com.example.eatsleepstudy.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class TaskList {

	
	public static List<TaskItem> ITEMS = new ArrayList<TaskItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, TaskItem> ITEM_MAP = new HashMap<String, TaskItem>();

	static {
		// Add 3 sample items.
		addItem(new TaskItem("1", "Eat"));
		addItem(new TaskItem("2", "Sleep"));
		addItem(new TaskItem("3", "Study"));
	}

	private static void addItem(TaskItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class TaskItem {
		public String id;
		public String content;

		public TaskItem(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
