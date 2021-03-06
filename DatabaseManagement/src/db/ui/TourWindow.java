package db.ui;

import db.ui.panels.TourEditPanel;
import db.ui.panels.TourSearchPanel;
import java.awt.Toolkit;

/**
 *
 * @author Gobinath
 */
public class TourWindow extends javax.swing.JFrame {
    private final TourEditPanel tourEditPanel;
    private final TourSearchPanel tourSearchPanel;
    
    /**
     * Creates new form TourWindow
     */
    public TourWindow() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/db/Image/Bus.png")));
        tourEditPanel = TourEditPanel.getInstance();
        tourSearchPanel = TourSearchPanel.getInstance();
        panelAdd.add(tourEditPanel);
        panelSearch.add(tourSearchPanel);
        //setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPanelMain = new javax.swing.JTabbedPane();
        panelAdd = new javax.swing.JPanel();
        panelSearch = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tour Management");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelAdd.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelAddComponentShown(evt);
            }
        });
        panelAdd.setLayout(new javax.swing.BoxLayout(panelAdd, javax.swing.BoxLayout.LINE_AXIS));
        tabbedPanelMain.addTab("Add New Tour", new javax.swing.ImageIcon(getClass().getResource("/db/Image/add.png")), panelAdd); // NOI18N

        panelSearch.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelSearchComponentShown(evt);
            }
        });
        panelSearch.setLayout(new javax.swing.BoxLayout(panelSearch, javax.swing.BoxLayout.LINE_AXIS));
        tabbedPanelMain.addTab("Search & Edit", new javax.swing.ImageIcon(getClass().getResource("/db/Image/view.png")), panelSearch); // NOI18N

        getContentPane().add(tabbedPanelMain);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelAddComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelAddComponentShown
        TourEditPanel.getInstance().refresh(null);
        panelAdd.removeAll();
        panelAdd.add(TourEditPanel.getInstance());
        panelAdd.repaint();
        panelAdd.validate();
    }//GEN-LAST:event_panelAddComponentShown

    private void panelSearchComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelSearchComponentShown
        TourSearchPanel.getInstance().refresh();
        panelSearch.removeAll();
        panelSearch.add(TourSearchPanel.getInstance());
        panelSearch.repaint();
        panelSearch.validate();
    }//GEN-LAST:event_panelSearchComponentShown

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JTabbedPane tabbedPanelMain;
    // End of variables declaration//GEN-END:variables
}
