package bank;

public class Persona {
	
	private String age;
	private String job;
	private String marital;
	private String education;
	private String defaultt;
	private String balance;
	private String housing;
	private String loan;
	private String contact;
	private String day;
	private String month;
	private String duration;
	private String campaign;
	private String pdays;
	private String previous;
	private String poutcome;
	private String y;
	
	public Persona(String age, String job, String marital, String education, String defaultt, String balance,
			String housing, String loan, String contact, String day, String month, String duration, String campaign,
			String pdays, String previous, String poutcome, String y) {
		super();
		this.age = age;
		this.job = job;
		this.marital = marital;
		this.education = education;
		this.defaultt = defaultt;
		this.balance = balance;
		this.housing = housing;
		this.loan = loan;
		this.contact = contact;
		this.day = day;
		this.month = month;
		this.duration = duration;
		this.campaign = campaign;
		this.pdays = pdays;
		this.previous = previous;
		this.poutcome = poutcome;
		this.y = y;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getDefaultt() {
		return defaultt;
	}
	public void setDefaultt(String defaultt) {
		this.defaultt = defaultt;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getHousing() {
		return housing;
	}
	public void setHousing(String housing) {
		this.housing = housing;
	}
	public String getLoan() {
		return loan;
	}
	public void setLoan(String loan) {
		this.loan = loan;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getPdays() {
		return pdays;
	}
	public void setPdays(String pdays) {
		this.pdays = pdays;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public String getPoutcome() {
		return poutcome;
	}
	public void setPoutcome(String poutcome) {
		this.poutcome = poutcome;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Persona [age=" + age + ", job=" + job + ", marital=" + marital + ", education=" + education
				+ ", defaultt=" + defaultt + ", balance=" + balance + ", housing=" + housing + ", loan=" + loan
				+ ", contact=" + contact + ", day=" + day + ", month=" + month + ", duration=" + duration
				+ ", campaign=" + campaign + ", pdays=" + pdays + ", previous=" + previous + ", poutcome=" + poutcome
				+ ", y=" + y + "]";
	}
	
	
}