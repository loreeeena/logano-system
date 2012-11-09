/*
 * LoganoApp.java
 */

package logano;

import java.awt.Dimension;
import javax.swing.JFrame;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import util.Helper;

/**
 * The main class of the application.
 */
public class LoganoApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        LoganoView main = new LoganoView(this);
        JFrame frame = main.getFrame();

        
        show(main);

        frame.setMinimumSize(new Dimension(800, 600));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        FrmLogin frmLogin = new FrmLogin();
        Helper.showForm(frmLogin);
        frmLogin.setLocationRelativeTo(frame);
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of LoganoApp
     */
    public static LoganoApp getApplication() {
        return Application.getInstance(LoganoApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        //SchemaDB.generate_schema();
        launch(LoganoApp.class, args);
    }
}
