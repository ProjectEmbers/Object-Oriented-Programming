package p3;

public class Student {
	private String name;
	private double gpa;
	
	public Student(String name, double gpa)
	{
		super();
		this.name = name;
		if(gpa < 0.0 || gpa > 4.0)
		{
			throw new IllegalArgumentException("Wrong Gpa");
		}
		this.gpa = gpa;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getGpa() 
	{
		return gpa;
	}

	public void setGpa(double gpa)
	{
		
	}

	@Override
	public String toString() 
	{
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	
	
	
}
