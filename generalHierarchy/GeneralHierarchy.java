/**
 * @author mehmet_serefoglu
 *
 */

package generalHierarchy;

public class GeneralHierarchy {
	public static void main(String[] args) {
		//Yeni bir yönetici oluşturuyoruz
		Manager yonetici = new Manager("Mehmet");
		//Yeni bir çalışan oluştuyoruz.
		Employee calisan = new Employee("Ali");
		// Yöneticinin ekibine çalışanı ekliyoruz
		yonetici.addEmployee(calisan);
		
		
		System.out.println("Çalışanın Yöneticisi : " + calisan.manager.isim);
		System.out.println(yonetici.isim+" yöneticisinin ekip üyesi : " + yonetici.subEmployes.get(0).isim);
		
	}
}
