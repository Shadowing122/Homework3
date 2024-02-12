public class PatientTester {
    public static void main(String[] args) {
        PatientManager manger = new PatientManager();
        System.out.println(manger);
        for (int i = 1; i<5; i++){
            manger.addPatient(new Patient(i,i*200));
        }
        System.out.println(manger);
        manger.caffeineAbsorption();
        manger.caffeineAbsorption();
        System.out.println(manger);
        manger.removePatient(manger.getMostCaffeinatedIndex());
        System.out.println(manger);
    }
}
