public class Student {
	public static void main(String[]args) {
    private int studentId;
    private String name;
    private String mobileNo;
    private String address;
    private String course;

    // Constructor
    public Student(int studentId, String name, String mobileNo, String address, String course) {
        this.studentId = studentId;
        this.name = name;
        this.mobileNo = mobileNo;
        this.address = address;
        this.course = course;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Calculate fee method
    public double calculateFee() {
        // Base fee calculation logic
        double baseFee = 0.0;
        // Implement your logic here to calculate the base fee based on the course
        // You can use the course instance variable for the calculation

        return baseFee;
    }
}

// FastTrackBatchStudent class (child of Student)
class FastTrackBatchStudent extends Student {
    // Constructor
    public FastTrackBatchStudent(int studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    // Overridden calculateFee method
    @Override
    public double calculateFee() {
        // Add logic to calculate fee for FastTrackBatchStudent
        double fee = 0.0;
        // Implement your logic here

        return fee;
    }
}

// CorporateBatchStudent class (child of Student)
class CorporateBatchStudent extends Student {
    // Constructor
    public CorporateBatchStudent(int studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    // Overridden calculateFee method
    @Override
    public double calculateFee() {
        // Add logic to calculate fee for CorporateBatchStudent
        double fee = 0.0;
        // Implement your logic here

        return fee;
    }
}

// WeekendBatchStudent class (child of Student)
class WeekendBatchStudent extends Student {
    // Constructor
    public WeekendBatchStudent(int studentId, String name, String mobileNo, String address, String course) {
        super(studentId, name, mobileNo, address, course);
    }

    // Overridden calculateFee method
    @Override
    public double calculateFee() {
        // Add logic to calculate fee for WeekendBatchStudent
        double fee = 0.0;
        // Implement your logic here

        return fee;
    }
}

