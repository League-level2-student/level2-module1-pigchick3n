package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addname = new JButton("Add Name");
	JButton viewname = new JButton("View Name");
	int counter;
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.run();
	}
	void run(){
		frame.add(panel);
		panel.add(addname);
		panel.add(viewname);
		addname.addActionListener(this);
		viewname.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(buttonPressed==addname) {
			counter++;
		String x = JOptionPane.showInputDialog("Enter a name");
		names.add(x);
		}else if (buttonPressed==viewname) {
			String s="";
			for(int i = 0; i < names.size(); i++){
				s += "Guest #"+ i+": "+names.get(i)+"\n";
				
			}
			JOptionPane.showMessageDialog(null, s);
			}
	}
	}
