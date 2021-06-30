import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Properties;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

public class RateProviderTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void shouldReadRate() throws IOException
    {
        File file = temporaryFolder.newFile();
        System.out.println(file.getAbsolutePath());
        Properties properties= new Properties();
        properties.put("USD","3.95");
        OutputStream outputStream = new FileOutputStream(file);
        properties.store(outputStream,null);
        outputStream.close();
        RateProvider rateProvider = new RateProvider();
        rateProvider.loadFromFile(file.getAbsolutePath());
        BigDecimal result=rateProvider.getRate("USD");
        assertThat(result,equalTo(new BigDecimal("3.95")));

    }


}