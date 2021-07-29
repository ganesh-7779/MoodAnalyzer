/*******************************************
 * Purpose : learning Junit test case, exception handling
 * custom exception and reflections through mood analyzer problem.
 * @author Ganesh Gavahd
 * @version 1.0
 * @since 29.07.2021
 ******************************************/
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser analyser = new MoodAnalyser();
   /*
    * this is test case for analyse mood Method.
    * if Method Argument contain 'sad' character then it should return SAD
    */
    @Test
    public void givenMessage_whenContain_sad_ShouldReturnSad(){
        String mood = analyser.analyseMood("I am in sad Mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    /*
     * this is test case for analyse mood Method.
     * if Method Argument does not contain 'sad' character then it should return HAPPY
     */
    @Test
    public void givenMessage_whenNotContain_sad_ShouldReturnHappy(){
        String mood = analyser.analyseMood("I am in any Mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
