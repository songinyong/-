//허프만 코딩 구현 연습

package ex7;

public class Huffman <Key extends Comparable<Key>, Value>{
	private HEntry[] a;
	private int N ;
	public Huffman(HEntry[] harray, int initialSize) {
		a = harray ;
		N =initialSize ;
	}
	private boolean greater(int i, int j) {
		return a[i].getKey() > a[j].getKey();
	}
	public int size() {return N;}
	
	public HEntry createTree() {
		while (size() > 1) {
			HEntry e1 = deleteMin() ;
			HEntry e2 = deleteMin() ;
			HEntry temp  = new HEntry(e1.getKey() + e2.getKey(), e1.getValue()+e2.getValue(),e1,e2," ");
			// 새 노드 힙에 삽임
			insert(temp);
		}
		return deleteMin();
	}
	
	public HEntry deleteMin() {
		HEntry min = a[1];
		swap(1, N--);
		a[N+1] = null ;
		downHeap(1) ;
		return min ;
	}
	
	private void swap(int i, int j) {
		HEntry temp = a[i] ;
		a[i] = a[j] ;
		a[j] = temp;
	}
	
	public void createHeap() {
		for(int i = N/2; i>0; i--) {
			downHeap(i);
		}
	}
	
	private void downHeap(int i) {
		while(2*i <= N) {
			int k = 2*i ;
			if(k < N && greater(k, k+1)) k++;
			if (!greater(i,k)) break;
			swap(i, k);
		
		}
	}
	
	public void insert(HEntry temp) {
		HEntry i = temp;
		a[++N] = i ;
		upheap(N);
	}
	
	private void upheap(int j) {
		while(j >1 && greater(j/2, j)) {
			swap(j/2, j);
			j = j/2 ;
		}
	}
	
	
}
