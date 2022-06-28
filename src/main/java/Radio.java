public class Radio {
    int currentRadioStationNumber;
    int currentVolume;

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        }else{
            currentRadioStationNumber = 0;
        }
    }
    public void prev(){
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        }else{
            currentRadioStationNumber = 9;
        }

    }
public void setRadioStationNumber (int radioStationNumber){
        if (radioStationNumber >= 0 && radioStationNumber <= 9){
            this.currentRadioStationNumber = radioStationNumber;
        }else{
            return;
        }



}
}
