import java.util.Random;
import java.util.ArrayList;
//get ten rolls random numbers between 1 and 20 
// get random letter
//generate password
// get new password set
public class Puzzle {
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 1; i <=10; i++) {
            random10.add(rand.nextInt(20)+ 1);
        }
        return random10;

    }
    public String randomLetter() {
        Random ranLet = new Random();
        String alphString = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabet = new String[26];
        for(int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphString.charAt(i));
        }
        return alphabet[ranLet.nextInt(26)];
    }
    public String genPass(){
        String password = "";
        for(int i = 0; i < 8; i++) {
            password = password + randomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPassword(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }


}