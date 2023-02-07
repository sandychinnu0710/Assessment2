package Test2;

public class CourseRegistration
{
   String studentName;
   int registrationId;
   float qualifyingMarks;
   double courseFee;
   int courseId;
   boolean hostelRequired;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getRegistrationId() {
	return registrationId;
}
public void setRegistrationId(int registrationId) {
	this.registrationId = registrationId;
}
public float getQualifyingMarks() {
	return qualifyingMarks;
}
public void setQualifyingMarks(float qualifyingMarks) {
	this.qualifyingMarks = qualifyingMarks;
}
public double getCourseFee() {
	return courseFee;
}
public void setCourseFee(double courseFee) {
	this.courseFee = courseFee;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public boolean isHostelRequired() {
	return hostelRequired;
}
public void setHostelRequired(boolean hostelRequired) {
	this.hostelRequired = hostelRequired;
}
   
public boolean validateCourseId()
{
	if(courseId>=1001 && courseId<=1005)
	{
		return true;
	}
	return false;
}
public void calculateFee()
{
	double discount = 0;
	

if(courseId>=1001 && courseId>=1005)
{
	
	if(courseId==1001)
	{
		courseFee=55000;
	}
	else if(courseId==1002)
	{
		courseFee=35675;
	}
	else if(courseId==1003)
	{
		courseFee=28300;
	}
	else if(courseId==1004)
	{
		courseFee=22350;
	}
	else if(courseId==1005)
	{
		courseFee=115000;
	}
	
}
else
{
	System.out.println("Invalid COurse ID.Please Try Again");
}

	if(qualifyingMarks>=65 && qualifyingMarks<=69)
	{
		discount=courseFee*5/100;
	}
	else if(qualifyingMarks>=70 && qualifyingMarks<=84)
	{
		discount=courseFee*10/100;
	}
	else if(qualifyingMarks>=85)
	{
		discount=courseFee*15/100;
	}
	else
	{
		System.out.println("Marks is less than 65, so you are not eligible");
	}
	courseFee=courseFee-discount;
	System.out.println("Course Allocation Details");
	System.out.println("Student Name            :"+studentName);
	System.out.println("Course Id               :"+courseId);
	System.out.println("Qualifying Exam Marks   :"+qualifyingMarks);
	System.out.println("Registration Id         :"+registrationId);
	System.out.println("Total Course Fee        :"+courseFee);
	System.out.println("Hostel Required         :"+hostelRequired);
	
	public static void main(String[] args) {
	CourseRegistration c=new CourseRegistration();
	c.calculateFee();
}



