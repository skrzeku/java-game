package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.eclipse.swt.events.DisposeEvent;

public class siema implements ActionListener {
	
	ramka12 frame;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.setVisible(false);

	}

}
