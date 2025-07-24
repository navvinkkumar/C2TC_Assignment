package Constructor;

public class Customer {
	private int cid;
	private String cname;
	private String city;
	public Customer()
	{
		System.out.println("Default constructor has been called");
	}
	public Customer(int cid, String cname, String city)
	
	{

		this("unknown","puducherry");
		this.cid=cid;
		this.cname=cname;
		this.city=city;
	}
	
	public Customer( String cname, String city)
	{

		this.cname=cname;
		this.city=city;
		System.out.println("parameterized constructor has been called");
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}
	
}

