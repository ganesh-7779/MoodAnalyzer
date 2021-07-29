import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser analyser = new MoodAnalyser();
    @Test
    public void givenMessage_whenContainSad_ShouldReturnSad(){
        String mood = analyser.analyseMood("I am in sad Mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
