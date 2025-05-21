public class Painting extends Art{
    String paintType;

    public Painting(String title, String author, String description, String paintType){
        super(title, author, description);
        this.paintType = paintType;
    }

    @Override
    void viewArt() {
        System.out.println("title: " + title + " author: " + author + " description: " + description + " paintType: " + paintType);
    }
}
