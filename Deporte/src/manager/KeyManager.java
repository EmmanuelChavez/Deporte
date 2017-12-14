package manager;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyManager extends KeyAdapter{

	private boolean[] keys;
	private boolean izquierda, derecha, arriba, abajo;
	
	public KeyManager() {
		keys=new boolean[256];
	}
	
	public boolean[] getKeys() {
		return keys;
	}

	public boolean isIzquierda() {
		return izquierda;
	}

	public boolean isDerecha() {
		return derecha;
	}
	
	public boolean isArriba() {
		return arriba;
	}

	public boolean isAbajo() {
		return abajo;
	}


	public void update(){
		izquierda=keys[KeyEvent.VK_LEFT];
		derecha=keys[KeyEvent.VK_RIGHT];
		arriba=keys[KeyEvent.VK_UP];
		abajo=keys[KeyEvent.VK_DOWN];
	}

	public void keyPressed(KeyEvent e){
		keys[e.getKeyCode()]=true;
		update();
	}
	
	public void keyReleased(KeyEvent e){
		keys[e.getKeyCode()]=false;
		update();
	}
	
	
}
