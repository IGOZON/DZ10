public class Radio {

    private int maxRadio = 9;
    private int minRadio = 0;
    private int currentRadio = minRadio;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(){
        this.minRadio = minRadio;
        this.maxRadio = maxRadio;

    }
    public Radio(int quantityRadio) {
        maxRadio = quantityRadio + minRadio;

    }



    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > maxRadio) {
            newCurrentRadio = maxRadio;
        }
        if (newCurrentRadio < minRadio) {
            newCurrentRadio = minRadio;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        if (currentRadio != maxRadio) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = minRadio;
        }
    }

    public void prev() {
        if (currentRadio != minRadio) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = maxRadio;
        }
    }

    public void IncreaseVolime() {
        if (currentVolume != maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolime() {
        if (currentVolume != minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}











