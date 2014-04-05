package code;
import java.util.ArrayList;
import code.GUI;

public class DataModel implements IData_Model {
	private ArrayList<Task> _list;
	private code.GUI _gui;

	public DataModel() {
		_list = new ArrayList<Task>();
		_gui = new GUI();
	}

	public void addTask(Task t) {
		_list.add(t);
		_gui.makeNewButton();
	}


}
