package xreminder.app.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import lombok.Getter;

@Getter
public class BasePanel extends JPanel {

    private ListPanelOfTabs listPanelOfTabs; 

    public BasePanel() {
        listPanelOfTabs = new ListPanelOfTabs();
        listPanelOfTabs.addTabs();
        
        this.setBorder(BorderFactory.createEmptyBorder(20,100,20,100));
        this.add(listPanelOfTabs, BorderLayout.CENTER);
    }
      
}

////////////////////////////////////////////////////////////////////////////////

class ListPanelOfTabs extends JPanel {

    private int countOfTabs = 1;
    private final GridLayout gridLayout = new GridLayout(countOfTabs,1,1,5);

    ListPanelOfTabs() {
        this.setLayout(gridLayout);
    }
    
    void addTabs() {
        PanelOfTab [] panelOfTab = new PanelOfTab[countOfTabs];
        for(PanelOfTab pot : panelOfTab) {
            pot = new PanelOfTab("123", "test");
            pot.setPanelOfTab();
            this.add(pot);
        }
    }
    
    public void addNewTab() {
        gridLayout.setRows(++countOfTabs);
        PanelOfTab pot = new PanelOfTab("333", "new");
        pot.setPanelOfTab();
        this.add(pot);
        this.revalidate();
        this.repaint();
    }
}
