package vista;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import manager.ImageManager;
import manager.Recursos;

public class Jugador {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private BufferedImage imagen;
	private Game juego;

	public Jugador(Game juego,int x, int y) {
		super();
		this.juego=juego;
		this.x = x;
		this.y = y;
		dx=1;
		dy=1;
		imagen=Recursos.jugador;
	}

	public void update(){
		if(juego.getKm().isDerecha()){
			if(x<=juego.getAncho()-40){
				x+=dx;
			}
		}
		else if(juego.getKm().isIzquierda()){
			if(x>=10){
				x-=dx;
			}	
		}
		
		else if(juego.getKm().isArriba()){
			if(y>=10){
				y-=dy;
				System.out.println(getX());
			}	
		}
		
		else if(juego.getKm().isAbajo()){
			if(y<=juego.getAlto()-60){
				y+=dy;
			}	
		}
		
	}
	

	public void render(Graphics g){
		g.drawImage(imagen, x, y, null);
		//g.dispose();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
}
