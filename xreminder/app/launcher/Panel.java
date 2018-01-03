package xreminder.app.launcher;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel {

    void createPanel() {
        this.setLayout(new GridLayout(8,1));
        this.add(new Button("button test"));
    }
    
    class Button extends JButton {
        
        private Button(String name) {
            super(name);
        }
        
    }
}
