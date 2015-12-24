import java.util.Date;

public class Event implements Comparable<Event> {
	private Date date;
	private String title;
	private int id;

	public Event(Date date, String title, int id) {
		this.date = date;
		this.title = title;
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public int getID() {
		return id;
	}

	public void setDate(Date date) {
		if (date == null)
			throw new IllegalArgumentException();

		this.date = date;
	}

	public void setTitle(String title) {
		if (title == null)
			throw new IllegalArgumentException();

		this.title = title;
	}
	
	public int compareTo(Event other) {
		return this.date.compareTo(other.date);
	}

	public String toString() {
		return "Date: " + this.date + "\nTitle: " + this.title + "\nID: " + id;
	}
}
