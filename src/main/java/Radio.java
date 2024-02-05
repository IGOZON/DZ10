public class Radio {


    private int currentRadio;
    private int currentVolume;


    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio > 9) {
            return;
        }
        if (newCurrentRadio < 0) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        if (currentRadio != 9) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = 0;
        }
    }

    public void prev() {
        if (currentRadio != 0) {
            currentRadio = currentRadio - 1;
        } else {
            currentRadio = 9;
        }
    }

    public void IncreaseVolime() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolime() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        }
    }
}











