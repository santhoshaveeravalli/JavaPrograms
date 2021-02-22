
public class IndexOutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		
		try {
			
			System.out.println(arr[20]);
		}
		catch(IndexOutOfBoundsException i)
		{
			System.out.println("Index Out of bound Exception is found" +i);
		}

	}

}
