/**
 * @author Mehmet Şerefoğlu
 *
 * @param <T>
 * @param <BUILD>
 */

package BuilderDesignPattern.builder;

public interface IBuilder<T,BUILD> {
	public T teamName(String teamName);
	public T teamType(String teamType);
	public T teamPlayerCount(int count);
	public T teamColors(String colors);
	public T getYear(int year);
	public BUILD buildTeam();
}
