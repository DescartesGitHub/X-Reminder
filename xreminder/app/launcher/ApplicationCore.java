package xreminder.app.launcher;

public class ApplicationCore {

    private Frame frame;
    private Panel panel;
    private TabbedPane tabbedPane;
    
    void initComponents() {
        frame = new Frame("X Reminder", 800, 600);
        
        tabbedPane = new TabbedPane();
    }
    
    void createComponents() {
        frame.createFrame();
    }

}
