package xreminder.app.launcher;

import java.awt.event.KeyEvent;

public class ApplicationCore {

    private Frame frame;
    private Panel [] panel;
    private TabbedPane tabbedPane;
    
    void initComponents() {
        frame = new Frame("X Reminder", 800, 600);
        tabbedPane = new TabbedPane();
        panel = new Panel[3];
        initPanels();
    }
    
    void createComponents() {
        frame.createFrame();
        createPanels();
    }
    
    void modifyComponents() {
        frame.getContentPane().add(tabbedPane);
        modifyTabbedPanes();
    }
    
////////////////////////////////////////////////////////////////////////////////
    
    private void initPanels() {
        panel[0]= new Panel();
        panel[1]= new Panel();
        panel[2]= new Panel();
    }
   
    private void createPanels() {
        panel[0].createPanel();
        panel[1].createPanel();
        panel[2].createPanel();
    }
   
    private void modifyTabbedPanes() {
        tabbedPane.addTab("Current reminders", panel[0]);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_C);
        
        tabbedPane.addTab("Done reminders", panel[1]);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_D);
        
        tabbedPane.addTab("Undone reminders", panel[2]);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_U);
    }
    
}
