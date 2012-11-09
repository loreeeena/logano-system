/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

/**
 *
 * @author loreh
 */
public class Helper {

    public static Date parseString(String s) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        return sdf.parse(s);
    }

    public static void showForm(JFrame frm)
    {
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setVisible(true);
    }

    public static void enterKeyPressed(java.awt.event.KeyEvent evt, javax.swing.JTextField textBox)
    {
        if(evt.getKeyCode() == KeyStroke.getKeyStroke("ENTER").getKeyCode())
            textBox.requestFocus();
    }

    public static void enterKeyPressed(KeyEvent evt, JLabel tbcuit) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
