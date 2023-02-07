package Test2;

class CrashCourseCertification extends RRTechnicalCertification {
	  CrashCourseCertification(String studentName, String courseName, int admissionTestMarks) {
	    super(studentName, courseName, admissionTestMarks);
	  }

	  void generateRegistrationId() {
	    registrationId = counter + 1;
	    counter += 2;
	  }

	 public double calculateFee() {
		  double serviceTax = 12.36;

	    double fee = CRASH_COURSE_FEE;
	    if (admissionTestMarks >= 90) {
	      fee = (int) (fee * 0.9);
	    } else if (admissionTestMarks >= 75) {
	      fee = (int) (fee * 0.95);
	    }
	    fee = (int) (fee * (1 + serviceTax / 100));
	    return fee;
	  }
	}
