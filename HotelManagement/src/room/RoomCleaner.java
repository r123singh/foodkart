package room;

import java.util.Vector;

public class RoomCleaner {

	private String cleanerName;
	private int cleanerIdentifier;
	private String cleanDescription;
	private boolean cleanerWorking;
	private Vector rooms;
	private int roomsCleaned;

	public String getCleanerName() {
		return cleanerName;
	}

	public void setCleanerName(String cleanerName) {
		this.cleanerName = cleanerName;
	}

	public int getCleanerIdentifier() {
		return cleanerIdentifier;
	}

	public void setCleanerIdentifier(int cleanerIdentifier) {
		this.cleanerIdentifier = cleanerIdentifier;
	}

	public String getCleanDescription() {
		return cleanDescription;
	}

	public void setCleanDescription(String cleanDescription) {
		this.cleanDescription = cleanDescription;
	}

	public boolean isCleanerWorking() {
		return cleanerWorking;
	}

	public void setCleanerWorking(boolean cleanerWorking) {
		this.cleanerWorking = cleanerWorking;
	}

	public Vector getRooms() {
		return rooms;
	}

	public void setRooms(Vector rooms) {
		this.rooms = rooms;
	}

	public int getRoomsCleaned() {
		return roomsCleaned;
	}

	public void setRoomsCleaned(int roomsCleaned) {
		this.roomsCleaned = roomsCleaned;
	}

}
