import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// change radio station tests
public class RadioTest {
    @Test
    public void getCurrentRadioStation() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void nextRadioStationNumberStart() {
        Radio radio = new Radio();
        radio.nextRadioStationNumber();

        int excepted = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test

    public void nextRadioStationNumberBetween() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.nextRadioStationNumber();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStationNumberEnd() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberOutOfRange() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.setRadioStationNumber(10);

        int excepted = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }


    @Test
    public void prevRadioStationStart() {
        Radio radio = new Radio();
        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBetween() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(6);
        radio.prevRadioStationNumber();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        int excepted = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void setCurrentRadioStationTest() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int excepted = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    //change Volume tests
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();

        int excepted = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int excepted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();

        int excepted = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void increaseVolumeMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        radio.decreaseVolume();


        int excepted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void increaseVolumeLessBetween() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.decreaseVolume();

        int excepted = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }
}
