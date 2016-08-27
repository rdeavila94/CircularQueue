package AssignmentSix;
/**
 * This assignment will have us create a circular queue out of an
 * integer array.
 * @author Richard DeAvila 010668448
 *
 */

public class CircularQueue {

	/**
	 * Will create an empty circular queue
	 * @param SIZE the maximum capacity of the created circular queue
	 */
	public CircularQueue(int SIZE)
	{
		CircularQueue = new int [SIZE];
		mFront = 0;
		mRear = 0;
	}
	
	/**
	 * Will print out the contents of the circular queue
	 * @param text Sends to system.out.println:
	 */
	public void enumerate (String text)
	{
		System.out.println(text + " queue contents:");
		System.out.println("Front: " + mFront + ", Rear = " + mRear + ", Count = " + mCount + ", Size = " + CircularQueue.length);
		if (mCount > 0)
		{
			int printFromFront = mFront;
			int i;
			for (i = 0; i < mCount; i++)
			{	
				System.out.print(CircularQueue[printFromFront] + " ");
				printFromFront += 1;
			}
		System.out.println();
		}
	}
	
	/**
	 * Will check whether the circular queue is empty or not
	 * @return true if the circular queue is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		if (mCount == 0)
			return true;
		else
			return false;
	}
	 
	/**
	 * Will add an integer to the rear of the circular queue, if there is space for it.
	 * @param number integer to be added to the rear of the circular queue
	 */
	public void add(int number)
	{
		if (mCount == CircularQueue.length)
		{
			System.out.println("Queue is full. May not add item " + (CircularQueue.length + 1));
		}
		else 
		{
			CircularQueue [mRear] = number;
			mRear += 1;
			if (mRear >= CircularQueue.length)
				mRear = 0;
			mCount += 1;
			
		}
		
	}
	
	/**
	 * Will remove the element at the front of the circular queue, if it is not empty.
	 */
	public void remove ()
	{
		if (mCount == 0)
		{
			System.out.println("Circular queue is empty");
		}
		else 
		{
			CircularQueue [mFront] = 0;
			mFront += 1;
			if (mFront >= CircularQueue.length)
				mFront = 0;
			mCount -= 1;
		}
	}
	
	/**
	 * Will return the element at the front of the circular queue, if such an element exists.
	 * @return the element at the front of the circular queue, or blank if circular queue is empty.
	 */
	public String peekFront ()
	{
		if (isEmpty() == true)
		{
			System.out.println("Queue is empty. May not peek front");
			return "";
		}
		else
		{	
			return Integer.toString(CircularQueue[mFront]);
		}
	}

	
	/**
	 * Will return the element at the rear of the circular queue, if such an element exists.
	 * @return the element at the rear of the circular queue, or blank if circular queue is empty.
	 */
	public String peekRear ()
	{
		if (isEmpty() == true)
		{
			System.out.println("Queue is empty. May not peek rear");
			return "";
		}
		else
		{
			return Integer.toString(CircularQueue[mRear]);
		}
	}
	
	private int [] CircularQueue;
	private int mCount;
	private int mFront;
	private int mRear;
	
}

