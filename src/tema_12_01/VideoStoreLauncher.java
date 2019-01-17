package tema_12_01;


public class VideoStoreLauncher {

	public static void main(String[] args) {
				
				VideoStore.addVideo ("Dancing in the raing");
				VideoStore.addVideo ("Rocky II");
				VideoStore.addVideo ("Stardust");
				VideoStore.addVideo ("The Matrix");
				VideoStore.addVideo ("Godfather II");
				VideoStore.addVideo ("Star Wars Episode IV: A New Hope");
				
				VideoStore.checkOut("The Matrix");
				VideoStore.checkOut("Godfather II");
				VideoStore.checkOut("Star Wars Episode IV: A New Hope");
				
				VideoStore.returnVideo("The Matrix");
				VideoStore.returnVideo("Godfather II");
				VideoStore.returnVideo("Star Wars Episode IV: A New Hope");
				
				VideoStore.receiveRating ("Dancing in the raing",5);				
				VideoStore.receiveRating ("Rocky II",4);				
				VideoStore.receiveRating ("Stardust", 5);				
				VideoStore.receiveRating("The Matrix", 4);
				VideoStore.receiveRating("The Matrix", 5);
				VideoStore.receiveRating("The Matrix", 5);				
				VideoStore.receiveRating("Godfather II", 4);
				VideoStore.receiveRating("Godfather II", 5);
				VideoStore.receiveRating("Godfather II", 3);				
				VideoStore.receiveRating("Star Wars Episode IV: A New Hope",1);
				VideoStore.receiveRating("Star Wars Episode IV: A New Hope",4);
				
				VideoStore.listInventory();
				
				}

}
