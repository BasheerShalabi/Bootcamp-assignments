import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Art> arts = new ArrayList<>();
        arts.add(new Painting("Painting1", "Author1", "Description1", "Paint"));
        arts.add(new Painting("Painting2", "Author1", "Description1", "Paint"));
        arts.add(new Painting("Painting3", "Author2", "Description1", "Paint"));
        arts.add(new Sculpture("Sculpture1", "Author1", "Description1", "Stone"));
        arts.add(new Sculpture("Sculpture2", "Author1", "Description1", "Stone"));

        for(Art art : arts){
            art.viewArt();
        }

    }
}