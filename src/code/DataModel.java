package code;
import java.util.ArrayList;
import code.interfaces.IData_Model;

public class DataModel implements IData_Model {
	private ArrayList<Task> _taskList;
	private code.GUI _gui;

	public DataModel() {
		_taskList= new ArrayList<Task>();
		_gui = new GUI(this);
	}

	public boolean addTask(Task t) {
		
		if(!_taskList.contains(t)){
			_taskList.add(t);
			_gui.makeNewButton(t.getTaskName());
			return true;
	}
		return false;
	
	}

	

	@Override
	public boolean removeTask(Task t) {
		if(_taskList.contains(t)){
			for(Task u : _taskList){
				if(t==u){
					_taskList.remove(u);
					return true;
					
				}
				
			}
			
			
		}
		
		return false;
	}
		

	public Task getTask(String g_name){
		
		for(Task w :_taskList ){
			
			if (w.getTaskName() ==g_name ){
				
			return w;
				
			}
		}
		
		return new Task(null);
		
	}
	
	
}

