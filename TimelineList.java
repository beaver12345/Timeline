public class TimelineList {

	// fields
	// also if call remove() you don't have to reset that value to 0
	private int size; // size is the size of the arraylist not the size of arr
	private Event[] arr;

	public TimelineList() {
		this.size = 0;
		this.arr = new Event[10];
	}
	
	// gets the index of the arr
	public Event get(int index) {
		if (index > size - 1)
			throw new IllegalArgumentException();

		return arr[index];
	}

	public void add(Event value, int index) {
		if (index > size || value == null)
			throw new IllegalArgumentException();
		size++;
		if (size >= arr.length)
			arr = enlarge();

		for (int i = size; i > index; i--) {
			arr[i] = arr[i-1];
		}

		arr[index] = value;
	}

	public void add(Event value) {
		add(value, size);
	}

	private Event[] enlarge() {
		Event[] array = new Event[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i];
		}

		return array;
	}

	public void set(int index, Event value) {
		if (index >= size || value == null)
			throw new IllegalArgumentException();
		arr[index] = value;
	}

	public void remove(int index) {
		if (index >= size || index < 0)
			throw new IllegalArgumentException();
		size--;
		for (int i = index; i < size; i++) {
			arr[i] = arr[i+1];
		}
	}
	
	public void removeID(int id) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i].getID() == id) {
				index = i;
			}
		}
		remove(index);
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	// sorting method on field arr
	public void sort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					Event temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// returns size of arr
	public int size() {
		return size;
	}
	
	public String toString() {
		String result = "[";
		if(this.size > 0) {
			result += arr[0];
		}
		for(int i = 1; i < this.size; i++) {
			result += ", " + this.arr[i];
		}
		return result + "]";
	}
}
