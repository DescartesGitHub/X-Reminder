package xreminder.app.launcher;

import javax.swing.JTabbedPane;

class TabbedPane extends JTabbedPane {

    public TabbedPane() {
        super();
    }
    
    void createTabbledPane() {
        this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
}
