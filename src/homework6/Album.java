package homework6;
import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * This class encapsulates an album of music. It stores the artist, and the name of the album, 
 * as well as a list of tracks.
 */
public class Album
{
	private String artist;
	private String name;
	private LinkedList<Track> tracks;

	/**
	 * Complete the constructor. Initialize the LinkedList.
	 * @param artist the album artist
	 * @param name the name of the album
	 */
	public Album(String artist, String name)
	{
		this.artist = artist;
		this.name = name;
		this.tracks = new LinkedList<Track>();
	}

	//Accessors and mutators.
	public String getArtist(){ return artist; }
	public String getName(){ return name; }
	public void setArtist(String artist){ this.artist = artist; }
	public void setName(String name){ this.name = name; }

	/**
	 * Create a new album by reading it from a file. Return it. Each data item will be on its own 
	 * line. The first line will hold the artist. The second line will hold the name of the album. 
	 * Each subsequent line will hold a track name.
	 * Example:
	 * Radiohead
	 * Kid A
	 * Everything in Its Right Place
	 * ...
	 * If an exception occurs, print "An exception has occurred. Unable to load the album in filename!"
	 * where filename is replaced with the actual filename.
	 * @param filename the path to the file from which to load album information
	 * @return the album created from the file
	 */
	public static Album fromFile(String filename)
	{
		Album temp = null;
		try (Scanner in = new Scanner(new File(filename)))
		{
			String artist = in.nextLine();
			String name = in.nextLine();
			temp = new Album(artist, name);
			while (in.hasNextLine())
			{
				Track tempTrack = new Track(artist, in.nextLine());
				temp.addTrack(tempTrack);
			}
		}
		catch (Exception e) //Only one response for any exception.
		{
			System.out.println("An exception has occured. Unable to load the album in " + filename + "!");
		}
		return temp;
	}

	/**
	 * Add a track to the LinkedList.
	 * @param t the track to add
	 */
	public void addTrack(Track t)
	{
		this.tracks.add(t);
	}

	/**
	 * Insert a track into the LinkedList at the position indicated by index.
	 * @param index where to insert
	 * @param t the track to insert
	 */
	public void addTrackAt(int index, Track t)
	{
		if (index <= this.tracks.size())
		{
			ListIterator<Track> iter = this.tracks.listIterator();
			for (int i = 0; i < index; i++) { iter.next(); }
			iter.add(t);
		}
	}

	/**
	 * Remove a track at a specific index.
	 * @param index the index at which to remove
	 */
	public void removeTrackAt(int index)
	{
		if (index <= this.tracks.size())
		{
			ListIterator<Track> iter = this.tracks.listIterator();
			for (int i = 0; i <= index; i++) { iter.next(); }
			iter.remove();
		}
	}

	/**
	 * Return the track at the given index.
	 * @param index the index at which to return
	 * @return the track at the index
	 */
	public Track getTrackAt(int index)
	{
		if (index <= this.tracks.size())
		{
			ListIterator<Track> iter = this.tracks.listIterator();
			for (int i = 0; i < index; i++) { iter.next(); }
			return iter.next();
		}
		else { return null; }
	}

	/**
	 * Print a numbered list of tracks. YOU MUST USE A ListIterator TO GET FULL CREDIT!
	 * Example output:
	 * 1. Sweet Tune
	 * 2. Great Track
	 * 3. Probably a cool song
	 */
	public void printTrackList()
	{
		ListIterator<Track> iter = this.tracks.listIterator();
		while (iter.hasNext())
		{
			System.out.println(iter.nextIndex() + 1 + ". " + iter.next().getName());
		}
	}
}
