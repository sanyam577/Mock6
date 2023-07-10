package in.ineuron;

class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}

public class Mock_3 {

	public static void main(String[] args) {
		Person p = new Person();

		// SETTING THE VALUE BY USING SETTER
		p.setName("sachin");
		p.setAge(42);
		p.setAddress("MI");

		String name = p.getName();
		int age = p.getAge();
		String address = p.getAddress();
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Address :"+ address);
		

	}
}
