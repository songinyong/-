/*
 * 우선 순위 큐를 구현하기 위한 이집힙 
 * */

package ex7;

public class BHeap<Key extends Comparable<Key>, Value> {
	
	private Entry[] a;
	private int N ;
	public BHeap(Entry[] harray, int initialSize) {
		a = harray;
		N = initialSize ;
	}
	
	public int size() {return N;}
	private boolean greater(int i, int j) {
		return a[j].getKey().compareTo(a[i].getKey()) <0;
	}
	private void swap(int i, int j) {
		Entry temp = a[i] ;
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
	
	public void insert(Key newKey, Value newValue) {
		Entry temp = new Entry(newKey, newValue);
		a[++N] = temp ;
		upheap(N);
	}
	
	private void upheap(int j) {
		while(j >1 && greater(j/2, j)) {
			swap(j/2, j);
			j = j/2 ;
		}
	}
	
	public Entry deletMin() {
		Entry min = a[1];
		swap(1, N--);
		a[N+1] = null ;
		downHeap(1) ;
		return min ;
	}

}
