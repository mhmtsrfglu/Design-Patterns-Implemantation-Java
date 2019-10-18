/**
 * @author mehmet_serefoglu
 *
 */

package generalHierarchy;

import java.util.ArrayList;

public class Manager extends Employee{
	// Her yönetici bir çalışandır ve altında çalışan elemanları vardır. Bunları arraylistte tutuyoruz
	ArrayList<Employee> subEmployes = new ArrayList<Employee>();

	
	public Manager(String name) {
		//extend ettiğimiz classın constructor'unu çağırıyoruz
		super(name);
	}
	public void addEmployee(Employee e) {
		//çalışanı ekliyoruz
		subEmployes.add(e);
		//çalışanın yöneticisini bu sınıf olarak atıyoruz.
		e.manager=this;
	}
}
