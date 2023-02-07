package Test2;

  class CourseCertificationTester
{
	  public static void main(String[] args) {
	    RegularCourseCertification regularCourse = new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
	    System.out.println("Student Name: " + regularCourse.studentName);
	    System.out.println("Course Name: " + regularCourse.courseName);
	    System.out.println("Registration Id: " + regularCourse.registrationId);
	    System.out.println("Admission Test Marks: " + regularCourse.admissionTestMarks);
	    System.out.println("Course Duration: " + regularCourse.courseDuration + " months");
	    System.out.println("Total Fee: " + regularCourse.calculateFee());
	  }
	}