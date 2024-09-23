package cll;

public class Music {
	private String name;
	private String artist;
	
	Music(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}
	
	String getName(){ return name; }
	void setName(String name) { this.name = name; }
	
	String getArtist(){ return artist; }
	void setArtist(String artist) { this.artist = artist; }
	
	
	public String toString() {
		return "Music name: " +name+" By: "+artist;
	}
}
