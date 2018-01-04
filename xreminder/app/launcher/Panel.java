package xreminder.app.launcher;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Panel extends JPanel {
    
    void createPanel() {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createEmptyBorder(20,100,20,100));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8,1,0,5));
        panel.add(new SpecificPanel("8","h"));
        panel.add(new SpecificPanel("7","g"));
        panel.add(new SpecificPanel("6","f"));
        panel.add(new SpecificPanel("5","e"));
        panel.add(new SpecificPanel("4","d"));
        panel.add(new SpecificPanel("3","c"));
        panel.add(new SpecificPanel("2","b"));
        panel.add(new SpecificPanel("1","a"));
        this.add(panel, BorderLayout.PAGE_END);
    }

    class Button extends JButton {

        private Button(String name) {
            super(name);
        }
    }
    
    private class SpecificPanel extends JPanel {
        
        private final int SIZE_OF_S_PANEL = 110;
        
        SpecificPanel(String date, String tag) {
            this.setLayout(new BorderLayout());
            JPanel panelOfLabels = new JPanel();
            panelOfLabels.setLayout(new GridLayout(2,1));
            panelOfLabels.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panelOfLabels.add(new JLabel(date));
            panelOfLabels.add(new JLabel(tag));
           
            JPanel panelOfButtons = new JPanel();
            panelOfButtons.setLayout(new GridLayout(2,2,3,3));
            panelOfButtons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panelOfButtons.setPreferredSize(new Dimension(SIZE_OF_S_PANEL,SIZE_OF_S_PANEL));
            panelOfButtons.add(new Button("A"));
            panelOfButtons.add(new Button("B"));
            panelOfButtons.add(new Button("C"));
            panelOfButtons.add(new Button("D"));
            
            this.setBackground(Color.red);
            panelOfButtons.setBackground(Color.red);
            panelOfLabels.setBackground(Color.red);
            this.add(panelOfLabels, BorderLayout.WEST);
            this.add(panelOfButtons, BorderLayout.EAST);
        }
    }
}

