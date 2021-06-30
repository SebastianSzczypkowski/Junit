import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class MatchersTest {

    @Test
    public void testEqualTo(){
        String result = "wynik";
        //assertThat(result,equalTo("wynik"));
        assertThat(result,is("wynik"));
    }
    @Test
    public void testStrings()
    {
        String resul = "wynik bardzo skomplikowanej metody";
        assertThat(resul,containsString("bardzo"));
        assertThat(resul,startsWith("awynik"));
        assertThat(resul,endsWith("ody"));
    }
    @Test
    public void testStringsAllOf()
    {
        String result = "wynik bardzo skomplikowanej metody";
        assertThat(result,allOf(containsString("bardzo"),startsWith("wynik"),endsWith("ody")));
    }
    @Test
    public void testStringsAllOf2()
    {
        String result = "wynik bardzo skomplikowanej metody";
        assertThat(result,allOf(containsString("zzz"),startsWith("aa"),endsWith("ody")));
    }

    @Test
    public void testArrats()
    {
        List<String> result = Arrays.asList("element jeden","element dwa","element trzy");
         assertThat(result,everyItem(startsWith("element")));
         assertThat(result,hasItem("element dwa"));
         assertThat(result,hasItems(endsWith("dwa")));
    }



}
