package ControllerNorthUndecorate;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ControllerMinMaxClose implements MouseListener, KeyButton , LocalDimension{

    private JFrame frame;
    private JLabel label, lableResult, jLabelPathExcell;
    private String key;
    private int count;
    private ScripsRunTime srt = new ScripsRunTime();
    private JTable table;
    private Dimension dimension;

    public ControllerMinMaxClose(JFrame frame, JLabel label, String key, Dimension dimension) {
        this.frame = frame;
        this.label = label;
        this.key = key;
        this.dimension = dimension;
    }

    public ControllerMinMaxClose(JFrame frame, JLabel label, String key) {
        this.frame = frame;
        this.label = label;
        this.key = key;
    }

    public ControllerMinMaxClose(JFrame frame, JLabel label, String key, JLabel jLabelPathExcell, JTable table, JLabel lableResult) {
        this.frame = frame;
        this.label = label;
        this.key = key;
        this.jLabelPathExcell = jLabelPathExcell;
        this.table = table;
        this.lableResult = lableResult;
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        SwingUtilities.invokeLater(() -> {
            choice(me);
        });

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    private void choice(MouseEvent me) {
        switch (key) {
            case min:
                minimize();
                break;
            case max:
                maximize(me);
                break;
            case close:
                close();
                break;

        }

    }

    private void maximize(MouseEvent me) {
        ++count;
//        System.out.println("contClick : " + count);
        if (count % 2 == 0) {
            frame.setSize((int)dimension.getWidth(), (int)dimension.getHeight());
            frame.setLocationRelativeTo(null);  
        } else {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            frame.setSize((int) width, (int) height - 45);
            frame.setLocationRelativeTo(null);  
        }

    }

    private void minimize() {

        frame.setState(frame.ICONIFIED);
    }

    private void close() {
        System.exit(0);
    }

    DefaultTableModel tableModel() {
        return (DefaultTableModel) table.getModel();
    }

}
