package code;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GUI extends JFrame {
	private IData_Model _model;
	private javax.swing.Timer _timer;


	
	
public GUI(){
super("Time Manager");	
this.setSize(new Dimension(300,300));
this.setVisible(true);

	
	
}
	
public void makeNewButton(String taskName){
	
	 JButton button = new JButton(taskName);
	 button.addActionListener(new taskButtonListener());
	 this.add(button);
	 this.setLayout(new FlowLayout());
	 
	
}	


private class taskButtonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(_timer == null){
		
		_timer = new Timer(0,null);
		
	}
		else {
		
			_timer = null;
		
		}
		}

}


}