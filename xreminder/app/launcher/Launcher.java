package xreminder.app.launcher;

import javax.swing.SwingUtilities;

public class Launcher {  
    
    public static void main(String [] args) {
        ApplicationCore appCore = new ApplicationCore();
        SwingUtilities.invokeLater(() -> {
            appCore.initComponents();
            appCore.setComponents();
            appCore.modifyComponents();
        });
        
    }
}
