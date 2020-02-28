package cse360assign2;

/**
* John Keane
* CSE360
* Project 2
* 02/27/2020
* This object class contains an array of up to 10 integers and contains methods to adding, removing, and searching for integers to the list
* along with returning it in a String format
*/	
public class SimpleList {
	int[] list; //Main array of 10 integers
	int count = 0; //Number of non 0 integers in the list
	int maxListSize = 10; //Max number of ints that can be added to the list
	SimpleList() { //Constructor; Initializes the count to 0 and an array of 10 integers
		count = 0; //There will be 0 non-0 numbers in the list at the start
		list = new int[10]; 
		for(int i = 0; i < maxListSize; i++) {
			list[i] = -1; //Initializing everything into the list as -1
		}
	}
	/**
	* Adds an int to the list at the front and moves everything over by one
	* If there are 10 elements in the list, the 10th will "fall off" when the new one is added
	* newInt: the int to be added to the array
	*/	
	public void add(int newInt) {
		if(count == maxListSize) { //If the list is full, it is expanded by 50%
			maxListSize = maxListSize + (int)(maxListSize*0.5);
			changeListSize(maxListSize);
		}
		count++;
		for(int i = count - 1; i > 0; i--) {
			list[i] = list[i - 1];
		}
		list[0] = newInt;
	}
	/**
	* Removes a number from the list and moves the following elements in the list over to fill the space
	* index: The index of the int to be removed
	*/	
	void remove(int index) {
		if(index >= 0 && index <= maxListSize) { //The parameter is the index of the element that will be removed
			for(int i = index; i < count - 1; i++) {
					list[i] = list[i+1];
			}
			if(index == count - 1)
				list[index] = 0;
			list[9] = 0;
			count--;
			
			if(count < (maxListSize - (int)(maxListSize*0.25)) && maxListSize > 1) { //If more than 20% of the array is empty, the smax size is decreased
				maxListSize--;
				changeListSize(maxListSize);
			}
		}
		
	}
	/**
	* Returns the number of elements in the list
	*/	
	int count() { 
		return count;
	}
	/**
	* Returns a string of all the elements in the list up to index = count - 1 separated by a space 
	*/	
	public String toString() {
		String arry = ""; //Initializing a string that will have the elements of the array concatenated to it
		for(int i = 0; i < count; i++) {
			arry = arry + list[i];
			if(i < count - 1)
				arry = arry + " ";
		}
		return arry;
	}
	/**
	* Returns the index of the integer entered in the parameter if it is in the list
	* If it does not exist, a -1 is returned
	* search: The int being looked for
	*/	
	int search(int search) { 
		int index = -1; 
		for(int i = 0; i < count; i++) {
			if(list[i] == search)
				index = i;
		}
		return index;
	}
	/**
	* Reinitalizes the list variable with a new size while copying over
	* all of the integers currently in the list
	* newSize: The new size of the list
	*/	
	void changeListSize(int newSize) {
		int[] tempList = new int[newSize];
		for(int i = 0; i < newSize; i++) {
			tempList[i] = -1; //Making a temp list of the new size and initializing everything to -1
		}
		for(int i = 0; i < count; i++) {
			tempList[i] = list[i]; //Copying the list items into temp
		}
		list = new int[newSize]; //Making a new blank list
		for(int i = 0; i < newSize; i++) {
			list[i] = tempList[i]; //Filling up the new list with temp
		}
	}
	/**
	* Adds an int to the end of the array. If the array is full, the size is increased by 50%
	* newInt: The int to be added to the list
	*/	
	void append(int newInt) {
		if(count == maxListSize) { //If the list is full, it is expanded by 50%
			maxListSize = maxListSize + (int)(maxListSize*0.5);
			changeListSize(maxListSize);
		}
		list[count] = newInt;
		count++;
	}
	/**
	 * Returns the first int in the array
	 * If there are no elements in the array, -1 is returned
	*/	
	int first() {
		int firstInt = 0;
		if(count == 0)
			firstInt = -1;
		else
			firstInt = list[0];
		return firstInt;
	}
	/**
	 * Returns the last int in the array
	 * If there are no elements in the array, -1 is returned
	*/	
	int last() {
		int lastInt = 0;
		if(count == 0)
			lastInt = -1;
		else
			lastInt = list[count - 1];
		return lastInt;
	}
	/**
	 * Returns the total amount of space in the array
	*/	
	int size() {
		return maxListSize;
	}
}