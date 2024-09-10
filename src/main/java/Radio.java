public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStantion = 0;

    public Radio() {
        this.maxStation = 9;


    }

    public Radio (int stationsCount) {
        this.maxStation = stationsCount - 1;

    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        }
        currentStation = minStantion;

    }

    public void prev() {
        if (currentStation != minStantion) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void plus() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }

    }

    public void minus() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;

        }
    }



    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStantion) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStantion() {
        return minStantion;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;

    }

}