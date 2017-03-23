
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Ahmad
{
  private JFrame frmTitleMethod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ahmad window = new Ahmad();
					window.frmTitleMethod.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ahmad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTitleMethod = new JFrame();
		frmTitleMethod.setTitle("Title Method();");
		frmTitleMethod.setResizable(false);
		frmTitleMethod.setBounds(100, 100, 1399, 903);
		frmTitleMethod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitleMethod.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1393, 26);
		frmTitleMethod.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Events");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewEvent = new JMenu("New Event");
		mnNewMenu.add(mnNewEvent);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New Event with duration");
		mnNewEvent.add(mntmNewMenuItem);
		
		JMenuItem mntmNewEventWithout = new JMenuItem("New Event without duration");
		mnNewEvent.add(mntmNewEventWithout);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmGetStarted = new JMenuItem("Get started");
		mnHelp.add(mntmGetStarted);
		
		JMenuItem mntmAboutUs = new JMenuItem("About us");
		mnHelp.add(mntmAboutUs);
		
		JMenuItem mntmContactUs = new JMenuItem("Contact us");
		mnHelp.add(mntmContactUs);
	}
}
