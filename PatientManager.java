public class PatientManager {
    private Patient[] patients = new Patient[10];

    public PatientManager(){} // I feel like this is usless but its here beacuse I need

    public int addPatient(Patient patient){
        int index = -1;
        for (int i = 0; i<this.patients.length; i++){
            if (patients[i] == null){
                index = i;
                patients[i] = patient;
                break;
            }
        }
        return index;
    }

    public Patient removePatient(int index){
        Patient patient = patients[index];
        patients[index] = null;
        return patient;
    }

    public void caffeineAbsorption(){
        for (int i = 0; i<this.patients.length; i++){
            if (patients[i] != null){
                double caffeine = patients[i].getCaffeine();
                if (caffeine - 130 > 0){
                    patients[i].setCaffeine(caffeine - 130);
                } else {
                    patients[i] = null;
                }
            }
        }
    }

    public int getMostCaffeinatedIndex(){
        double caffeine = 0.0;
        int index = -1;
        for (int i = 0; i<this.patients.length; i++){
            if (patients[i] != null){
                if (patients[i].getCaffeine() > caffeine){
                    index = i;
                }
            }
        }
        return index;
    }

    public String toString(){
        String output = "";
        boolean empty = true;
        for (int i = 0; i<this.patients.length; i++){
            if (patients[i] != null){
                empty = false;
                break;
            }
        }
        if (empty){
            return "Empty \n";
        } else {
            for (int i = 0; i<this.patients.length; i++){
                if (patients[i] != null){
                    output += patients[i].getIdNumber() + " ";
                    output += patients[i].getCaffeine() +" \n";
                }
            }
        }
        return output;
        }

}


