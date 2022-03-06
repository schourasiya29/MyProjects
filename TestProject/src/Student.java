import java.util.HashSet;
import java.util.Set;

public class Student {

	private int sid;
	private String sname;

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "abc");
		Student s2 = new Student(1, "abc");

		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);

		System.out.println(set);
	}

}
