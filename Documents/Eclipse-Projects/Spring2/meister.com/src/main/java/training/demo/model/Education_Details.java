package training.demo.model;

public class Education_Details 
{
	int education_details_id;
	String university;
	String passing_year;
	String education_detailscol;
	String resume_file;
	public int getEducation_details_id() {
		return education_details_id;
	}
	public void setEducation_details_id(int education_details_id) {
		this.education_details_id = education_details_id;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getPassing_year() {
		return passing_year;
	}
	public void setPassing_year(String passing_year) {
		this.passing_year = passing_year;
	}
	public String getEducation_detailscol() {
		return education_detailscol;
	}
	public void setEducation_detailscol(String education_detailscol) {
		this.education_detailscol = education_detailscol;
	}
	public String getResume_file() {
		return resume_file;
	}
	public void setResume_file(String resume_file) {
		this.resume_file = resume_file;
	}
	@Override
	public String toString() {
		return "Education_Details [education_details_id=" + education_details_id + ", university=" + university
				+ ", passing_year=" + passing_year + ", education_detailscol=" + education_detailscol + ", resume_file="
				+ resume_file + "]";
	}
	
	
}
