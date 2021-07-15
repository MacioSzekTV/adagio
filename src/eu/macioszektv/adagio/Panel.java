package eu.macioszektv.adagio;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel{

	public String getTitle(Panel this) {
		TitledBorder tb = (TitledBorder)this.getBorder();
		return tb.getTitle();
	}
	
	public void setTitle(Panel this, String title) {
		Border border = BorderFactory.createTitledBorder(title);
		this.setBorder(border);
	}
}
