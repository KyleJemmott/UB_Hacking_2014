package code;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import code.interfaces.*;

public class GUI extends JFrame {
	private DataModel _model;
	private TaskTimer _timer;
	private double _timeNow;
	private Task currentTask;


	

	
public GUI(DataModel model){

super("Time Manager");	
_model = model;
this.setSize(new Dimension(300,300));
this.setVisible(true);
makeNewButton("Task");
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
	

	
public void makeNewButton(String taskName){
	
	 JButton button = new TaskButton(taskName,_model);
	 button.addActionListener(new taskButtonListener());
	 currentTask = _model.getTask(taskName);
		 this.add(button);
	 this.setLayout(new FlowLayout());
	 
	
}	


private class taskButtonListener implements ActionListener{
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		_timer = new TaskTimer();
		double _lastTime = _timeNow;
		_timeNow = System.currentTimeMillis();
		currentTask.addTime(_timeNow - _lastTime);
}


}
}

class TaskButton extends JButton{
	public Task task;
	
	public TaskButton(String s,DataModel m){
		
		super(s);
		task = m.getTask(s);
		
	}
	
	
}