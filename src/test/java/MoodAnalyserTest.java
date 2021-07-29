/*****************************************************************
 * Purpose : learning Junit test case, exception handling
 * custom exception and reflections through mood analyzer problem.
 * @author Ganesh Gavahd
 * @version 1.0
 * @since 29.07.2021
 ******************************************************************/
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MoodAnalyserTest {
    public String input;
    public String expected;

    public MoodAnalyserTest(String input,String expected){
        this.input=input;
        this.expected=expected;
    }
    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{{"I am sad", "SAD"}, {"I am Happy", "HAPPY"}, {"I am sad", "SAD"}, {"He is Happy", "HAPPY"}, {"sad is about sad", "SAD"}, {"I was Happy", "HAPPY"},{null,"HAPPY"}});
    }
   /*
    * this is test case for analyse mood Method.
    * if Method Argument contain 'sad' character then it should return SAD
    * else return HAPPY
    */
    @Test
    public void givenMessage_ShouldReturnMood() {
        MoodAnalyser analyser= new MoodAnalyser();
        String mood = analyser.analyseMood(input);
        Assert.assertEquals(expected,mood);
    }
}
