/**
 * @author mehmet_serefoglu
 *
 */
package generalHierarchy;

public class Employee {
	//çalışanların bir yöneticisi vardır.
	String isim;
	Employee manager;
	
	public Employee() {}
	
	public Employee(String name) {
		this.isim = name;
	}
}
