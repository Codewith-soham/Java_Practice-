class Hospital{
    String HospitalName;
    long phoneNo;
    Hospital(String HospitalName, long phoneNo){
        this.HospitalName = HospitalName;
        this.phoneNo = phoneNo;
    }

    void display(){
        System.out.println("Hospital Name is: " + HospitalName + " Contact Number is " + phoneNo);
    }
}

class Patient extends Hospital{
    String PatientName;
    int age;
    Patient(String HospitalName, long phoneNo, String PatientName, int age){
        super(HospitalName , phoneNo);
        this.PatientName = PatientName;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("HospitalName: " + HospitalName + " PatientName: " + PatientName + " Patient age: " + age);
    }
}


public class ThisndSuper {
    public static void main(String[] args) {
        Patient p = new Patient("Lilavati" , 112 , "Soham" , 19);
        p.display();
    }
}