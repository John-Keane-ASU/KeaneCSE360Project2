package cse360assign2;

/** 
* This object class contains an array of up to 10 integers and contains methods to adding, removing, and searching for integers to the list
* along with returning it in a String format
*/	
public class SimpleList {
	int[] list; //Main array of 10 integers
	int count = 0; //Number of non 0 integers in the list 
	SimpleList() { //Constructor; Initializes the count to 0 and an array of 10 integers
		count = 0; //There will be 0 non-0 numbers in the list at the start
		list = new int[10]; 
		for(int i = 0; i < 10; i++) {
			list[i] = 0; //Initializing everything into the list as 0
		}
	}
	/**
	* Adds an int to the list at the front and moves everything over by one
	* If there are 10 elements in the list, the 10th will "fall off" when the new one is added
	* newInt: the int to be added to the array
	*/	
	public void add(int newInt) {
		if(count != 10)
			count++; //Increases count if there are less than 10 entries in the list, if there is 10, it does not need to increase
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
		if(index != -1) { //The parameter is the index of the element that will be removed
			for(int i = index; i < count - 1; i++) {
					list[i] = list[i+1];
			}
			if(index == count - 1)
				list[index] = 0;
		}
		list[9] = 0;
		count--;
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
}
