import java.util.ArrayList;

public class PuzzleJava<T> {
    public int[] getTenRolls(){
        int[] tenRolls = new int[10];
        for(int i = 0; i < tenRolls.length; i++){
            tenRolls[i] = (int)(Math.random()*20)+1;
        }
        return tenRolls;
    }

    public char getRandomLetter(){
        return (char)(Math.random()*26+'a');
    }
    public String generatePassword(){
        String password = "";
        for(int i = 0; i < 8; i++){
            password += getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwords = new ArrayList<>();
        for(int i = 0; i < length; i++){
            passwords.add(generatePassword());
        }
        return passwords;
    }
    public ArrayList<T> shuffleArray(ArrayList<T> array){
        int index1 = (int)(Math.random()*array.size());
        int index2 = (int)(Math.random()*array.size());
        T temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
        return array;
    }

}
