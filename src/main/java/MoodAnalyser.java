/*******************************************
 * Purpose : learning Junit test case, exception handling
 * custom exception and reflections through mood analyzer problem.
 * @author Ganesh Gavahd
 * @version 1.0
 * @since 29.07.2021
 ******************************************/
public class MoodAnalyser {
    /*
     * this is a method for uc1 it will analyse message contain and respond
     */
    public static String analyseMood(String message) {
        if (message.contains(("sad"))) {
            return "SAD";
        } else {
            return "Happy";
        }
    }
    public static void main(String[] args) {
        System.out.print(analyseMood("Now my mood is sad"));
    }
}
