package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private int length;
    private String director;
    
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc() {
        super(0, "", "", 0.0f);
        this.length = 0;
        this.director = "";
    }
}
