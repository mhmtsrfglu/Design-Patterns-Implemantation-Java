package abstractionAndOccurence;

/**
 * @author mehmet_serefoglu
 *
 */
public class AbstractionAndOccurence {
	public static void main(String[] args) {
		
		Series serie = new Series();
		serie.name="Dark";
		serie.addEpisode(new Episodes("Bölüm 1",1));
		serie.addEpisode(new Episodes("Bölüm 2",2));
		
		System.out.println("Dizi Adı : "+serie.name);
		System.out.println("Bölüm : "+serie.episode.get(0).episode);
		System.out.println("Bölüm Numarası : "+serie.episode.get(0).episodeNumber);
	}
}
