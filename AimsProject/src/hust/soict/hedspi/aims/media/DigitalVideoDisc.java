package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {

	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isMatch(String title) {
	    String[] keywords = title.toLowerCase().split(" ");
	    String discTitle = this.getTitle().toLowerCase();
	    for (String keyword : keywords) {
	        if (!discTitle.contains(keyword)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Director: " + getDirector() + ", Length: " + getLength();
    }
	
	@Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD Length: " + getLength());
    }
	public boolean isMatchTitle(String title1) {
		return this.getTitle().equals(title1);
	}

}