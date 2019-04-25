package Behavioural.Factory;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String type) {
		EnemyShip ship = null;
		
		if("u".equals(type)) {
			ship = new UFOEnemyShip();
		} else if("r".equals(type)) {
			ship = new RocketEnemyShip();
		}
		
		return ship;
	}

}
