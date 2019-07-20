package training.demo.model;


public class Personal_Details
{
	int pid;
	String f_name;
	String l_name;
	String mob_no;
	String gender;
	String addr;
	String city;
	String state;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Personal_Details [pid=" + pid + ", f_name=" + f_name + ", l_name=" + l_name + ", mob_no=" + mob_no
				+ ", gender=" + gender + ", addr=" + addr + ", city=" + city + ", state=" + state + "]";
	}
	
}
