package code;

import javax.swing.JButton;

public class Task implements code.interfaces.ITask{
	
	private  double _timeSpent;
	private String _taskName;
	JButton button;
	
	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean end() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int timeOnTask() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getTaskName(){
		
		return _taskName;
		
	}

	public Task(String name){
		_taskName = name;
		_timeSpent = 0;
		
	}



public double timeSpent(){
	
	return _timeSpent;
}

public void addTime(double d){
	_timeSpent += d;
	
}

}




