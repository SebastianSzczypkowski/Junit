import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Properties;

public class RateProvider {
    Properties rates;
    public void loadFromFile(String fileLocation) throws IOException
    {
        System.out.println("Wczytuje z pliku");
        rates = new Properties();
        InputStream fs =new FileInputStream(fileLocation);
        rates.load(fs);
        fs.close();
    }
    public void loadFromStream(InputStream inputStream) throws IOException
    {
        System.out.println("Wczytuje ze strumienia");
        rates = new Properties();
        rates.load(inputStream);
    }
    public BigDecimal getRate(String currency)
    {
        String rateStr=rates.getProperty(currency);
        BigDecimal rate= new BigDecimal(rateStr);
        return rate;
    }

}
