package vista;

import java.awt.Canvas;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

import manager.SaveManager;

//import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display extends JFrame{

	private int ancho;
	private int alto;
	private String titulo;
	private Canvas canvas; 
	private SaveManager save;
	
	public Display(int ancho, int alto, String titulo) throws HeadlessException {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.titulo = titulo;
		init();
	}

	public void init(){
		setSize(ancho, alto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(titulo);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		canvas=new Canvas();
		canvas.setSize(ancho, alto);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save=new SaveManager();
				save.savePlayer("save.txt");
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cargar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save=new SaveManager();
				save.readPlayer("save.txt");
				//System.out.println("Hola");
			}
		});
		btnNewButton_1.setBounds(109, 11, 89, 23);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(canvas);
		//add(canvas);
		//pack();
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

}
