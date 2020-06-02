package ro.unitbv.ifelseproblem;

public class Customer {
	private String LastName;
	private String FirstName;
	private int age;
	private Adress adress;
	private PaymentMethod paymentMethod;
	public String getLastName() {
		return LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public int getAge() {
		return age;
	}
	public Adress getAdress() {
		return adress;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public Customer(String lastName, String firstName, int age)
	{
		LastName=lastName;
		FirstName=firstName;
		this.age=age;
		
	}
	public Customer(Adress adress1, PaymentMethod paymentmethod1)
	{
		adress=adress1;
		paymentMethod=paymentmethod1;
	}
	public String getCompleteName()
	{
		return FirstName+LastName;
	}

	

}
