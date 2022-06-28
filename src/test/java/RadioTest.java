import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void nextRadioStation(){
        Radio radio = new Radio();
        radio.next();

        int excepted = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted,actual);
    }
    @Test
    public void prevRadioStation(){
        Radio radio = new Radio();
        radio.prev();

        int excroted = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excroted,actual);
    }
@Test
    public void setCurrentRadioStation(){
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        int excepted = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted,actual);
    }

}
