package abstractionAndOccurence;

import java.util.ArrayList;
//Bu desende sadece bir dizi var ve o dizinin bir çok bölümü var. Her bölüm için yeniden dizi oluşturmak yerine ona yeni bölümler ekliyoruz.
public class Series {
	String name;
	String organizator;
	//bölümleri tuttuğumuz arrayList yapısı
	ArrayList<Episodes> episode = new ArrayList<Episodes>();
	
	//Yeni bir bölüm var ise direk bu fonksiyon ile ekliyebiliyoruz.
	public void addEpisode(Episodes ep) {
		episode.add(ep);
	}
	
}
