package code;

public class Task implements ITask {
	private String _name;

	public Task() {

	}

	// get task name
	public String getTaskName() {
		return _name;
	}

	// set class name
	public void setTaskName(String name) {
		_name = name;
	}

	@Override
	public boolean start() {
		// TODO Add timer then start timer
		return false;
	}

	@Override
	public boolean end() {
		// TODO end timer and store values
		return false;
	}

	@Override
	public int timeOnTask() {
		// TODO Auto-generated method stub
		return 0;
	}

}
