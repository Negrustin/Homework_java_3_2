public class Radio {
    int currentRadioStationNumber;
    int currentVolume;

    public int getCurrentRadioStationNumber() {

        return this.currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }

    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber >= 0 && radioStationNumber <= 9) {
            this.currentRadioStationNumber = radioStationNumber;
        } else {
            return;
        }
    }

    int getCurrentVolume() {
        return this.currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            return;
        }
    }

    public void setVolume(int currentVolume) {

            this.currentVolume = currentVolume;

    }


}
