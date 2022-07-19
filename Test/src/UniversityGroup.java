import java.util.ArrayList;
import java.util.List;

public class UniversityGroup {
	public String groupName;
	public Faculty faculty;
	public List<Student> Students = new ArrayList<>();
	
	public UniversityGroup(String groupName) {
		super();
		this.groupName = groupName;
	
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student s) {
		if (!Students.contains(s)) {
			Students.add(s);
		}
	}

	public void removeStudent(Student s) {
		Students.remove(s);
	}
	
	
	public void groupParticipants() {
		for (Student student : Students) {
			System.out.println(student.name);
		}
	}
	
	

	public List<Student> getStudents() {
		return Students;
	}


	public void setStudents(List<Student> students) {
		Students = students;
	}


	public Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
}
