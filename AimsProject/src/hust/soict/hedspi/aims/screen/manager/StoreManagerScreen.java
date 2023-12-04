package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class StoreManagerScreen extends JFrame {
	private Store store;
	
	private static final long serialVersionUID = 123456789L;

	public static void main(String[] args) throws Exception {
		//Test
		Store myStore = new Store();
		Cart myCart = new Cart();

		//Create DVDs
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Comic","Harry Potter and the Philosopher's Stone (2001)", 3.0f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comic","Harry Potter and the Chamber of Secrest (2002)", 3.5f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Comic","Harry Potter and the Prisoner of Azzkaba (2004)", 5.0f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Comic","Harry Potter and the Goblet of Fire (2005)", 4.5f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("films","Fetch the Bolt Culters", 10.39f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("films","Future Nostalgia",9.6f);
		Book book1 = new Book("", "The Hunger Games", 5.5f);
		book1.addAuthor("Conan Doyle");
		Book book2 = new Book("", "Catching Fire", 4.9f);
		book2.addAuthor("Conan Doyle");
		Book book3 = new Book("", "Mockingjay", 5.1f);
		book3.addAuthor("Conan Doyle");
		
		//Try adding DVDs
//		myStore.addMedia(dvd2, 5);
		myStore.addMedia(dvd2);
		myStore.addMedia(dvd1);
		myStore.addMedia(dvd3);
		myStore.addMedia(dvd4);
		myStore.addMedia(dvd5);
		myStore.addMedia(dvd6);
		myStore.addMedia(book1);
		myStore.addMedia(book2);
		myStore.addMedia(book3);
		new StoreManagerScreen(myStore, myCart);
	}
	
	
	public StoreManagerScreen (Store store, Cart cart) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024,768);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x,y);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		menu.add(new JMenuItem("View store"));
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		menu.add(smUpdateStore);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}	
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i =0; i < 9; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		
		return center;
	}
}