package xreminder.app.panel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AddButtonPanel extends JPanel {

    private BasePanel panel;
    private ScrollPane scrollPane;
    
    public AddButtonPanel(BasePanel panel, ScrollPane scrollPane) {
        this.panel = panel;
        this.scrollPane = scrollPane;
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add(new Button("Add tab"));  
    }
    
    class Button extends JButton {

        Button(String name) {
            super(name);
            this.addActionListener((e) -> {
                panel.getListPanelOfTabs().addNewTab();
                scrollPane.moveScrollBar();
            });
        }
          
    }
    
}
