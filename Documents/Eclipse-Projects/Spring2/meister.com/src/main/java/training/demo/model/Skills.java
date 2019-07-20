package training.demo.model;

public class Skills {
	int sk_id;
	String skills;
	public int getSk_id() {
		return sk_id;
	}
	public void setSk_id(int sk_id) {
		this.sk_id = sk_id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Skills [sk_id=" + sk_id + ", skills=" + skills + "]";
	} 
	
	
	
}
