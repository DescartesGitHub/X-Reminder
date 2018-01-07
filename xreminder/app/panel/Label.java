package xreminder.app.panel;

import java.awt.Dimension;
import javax.swing.JLabel;

public class Label extends JLabel {

    public Label(String name) {
        super(name);
        this.setPreferredSize(new Dimension(155,50));
    }
    
}
