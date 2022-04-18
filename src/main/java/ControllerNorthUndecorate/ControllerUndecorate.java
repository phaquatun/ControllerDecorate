package ControllerNorthUndecorate;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControllerUndecorate implements MouseListener, MouseMotionListener  {

    private int x, y;

    private JFrame frame;

    

    public ControllerUndecorate(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {

        x = me.getX();
        y = me.getY();

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

    @Override
    public void mouseDragged(MouseEvent me) {

        frame.setLocation(me.getXOnScreen() - x, me.getYOnScreen()-y);
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {

    }

}
