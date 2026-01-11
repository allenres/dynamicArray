public class MyStringList implements StringList {
    private String[] stringArr;
    private int size;
    private int end;

    public MyStringList() {
        this.stringArr = new String[5];
        this.end = 0;
    }

    /**
     * Retrieves the string at the specified index in the list.
     *
     * @param index the index of the string to retrieve.
     * @return the string at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String get(int index) {
        if (index < 0 || index >= size()) { throw new IndexOutOfBoundsException("index is out of range"); }
        return stringArr[index];
    }

    /**
     * Replaces the string at the specified index with the given value.
     *
     * @param index the index of the string to replace.
     * @param value the new value to set at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public void set(int index, String value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index is out of range");
        }
        stringArr[index] = value;
    }

    /**
     * Adds a new string to the end of the list.
     *
     * @param value the string to add to the list.
     */
    public void add(String value) {
        stringArr[end] = value;
        end++;
        size++;
    }

    /**
     * Removes the string at the specified index from the list.
     *
     * @param index the index of the string to remove.
     * @return the string that was removed.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String remove(int index) {
        int toRemove = index;
        
        if (toRemove < 0 || toRemove >= size()) {
            throw new IndexOutOfBoundsException("index is out of range");
        }

        String wordRemoved = stringArr[toRemove];

        for (int i = toRemove; i < size - 1; i++) {
            stringArr[i] = stringArr[i + 1];
        }
        size--;

        return wordRemoved;
    }

    /**
     * Returns the number of strings currently in the list.
     *
     * @return the size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the current capacity of the list (i.e., the number of elements it can
     * hold before resizing).
     *
     * @return the capacity of the list.
     */
    public int capacity() {
        int capacity = stringArr.length;
        return capacity;
    }
}