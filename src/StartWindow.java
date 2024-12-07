import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class StartWindow extends JFrame implements ComponentListener
{
    JFrame window = new JFrame();
    JPanel pane = new JPanel();
    JPanel innerPane = new JPanel(new GridBagLayout()); // Where the Music Is Made
    JTextArea tabs = new JTextArea("""
                                   <musicinfo>
                                   *title=\u201dDefault\u201d
                                   *bpm=120
                                   *key=c
                                   *timesig=4/4
                                   author=\u201dJackson Philips\u201d
                                   date=\u201d12-07-2024\u201d
                                   </musicinfo>
                                   
                                   <tabs>
                                   E|----/----/----/----|
                                   B|----/----/----/----|
                                   G|----/----/----/----|
                                   D|----/----/----/----|
                                   A|----/----/----/----|
                                   e|----/----/----/----|
                                   </tabs>
                                   """ //
                                );

    JToolBar toolbar = new JToolBar("Toolbar");
    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints c2 = new GridBagConstraints();
    int i = 0; // The Holy Integer! :O

    public StartWindow() 
    {
        JOptionPane.showMessageDialog(rootPane, "Thank you for trying out TabSource! Keep updated\n with the most recent downloads on our GitHub:\n", "TabSource "+APP_INFO.getDOWNLOAD_VERSION()+" - "+APP_INFO.getUPDATE_NAME(),  3);

        ConstraintEditor.setZeroInsets(c);

        windowSetup(window);
        window.add(pane);
        addToolbarButtons(toolbar);
        window.add(toolbar, BorderLayout.NORTH);   
        window.setMaximumSize(new Dimension(1920, 1080));
        window.setMinimumSize(new Dimension(768, 432));

        ConstraintEditor.setConstraints(c, 0, 0, 0, 0);

        innerPane.setBackground(ColorScheme.primary);
        pane.setBackground(ColorScheme.secondary);
        toolbar.setBackground(ColorScheme.secondary);
        window.setBackground(ColorScheme.secondary);

        innerPane.setMinimumSize(new Dimension(window.getMinimumSize().width - 10, window.getMinimumSize().height - 10));
        innerPane.setMaximumSize(new Dimension(window.getMaximumSize().width - 10, window.getMaximumSize().height - 10));
        innerPane.setPreferredSize(new Dimension(window.getSize().width - 10, window.getSize().height - 10));
        
        pane.add(innerPane, c);

        ConstraintEditor.setConstraints(c2, 0, 0, 0, 0);
        innerPane.add(tabs, c2);
        tabs.setForeground(ColorScheme.themeColorPrimary);
        tabs.setBackground(ColorScheme.themeColorSecondary);

        window.addComponentListener(StartWindow.this);





        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (i == 0) {
            System.out.println("[Dimension Testing");
            System.out.println("[Window Dimensions: "+window.getSize().toString());
            System.out.println("[");
            System.out.println("[Inner Pane Dimensions: "+innerPane.getSize().toString());
            System.out.println("[");
            System.out.println("[Toolbar Alignment...X: "+toolbar.getAlignmentX()+"...Y: "+toolbar.getAlignmentY());
            System.out.println("[TabSource "+APP_INFO.getDOWNLOAD_VERSION()+" - "+APP_INFO.getUPDATE_NAME());
            System.out.println("");

            if (innerPane.getPreferredSize().width != window.getSize().width - 10 || innerPane.getPreferredSize().height != window.getSize().height - 10) {
                innerPane.setPreferredSize(new Dimension(window.getSize().width - 10, window.getSize().height - 10));
            }

            

            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } 
    }
    public static StartWindow Instance() {
        return new StartWindow();
    }  
    private void windowSetup(JFrame w) {
        w.setTitle("TabSource "+APP_INFO.getDOWNLOAD_VERSION()+" - "+APP_INFO.getUPDATE_NAME());
        w.setSize(new Dimension(1280,720));
        w.setVisible(true);
    }
    private void addToolbarButtons(JToolBar tb) {
        JButton test1 = new JButton("TabSource");
        test1.setPreferredSize(new Dimension(50, 25));
        test1.setForeground(ColorScheme.themeColorPrimary);
        test1.setBackground(ColorScheme.themeColorSecondary);
        test1.setOpaque(true);
        test1.setVisible(true);
        test1.setBorderPainted(false);
        test1.setFocusPainted(false);
        tb.add(test1, FlowLayout.LEFT);
    }
    @Override
    public void componentResized(ComponentEvent e) {
        Update.updateSizeOf(window, innerPane);
    }
    @Override
    public void componentMoved(ComponentEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'componentMoved'");
    }
    @Override
    public void componentShown(ComponentEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'componentShown'");
    }
    @Override
    public void componentHidden(ComponentEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'componentHidden'");
    }
}
