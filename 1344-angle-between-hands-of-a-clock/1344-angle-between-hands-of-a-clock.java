class Solution {
    public double angleClock(int hour, int minutes) {
        double min = minutes*6;
        double hr = (hour%12)*30+0.5*minutes;
        double result = Math.abs(hr-min);
        return Math.min(360-result,result);
    }
}