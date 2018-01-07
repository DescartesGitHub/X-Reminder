package xreminder.app.panel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollPane extends JScrollPane {

    private JPanel panel;
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ScrollPane(JPanel panel) {
        super(panel);
        this.panel = panel;
        this.getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());
        this.getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());  
        this.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS); 
    }
    
    void moveScrollBar() {
        this.setViewportView(panel);
        this.getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());
        this.getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());
    }
      
}
