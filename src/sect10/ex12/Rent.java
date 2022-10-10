package sect10.ex12;

public class Rent {

	private String name;
	private String email;
	private byte room;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getRoom() {
		return room;
	}
	public void setRoom(byte room) {
		this.room = room;
	}
	
	public String toString() {
		return "Room" 
				+ " " + this.room + ": "
				+ " " + this.name + ", "
				+ " " + this.email;
	}
}
