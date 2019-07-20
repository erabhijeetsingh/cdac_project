package training.demo.model;

public class Project_Fresher
{
	int pf_id;
	String project_title;
	String project_desc;
	public int getPf_id() {
		return pf_id;
	}
	public void setPf_id(int pf_id) {
		this.pf_id = pf_id;
	}
	public String getProject_title() {
		return project_title;
	}
	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	@Override
	public String toString() {
		return "Project_Fresher [pf_id=" + pf_id + ", project_title=" + project_title + ", project_desc=" + project_desc
				+ "]";
	}
	
	
}
