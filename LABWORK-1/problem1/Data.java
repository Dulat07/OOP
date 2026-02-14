package problem1;

public class Data{
    private double sum;
    private double max;
    private int cnt;

    public Data(){
        this.sum = 0;
        this.max = Double.NEGATIVE_INFINITY;
        this.cnt = 0;
    }

    public void add(double a){
        if (this.max < a){
            this.max = a;
        }
        sum += a;
        cnt++;
    }

    public double get_avg(){
        if (cnt == 0){
            return 0;
        }
        return sum / cnt;
    }

    public double get_max(){
        if (cnt == 0){
            return 0;
        }
        return max;
    }

}
