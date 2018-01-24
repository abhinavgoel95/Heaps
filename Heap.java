public class Heap
{
	int front = 1;
	int rear = 0;
	int arr[] = new int[100];
	public void insert(int k)
	{
		arr[++rear] = k;
		heap();
	}
	public void heap()
	{
		int n = rear - front;
		for(int i = n/2; i> 0;i--)
		{
			heapify(arr,i,n);
		}
		
		for(int i = rear; i>= front; i--)
		{
			int temp = arr[i];
			arr[i] = arr[1];
			arr[1] = temp;
			heapify(arr,1,i-1);
		}
	}
	public void heapify(int[] arr, int pos, int n)
	{
		int i = pos;
		int j = 2*i;
		boolean found = false;
		while( j <= n && !found)
		{
			if( (j+1)<= n && arr[j] > arr[j+1])
			{
				j = j+1;
			}
			if(arr[i] < arr[j])
			{
				found = true;
			}
			else
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i = j;
				j = 2*i;
			}
		}
	}
	public void pop()
	{
		rear--;
	}
	public void disp()
	{
		 for(int i = rear; i >= front; i--)
			 System.out.print(arr[i] + " ");
		 System.out.println();
	}
}
