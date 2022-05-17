public class DigitalWatch {
    int year = 2000, month = 01, day = 01;
    int hour = 00, min = 00, sec = 00; // 24-hour format
    String state = "hr";
    public void changeDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void changeTime(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    public void Increment(){
        switch (state){
            case "hr":
                if(hour < 23) hour++;
                else hour = 00;
                break;
            case "min":
                if (min < 59) min++;
                else min = 00;
                break;
            case "yr":
                if (year < 2099) year++;
                else year = 2000;
                break;
            case "month":
                if (month < 12) month++;
                else month = 01;
                break;
            case "day":
                if (day < 31) day++;
                else day = 01;
                break;

        }
    }
    public void changeState(){
        switch (state){
            case "hr":
                state = "min";
                break;
            case "min":
                state = "yr";
                break;
            case "yr":
                state = "month";
                break;
            case "month":
                state = "day";
                break;
            case "day":
                state = "hr";
                break;
        }

    }

}
