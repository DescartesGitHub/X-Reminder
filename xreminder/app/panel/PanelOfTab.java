package xreminder.app.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class PanelOfTab extends JPanel {

    private String date, tag;

    public PanelOfTab(String date, String tag) {
        this.date = date;
        this.tag = tag;
    }
    
    void setPanelOfTab() {
        PanelOfLabels panelOfLabels = new PanelOfLabels(date, tag);
        panelOfLabels.setPanelOfLabels();
        
        PanelOfButtons panelOfButtons = new PanelOfButtons();
        panelOfButtons.setPanelOfButtons();

        this.setBackground(Color.RED);
        this.add(panelOfLabels, BorderLayout.WEST);
        this.add(panelOfButtons, BorderLayout.EAST);
    }

 ///////////////////////////////////////////////////////////////////////////////
    
    private class PanelOfLabels extends JPanel {

        private String date, tag;   

        PanelOfLabels(String date, String tag) {
            super();
            this.date = date;
            this.tag = tag;
        }

        void setPanelOfLabels() {
            this.setLayout(new GridLayout(2,1));
            this.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
            this.add(new Label(date));
            this.add(new Label(tag));
            this.setBackground(Color.RED);
        }

    }
    
 ///////////////////////////////////////////////////////////////////////////////
    
    private class PanelOfButtons extends JPanel {

        private final Button done = new Button();
        private final Button undone = new Button();
        private final Button edit = new Button();
        private final Button delete =new Button();
        
        public PanelOfButtons() {
            super();
        }

        void setPanelOfButtons() {
            this.setLayout(new GridLayout(2,2,3,3));
            this.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            this.setPreferredSize(new Dimension(110,110));
            this.add(done);
            this.add(undone);
            this.add(edit);
            this.add(delete);
            setButtons();
            buttonEvents();
            this.setBackground(Color.red);
        }
        
        private void setButtons() {
            done.setIcon(new ImageIcon("res/done.png"));
            edit.setIcon(new ImageIcon("res/gear.png"));
            delete.setIcon(new ImageIcon("res/trash.png"));
        }
        
        private void buttonEvents() {
            done.addActionListener((e) -> {
                System.out.println("A");
            });
            
            undone.addActionListener((e) -> {
                System.out.println("B");
            });
            
            edit.addActionListener((e) -> {
                System.out.println("C");
            });
            
            delete.addActionListener((e) -> {
                System.out.println("D");
            });
        }
    }

}
