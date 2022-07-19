import java.util.ArrayList;
import java.util.List;

public class Faculty {

	public String facultyName;
	public List<String> Specialities = new ArrayList<>();

	
	public Faculty(String facultyName, List<String> specialities) {
		super();
		this.facultyName = facultyName;
		this.Specialities = specialities;
	}
	
	
	public Faculty(String facultyName) {
		super();
		this.facultyName = facultyName;
		
	}
	

	public void addSpeciality(String s) {
		if (!Specialities.contains(s)) {
			Specialities.add(s);
		}
	}
	
	public void removeSpeciality(String s) {
		Specialities.remove(s);
	}
	
	
	public void SList() {
		System.out.println(Specialities.size());
	}
	
	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<String> getSpecialities() {
		return Specialities;
	}
	
	public void setSpecialities(List<String> specialities) {
		Specialities = specialities;
	}
	

	@Override
	public String toString() {
	String text =  "Faculty: " + facultyName + "\nSpecialities: \n";
	String specialities = "";
	for(int i = 0; i<Specialities.size(); i++) {
		specialities += Specialities.get(i) +  "\n" ;
	}
				return text + specialities;
	}
	
	
}
