package hust.soict.hedspi.aims.media;

import java.lang.String;

public class DigitalVideoDisc extends Disc {
	private static int nbDigitalVideoDisc = 0;
	private String title;
	private String category;
	private String directory;
	private int lenght;
	private float cost;
	public int id = nbDigitalVideoDisc;
	
	public DigitalVideoDisc(String title) {
	    super(0, title, "", 0.0f);
	    nbDigitalVideoDisc++;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
	    super(0, title, category, cost);
	    nbDigitalVideoDisc++;
	}

	public DigitalVideoDisc(String title, String category, String directory, float cost) {
	    super(0, title, category, cost);
	    this.directory = directory;
	    nbDigitalVideoDisc++;
	}

	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
	    super(0, title, category, cost);
	    this.directory = directory;
	    this.length = length;
	    nbDigitalVideoDisc++;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLenght() {
		return lenght;
	}
	public float getCost() {
		return cost;
	}
	
	// In ra thông tin sản phẩm bao gồm, tiêu đề, category, drectory, chiều dài, giá
	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + directory + " - "
				+ lenght + ": " + cost + "$";
	}
	
	// Hàm kiểm tra xem title nhập vào có trùng với title trong giỏ hàng không
	public boolean isMatchTitle(String title1) {
		return this.getTitle().equals(title1);
	}
	
}