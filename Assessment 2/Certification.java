package Test2;

interface Certification {
	  double REGULAR_COURSE_FEE = 2000;
	  double CRASH_COURSE_FEE = 5000;

	  double calculateFee();
	}

	class RRTechnicalCertification implements Certification {
	  String studentName;
	  String courseName;
	  int registrationId;
	  int admissionTestMarks;
	  int counter;

	  RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks) {
	    this.studentName = studentName;
	    this.courseName = courseName;
	    this.admissionTestMarks = admissionTestMarks;
	    this.counter = 1001;
	    generateRegistrationId();
	  }

	  void generateRegistrationId() {
	    registrationId = counter;
	    counter += 2;
	  }

	  public double calculateFee() {
	    return 0;
	  }
	}

