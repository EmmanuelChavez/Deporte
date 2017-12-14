package vista;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Test {

	public static void main(String args[]){
		Game ventana=new Game(648, 380,"Hola");
		ventana.start();
		
		//AudioManager manager=new AudioManager("/sonidos/sonido3.wav");
		//manager.loop();
		
	}

}
