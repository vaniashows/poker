public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			Table table = new Table(20);
			table.newHand();

			table.showPlayersHands();
//			table.showTableCards();
			table.showFlop();
			table.showTurn();
			table.showRiver();
		}
	}
}
