//허프만 코딩 연습을 위한 Entry

package ex7;

public class HEntry {
	private int frequency ;
	private String word ;
	private HEntry left ;
	private HEntry right ;
	private String code ;
	public HEntry(int newFreq, String newValue, HEntry l, HEntry r, String s) {
		frequency = newFreq ;
		word = newValue ;
		left = l ;
		right = r ;
		code = s;
	}
	
	public int getKey() {return frequency ; }
	public String getValue() {return word ; }
	public String getCode() {return code; }
	public HEntry getLeft() {return left;}
	public HEntry getRight() {return right; }
	public void setCode(String newCode) {code = newCode;}
	
}
