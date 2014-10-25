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
		// YOUR CODE HERE
	}

	/**
	 * Add an Album to the HashMap.
	 * @param a the Album to add
	 */
	public void addAlbum(Album a)
	{
		// YOUR CODE HERE
	}

	/**
	 * Return an Album from the HashMap if it exists, or null otherwise. 
	 * @param albumName the name of the Album to return
	 * @return the Album or null if it is not in the library
	 */
	public Album getAlbum(String albumName)
	{
		// YOUR CODE HERE
	}

	/**
	 * Remove an Album from the HashMap.
	 * @param albumName the Album to remove
	 */
	public void removeAlbum(String albumName)
	{
		// YOUR CODE HERE
	}

	/**
	 * Return the size of the library.
	 * @return integer size of the library
	 */
	public int count()
	{
		// YOUR CODE HERE
	}
}
