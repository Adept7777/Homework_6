package homework6;
import java.util.HashMap;

/**
 * This class encapsulates a basic music library. It uses a HashMap to store albums. The 
 * key into the HashMap is a String, the name of the Album. The value is the Album object itself. 
 */
public class MusicLibrary
{
	private HashMap<String, Album> library;

	/**
	 * Constructor. Initialize the library HashMap.
	 */
	public MusicLibrary()
	{
		this.library = new HashMap<String, Album>();
	}

	/**
	 * Add an Album to the HashMap.
	 * @param a the Album to add
	 */
	public void addAlbum(Album a)
	{
		this.library.put(a.getName(), a);
	}

	/**
	 * Return an Album from the HashMap if it exists, or null otherwise. 
	 * @param albumName the name of the Album to return
	 * @return the Album or null if it is not in the library
	 */
	public Album getAlbum(String albumName)
	{
		return this.library.get(albumName);
	}

	/**
	 * Remove an Album from the HashMap.
	 * @param albumName the Album to remove
	 */
	public void removeAlbum(String albumName)
	{
		this.library.remove(albumName);
	}

	/**
	 * Return the size of the library.
	 * @return integer size of the library
	 */
	public int count()
	{
		return this.library.size();
	}
}
