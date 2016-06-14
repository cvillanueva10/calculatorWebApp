package ExcelSheet;

public class ExcelSheet {
	
	public int columnNum(String s){
		int count=0; 
		int temp=0; 
		for(int i=0; i <s.length(); i++){ 
		temp= s.charAt(i)-'A'+1; 
		count=count*26+temp; 
		} 
		return count; 
		
	}
}
