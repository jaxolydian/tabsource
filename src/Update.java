import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Update {
    public static void updateSizeOf(JFrame updateWindow, JPanel updatePane) {
        updateWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            try {
                TimeUnit.NANOSECONDS.sleep(0);
                int w = updateWindow.getSize().width;
                int h = updateWindow.getSize().height;
                updatePane.setMinimumSize(new Dimension(updateWindow.getMinimumSize().width - 10, updateWindow.getMinimumSize().height - 10));
                updatePane.setMaximumSize(new Dimension(updateWindow.getMaximumSize().width - 10, updateWindow.getMaximumSize().height - 10));
                updatePane.setPreferredSize(new Dimension(w - 10, h - 10));
                System.out.println("Successful update");
            } catch (InterruptedException e) {
                System.err.println("Error when updating");
                System.exit(0);
            }
	} 
}
