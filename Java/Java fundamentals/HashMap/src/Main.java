import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap trackList = new HashMap();

        trackList.put("track1", "hello its me");
        trackList.put("track2", "hello its me too");
        trackList.put("track3", "hello its me three");
        trackList.put("track4", "hello its me four");

        System.out.println(trackList.get("track1"));
        for(Object key : trackList.keySet()){
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}