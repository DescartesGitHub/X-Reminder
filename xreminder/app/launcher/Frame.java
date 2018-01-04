package xreminder.app.launcher;

import javax.swing.JFrame;
import lombok.Getter;

@Getter
class Frame extends JFrame {

    private final String TITLE;
    private final int WIDTH;
    private final int HEIGHT;
    
    Frame(String title, int width, int height) {
        this.TITLE = title;
        this.WIDTH = width;
        this.HEIGHT = height;
    }
    
    void createFrame() {
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
 
}
