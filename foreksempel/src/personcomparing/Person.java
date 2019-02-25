package personcomparing;



//interface 
import java.util.*; 

class Person implements Comparable<Person> { 
	String fornavn; 
	String etternavn;
	int alder; 

	public int getAlder() {
		return alder;
	}

	public String getName() {
		return etternavn + " " + fornavn;
	}

	// Constructor 
	public Person(String fornavn, String etternavn, int alder) 
	{ 
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.alder = alder; 
	} 

	public String toString() 
	{ 
		return this.fornavn + " " + this.etternavn + "\t"+ this.alder; 
	}

	@Override
	// Standard sortering er etter navn
	public int compareTo(Person o) {
		// Kod
	} 


	public static void main (String[] args) 
	{ 
		ArrayList<Person> personer = new ArrayList<Person>(); 
		personer.add(new Person("Jens", "Hansen", 12)); 
		personer.add(new Person("Ida", "Hansen", 33)); 
		personer.add(new Person("Småen", "Sund", 3)); 

		System.out.println("Usortert");
		for (Person person : personer) {
			System.out.println(person);
		}

		// Standard sammenlikner er implementert med "implements Comparable"
		Collections.sort(personer); 
		System.out.println("\nSortert etter navn"); 
		for (Person person : personer) {
			System.out.println(person);
		}

		System.out.println("\nSortert etter alder"); 
		// Her bruker vi en annen comparator enn den vanlige
		Collections.sort(personer, new ComparatorAge()); 
		for (Person person : personer) {
			System.out.println(person);
		}


	}
} 

