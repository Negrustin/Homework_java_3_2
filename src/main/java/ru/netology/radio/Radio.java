package ru.netology.radio;

import javax.xml.stream.XMLInputFactory;

public class Radio {
    private int minRadioStationNumber;
    private int radioCount = 10;
    private int maxRadioStationNumber = radioCount - 1;

    private int currentRadioStationNumber;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int radioCount) {
        if (radioCount <= minRadioStationNumber) {
            System.out.println("вы не можкете установить количество радиостанций  меньше 1, количество останется без изменений, равным: " + getRadioCount());
            return;
        }
        this.radioCount = radioCount;
        this.maxRadioStationNumber = radioCount - 1;
    }

    public int getRadioCount() {
        return radioCount;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {

        return this.currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > minRadioStationNumber) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }

    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber >= minRadioStationNumber && radioStationNumber <= maxRadioStationNumber) {
            this.currentRadioStationNumber = radioStationNumber;
        } else {
            return;
        }
    }

    int getCurrentVolume() {

        return this.currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            return;
        }
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= minVolume && currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        } else {
            return;
        }

    }


}
