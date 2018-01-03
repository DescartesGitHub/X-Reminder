package xreminder.app.launcher;

public class Launcher {  
    
    public static void main(String [] args) {
        ApplicationCore appCore = new ApplicationCore();
        appCore.initComponents();
        appCore.createComponents();
    }
}
