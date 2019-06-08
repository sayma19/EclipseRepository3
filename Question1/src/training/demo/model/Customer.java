package training.demo.model;
/**
 * customer class
 * @author iet18
 *
 */
public class Customer 
{
	/**
	 * attributes
	 */
	private int custno;
	private String bpack;
	private String opack;
	/**
	 * default constructor
	 */
	public Customer() {
		super();
	}
	/**
	 * parameterised constructor
	 * @param custno
	 * @param bpack
	 * @param opack
	 */
	public Customer(int custno, String bpack, String opack) {
		super();
		this.custno = custno;
		this.bpack = bpack;
		this.opack = opack;
	}
	/**
	 * getter-setter
	 * @return
	 */
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getBpack() {
		return bpack;
	}
	public void setBpack(String bpack) {
		this.bpack = bpack;
	}
	public String getOpack() {
		return opack;
	}
	public void setOpack(String opack) {
		this.opack = opack;
	}
	/**
	 * to string 
	 */
	@Override
	public String toString() {
		return "Customer [custno=" + custno + ", bpack=" + bpack + ", opack=" + opack + "]";
	}
	
}
