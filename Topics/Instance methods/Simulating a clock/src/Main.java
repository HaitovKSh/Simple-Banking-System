class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes < 58) {
            this.minutes++;
        } else {
            this.minutes = 0;
            this.hours++;
            if (this.hours == 13) {
                this.hours = 1;
            }
        }
    }
}