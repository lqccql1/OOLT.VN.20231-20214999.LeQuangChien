package hust.soict.hedspi.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Getter and setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and setter for cost
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


     public Media(int id, String title, String category, float cost) {
            this.id = id;
            this.title = title;
            this.category = category;
            this.cost = cost;
        }
 }
