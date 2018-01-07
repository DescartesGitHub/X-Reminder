package xreminder.app.launcher;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import xreminder.app.panel.AddButtonPanel;
import xreminder.app.panel.BasePanel;
import xreminder.app.panel.ScrollPane;

class Panel extends JPanel {

    void createPanel() {
        this.setLayout(new BorderLayout());

        BasePanel basePanel = new BasePanel();
        this.add(basePanel, BorderLayout.PAGE_END);
        
        ScrollPane scrollPane = new ScrollPane(basePanel);
        this.add(scrollPane, BorderLayout.EAST);
        
        AddButtonPanel addButtonPanel = new AddButtonPanel(basePanel, scrollPane);
        this.add(addButtonPanel, BorderLayout.SOUTH);
    }

 }
