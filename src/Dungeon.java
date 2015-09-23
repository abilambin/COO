
package dungeon;
import java.util.*;


public class Dungeon{

	

	//fields
	protected Player player;
	protected Room currentRoom;
	protected boolean gameIsFinished;
	protected Scanner scanner = new Scanner(System.in);
	

	
	/**
	* Constructor
	*/
	
	public Dungeon(Room firstRoom){
		this.currentRoom = firstRoom;
		this.gameIsFinished = false;
		
	}

	//methods
	public String getCurrentRoom(){
		return this.currentRoom;
	}
	
	
	public void interpretCommand(){
		String command = scanner.nextLine();
		if isCorrect(command){
			this.currentRoom = command;
		} else {
			System.out.println("There is no such direction, thank's to write one of the directions proposed");
		}
		
	}
	
	public void start(){
		do {
			System.out.println("You are in" + getCurrentRoom());
			nextRoom();
			System.out.print("> ");
			
			interpretCommand();
	
		} while (!gameIsFinished());
		
		System.out.println("You are in" + getCurrentRoom());
		if (GameIsWon()){
			System.out.println("You win !");
		} else {
			System.out.println("You loose !");
		}
	}
	
	public void nextRoom(){
		System.out.println("Where do you wanna go ?");
		if (this.currentRoom.north) {
			System.out.println(" -> north");			
		}
		if (this.currentRoom.east) {
			System.out.println(" -> east");			
		}
		if (this.currentRoom.south) {
			System.out.println(" -> south");			
		}
		if (this.currentRoom.west) {
			System.out.println(" -> west");			
		}
	}


	
	public boolean gameIsFinished(){
		return gameIsWon() || gameIsLost();
	}
	
	public boolean gameIsWon(){
		return (this.currentRoom == exit);
	}
	
	public boolean gameIsLost(){
		return (this.player.isDead());
	}
	
	
}