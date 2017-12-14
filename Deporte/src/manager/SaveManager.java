package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import vista.Game;
import vista.Jugador;


public class SaveManager {

int pXpos = 0;
int pYpos = 1;
int x;
int y;


Jugador jug= Game.jugador;

int [] saveInformation = {Game.playerX, Game.playerY};
	
public void readPlayer(String filePath){
	
	File inputFile;
	BufferedReader inputReader;
	
	try{
		inputFile = new File(filePath);
		inputReader = new BufferedReader(new FileReader(inputFile));
		
		for(int i = 0; i < saveInformation.length; i++){
			saveInformation[i] = Integer.parseInt(inputReader.readLine()); 
		}
	   // jugador=new Jugador(null, pXpos, pXpos);
		System.out.println(jug.getX());
		jug.setX(saveInformation[pXpos]);
		jug.setY(saveInformation[pYpos]);
		//playerY = saveInformation[pYpos];
		System.out.println(jug.getX());
		inputReader.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
	
	public void savePlayer(String filePath){
		
		File outputFile;
		BufferedWriter outputWriter;
		
		try{
			outputFile = new File(filePath);
			outputWriter = new BufferedWriter(new FileWriter(outputFile));
			
			System.out.println(Game.playerX);
			saveInformation[pXpos] = Game.playerX;
			saveInformation[pYpos] = Game.playerY;
			System.out.println(Game.playerX);
			
			for(int i = 0; i < saveInformation.length; i++ ){
				outputWriter.write(Integer.toString(saveInformation[i]) + "\n");
			}
			
			outputWriter.close();
			
		}catch(Exception e){
				e.printStackTrace();
		}
		
	}
	
}
