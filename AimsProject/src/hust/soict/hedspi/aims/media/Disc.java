package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public String getType() {
	        return "Disc";
	}
	
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public int getLength() {
		return length;
	}
	
	public String getDirector() {
		return director;
	}
	
	

}