import java.util.List;

public class Model {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	int sem;
	List<String> subjects;
	List<Integer> marks;
	public Model()
	{}
	public Model(int id,String name,List<String> subjects,List<Integer>marks)
	{
		this.id=id;
		this.name=name;
		this.subjects=subjects;
		this.marks=marks;
	}
}