
public class Main {

	public static void main(String[] args) {

		//create university
		University Emanuel = new University("Emanule", "Oradea");
		
		//create faculties
		Faculty management = new Faculty("Management");
		Faculty art = new Faculty("Art");
		//add speciality to faculty
		management.addSpeciality("Management");
		management.addSpeciality("IT");

		//add speciality to faculty
		art.addSpeciality("Digital Art");
		art.addSpeciality("3D Art");
		art.addSpeciality("2D Art");
		
		//show information about speciality
		System.out.println(art.toString());

		//add faculty to university
		Emanuel.addFaculty(art);
		Emanuel.addFaculty(management);
		
		//remove faculty from university
		Emanuel.removeFaculty(management);

		//show information about university
		System.out.println(Emanuel.toString());
		
		//create university group 
		UniversityGroup groupA = new UniversityGroup("Group A");
		
		//add group to university, selecting faculty and speciality
		Emanuel.addGroup(groupA, art, "2D Art");
		
		//create students
		Student s1 = new Student("Nathan","Van Velden", 3535622);
		Student s2 = new Student("David","Van Velden", 23521321);
		
		//add students to university
		Emanuel.addStudent(s1);
		
		//add student to group
		groupA.addStudent(s1);
		groupA.addStudent(s2);
		
		//show students part of the group
		groupA.groupParticipants();
		
	}

}
