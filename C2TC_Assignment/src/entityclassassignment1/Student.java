package entityclassassignment1;

	public class Student {
	    public String name;
	    public int age;
	    public String department;

	    public Student(String name, int age, String department) {
	        this.name = name;
	        this.age = age;
	        this.department = department;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
	    }
	}


