/*******************************************
 * Purpose : learning Junit test case, exception handling
 * custom exception and reflections through mood analyzer problem.
 * @author Ganesh Gavahd
 * @version 1.0
 * @since 29.07.2021
 ******************************************/
public class MoodAnalyser {

    /*
     * this is a method for uc2 it will analyse message contain and respond
     * if message contain null then it catch null pointer exception and return HAPPY
     */
    public static String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains(("sad"))) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e){
            throw new MoodAnalysisException("Please Enter Proper Message");
        }
    }
    public static void main(String[] args) {
    }
}
