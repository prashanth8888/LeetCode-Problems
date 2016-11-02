import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		StringBuilder ransomnote = new StringBuilder(ransomNote);
		StringBuilder magazinecoll = new StringBuilder(magazine);
		for(int i=0; i<ransomNote.length(); i++){
			for(int j=0; j<magazine.length(); j++){
				char r = ransomnote.charAt(i);
				char m = magazinecoll.charAt(j);
				if(r == m){
					ransomnote.setCharAt(i,'9');
					magazinecoll.setCharAt(j,'9');
					break;
				}	
			}	
		}
		
		Pattern p = Pattern.compile(".*[a-zA-Z].*");
		String result = ransomnote.toString();
		//System.out.println("Result String"  + result);
		Matcher m = p.matcher(result);
		
		if(m.find()){
			return false;
		}
		else{
			return true;
		}
		
        
    }
}