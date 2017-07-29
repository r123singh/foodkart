package room;

public class Room {

	private int roomNumber;
	private int roomIdentifier;
	private String hotelName;
	private boolean roomOccupied;
	private boolean roomBooked;
	private RoomType roomType;
	private int roomRate;
	private boolean roomCleaned;

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomIdentifier() {
		return roomIdentifier;
	}

	public void setRoomIdentifier(int roomIdentifier) {
		this.roomIdentifier = roomIdentifier;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public boolean isRoomOccupied() {
		return roomOccupied;
	}

	public void setRoomOccupied(boolean roomOccupied) {
		this.roomOccupied = roomOccupied;
	}

	public boolean isRoomBooked() {
		return roomBooked;
	}

	public void setRoomBooked(boolean roomBooked) {
		this.roomBooked = roomBooked;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(int roomRate) {
		this.roomRate = roomRate;
	}

	public boolean isRoomCleaned() {
		return roomCleaned;
	}

	public void setRoomCleaned(boolean roomCleaned) {
		this.roomCleaned = roomCleaned;
	}

}
