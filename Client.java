public class Client
{
	public static void main(String args[])
	{
		Heap heap = new Heap();
		heap.insert(-1);
		heap.insert(0);
		heap.insert(7);
		heap.insert(10);heap.insert(8);
		heap.insert(4);
		heap.insert(2);
		heap.disp();
		heap.pop();
		heap.disp();
	}
}
