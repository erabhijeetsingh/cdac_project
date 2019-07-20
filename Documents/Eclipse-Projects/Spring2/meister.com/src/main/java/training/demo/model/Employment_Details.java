package training.demo.model;
import java.util.Date; 
public class Employment_Details
{
	int emp_id;
	String current_desg;
	String current_company;
	int annual_sal;
	Date working_since;
	Date working_till;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getCurrent_desg() {
		return current_desg;
	}
	public void setCurrent_desg(String current_desg) {
		this.current_desg = current_desg;
	}
	public String getCurrent_company() {
		return current_company;
	}
	public void setCurrent_company(String current_company) {
		this.current_company = current_company;
	}
	public int getAnnual_sal() {
		return annual_sal;
	}
	public void setAnnual_sal(int annual_sal) {
		this.annual_sal = annual_sal;
	}
	public Date getWorking_since() {
		return working_since;
	}
	public void setWorking_since(Date working_since) {
		this.working_since = working_since;
	}
	public Date getWorking_till() {
		return working_till;
	}
	public void setWorking_till(Date working_till) {
		this.working_till = working_till;
	}
	@Override
	public String toString() {
		return "Employment_Details [emp_id=" + emp_id + ", current_desg=" + current_desg + ", current_company="
				+ current_company + ", annual_sal=" + annual_sal + ", working_since=" + working_since
				+ ", working_till=" + working_till + "]";
	}
	
}
