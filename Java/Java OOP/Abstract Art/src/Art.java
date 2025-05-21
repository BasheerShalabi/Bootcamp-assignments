public abstract class Art {
    String title;
    String author;
    String description;

    Art(String title, String author, String description){
        this.title = title;
        this.author = author;
        this.description = description;
    }
    abstract void viewArt();
}
