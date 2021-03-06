package models;

import java.io.Serializable;

public class Ship implements Serializable {
	private shipType type;
	private boolean isSunk = false;
	private int length;
	private boolean weaponUsed = false;
	
	public Ship(shipType type) {
		setShipType(type);
		switch (type) {
			case CARRIER:
				setLength(5);
				break;
			case BATTLESHIP:
				setLength(4);
				break;
			case CRUISER:
			case SUBMARINE:
				setLength(3);
				break;
			case DESTROYER:
				setLength(2);
				break;
		}
	}
	
	public boolean isWeaponUsed() {
		return weaponUsed;
	}
	
	public void setWeaponUsed(boolean weaponUsed) {
		this.weaponUsed = weaponUsed;
	}
	
	public shipType getShipType() {
		return type;
	}
	
	public void setShipType(shipType type) {
		this.type = type;
	}
	
	public boolean isSunk() {
		return isSunk;
	}
	
	public void setIsSunk(boolean isSunk) {
		this.isSunk = isSunk;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
		if (length <= 0) {
			setIsSunk(true);
		}
	}
}
