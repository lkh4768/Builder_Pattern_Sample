
public class Employee {
	private String id;
	private String name;
	private int age = 0;
	private String phoneNum = null;

	public static class Builder {
		private String id;
		private String name;
		private int age = 0;
		private String phoneNum = null;

		public Builder(String id, String name) {
			try {
				if (id == null || name == null)
					throw new NullPointerException("id or name can't null : ");
				if (id.equals("") || name.equals(""))
					throw new Exception("id or name can't empty : ");
				this.id = id;
				this.name = name;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder phoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

	private Employee(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.age = builder.age;
		this.phoneNum = builder.phoneNum;
	}

	public String toString() {
		String str = "id : " + this.id + "\nname : " + this.name;
		if (this.age != 0)
			str += "\nage : " + this.age;
		if (!this.phoneNum.equals("") || this.phoneNum != null)
			str += "\nphoneNum : " + this.phoneNum;
		return str;
	}
}
