public class ExtendedTime extends SimpleTime{
    private boolean is24Hours;

    public boolean isIs24Hours() {
        return is24Hours;
    }

    public void setIs24Hours(boolean is24Hours) {
        this.is24Hours = is24Hours;
    }

    public ExtendedTime() {
        super();
    }

    public ExtendedTime(int hour, int minute, int second, boolean is24Hours) {
        super(hour, minute, second);
        this.is24Hours = is24Hours;
    }

    @Override
    public String toString() {
        if (!is24Hours){
            String h =
                    this.getHour()>12?
                    this.getHour()-12<10?
                    "0"+(this.getHour()-12):
                    this.getHour()-12+"":
                    this.getHour()<10?
                    "0"+this.getHour():
                    this.getHour()+"";
            String m = this.getMinute()<10? "0"+this.getMinute(): this.getMinute()+"";
            String s = this.getSecond()<10? "0"+this.getSecond(): this.getSecond()+"";

            return h + " : " + m + " : " + s ;
        }
        return super.toString();
    }
}
