public class Patient {
    private int IdNumber;
    private double caffeine;

    public Patient(int IdNumber, double caffeine){
        this.IdNumber = IdNumber;
        this.caffeine = caffeine;
    }

    public void setCaffeine(double caffeine){
        if (caffeine >= 0.0){
            this.caffeine = caffeine;
        }
    }

    public double getCaffeine(){
        return this.caffeine;
    }

    public int getIdNumber(){
        return this.IdNumber;
    }
}