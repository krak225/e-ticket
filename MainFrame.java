import javax.swing.JFrame;
 
public class MainFrame extends JFrame{
 
	public MainFrame(){
		super();
 
		build();//On initialise notre fenêtre
	}
 
	private void build(){
		setTitle("E-ticket - Gestion des tickets"); //On donne un titre à l'application
		setSize(320,240); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
	}
}
