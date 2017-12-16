// Person: has a final id and a name (with setter/getter)
public abstract class Person {
	
public final String id;
public final String name;

public Person(String id , String name) {
	this.id = id;
	this.name = name;
}

public String getId() {
	return id;
}

public String getName() {
	return name;
}

}
