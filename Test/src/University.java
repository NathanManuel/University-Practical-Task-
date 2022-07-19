import java.util.ArrayList;
import java.util.List;

public class University {
	public String universityName;
	public String universityAdress;
	public List<Faculty> Faculties = new ArrayList<>();
	public List<UniversityGroup> Groups = new ArrayList<>();
	public List<Student> Students = new ArrayList<>();
	
	public University(String universityName, String universityAdress, List<Faculty> facutlies) {
		super();
		this.universityName = universityName;
		this.universityAdress = universityAdress;
		this.Faculties = facutlies;
	}
	
	public University(String universityName, String universityAdress) {
		super();
		this.universityName = universityName;
		this.universityAdress = universityAdress;

	}
	
	
	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityAdress() {
		return universityAdress;
	}

	public void setUniversityAdress(String universityAdress) {
		this.universityAdress = universityAdress;
	}

	public List<Faculty> getFaculties() {
		return Faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		Faculties = faculties;
	}

	public List<Faculty> getFacutlies() {
		return Faculties;
	}
	public void setFacutlies(List<Faculty> facutlies) {
		Faculties = facutlies;
	}

	public void addFaculty(Faculty f) {
		if (!Faculties.contains(f)) {
			Faculties.add(f);
		}
	}
	
	public void removeFaculty(Faculty f) {
			Faculties.remove(f);
	}
	
	public void getFacultiesList() {
		for (int i=0; i<Faculties.size(); i++) {	
			Faculty faculty = Faculties.get(i);
			System.out.println(faculty.getFacultyName());
		}
	}
	
	public void removeGroup(UniversityGroup g) {
		Groups.remove(g);
	}
	
	public void addGroup(UniversityGroup g,Faculty faculty,  String speciality) {
		if (!Groups.contains(g) && Faculties.contains(faculty)) {
			Faculty fac = Faculties.get(Faculties.indexOf(faculty));
			if(fac.Specialities.contains(speciality))
			Groups.add(g);
		}
	}

	public void removeStudent(Student s) {
		Students.remove(s);
	}
	
	public void addStudent(Student s) {
		if (!Students.contains(s)) {
			Students.add(s);
		}
	}
	
	public void getGroupList() {
		for (int i=0; i<Groups.size(); i++) {	
			UniversityGroup group = Groups.get(i);
			System.out.println(group.getGroupName());
		}
	}
	
	@Override
	public String toString() {
	String text =  "University: " + universityName + "\nUniversity adress: " + universityAdress
				+ "\nFaculties: \n";
	String faculties = "";
	for(int i = 0; i<Faculties.size(); i++) {
		faculties += Faculties.get(i).facultyName +  "\n" ;
	}
				return text + faculties;
	}
	

	
	
}
