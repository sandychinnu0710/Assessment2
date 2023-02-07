package Test2;

class RegularCourseCertification extends RRTechnicalCertification {
	  int courseDuration;

	  RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
	    super(studentName, courseName, admissionTestMarks);
	    this.courseDuration = courseDuration;
	  }

	public  double calculateFee() {
	    double fee = courseDuration * REGULAR_COURSE_FEE;
	    if (admissionTestMarks >= 90) {
	      fee = (int) (fee * 0.9);
	    } else if (admissionTestMarks >= 75) {
	      fee = (int) (fee * 0.95);
	    }
	    return fee;
	  }
	}
