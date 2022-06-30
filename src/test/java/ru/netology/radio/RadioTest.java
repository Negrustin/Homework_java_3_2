package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//radio station tests
public class RadioTest {
    @Test
    public void getCurrentRadioStationNumber() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void nextRadioStationNumber() {
        Radio radio = new Radio();
        radio.nextRadioStationNumber();

        int excepted = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test

    public void nextRadioStationNumberBetweenBorders() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);
        radio.nextRadioStationNumber();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStationNumberAboveUpperLimit() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberAboveUpperLimit() {
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
    public void setCurrentRadioStationNumberLessLowerLimit() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int excepted = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    //Volume tests
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
    public void increaseVolumeAboveUpperLimit() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();

        int excepted = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void increaseVolumeLessLowerLimit() {
        Radio radio = new Radio();
        radio.decreaseVolume();

        int excepted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void decreaseVolumeBetweenBorders() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.decreaseVolume();

        int excepted = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }
    @Test
    public void setVolumeLessLowerBorder(){
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setVolumeMoreUpperLimit(){
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}
