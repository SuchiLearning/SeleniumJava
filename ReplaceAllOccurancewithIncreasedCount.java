public class ReplaceAllOccurancewithIncreasedCount {
    public static void main(String[] args) {
        String input = "Moscow One";
        input = input.toLowerCase();
     StringBuilder result = new StringBuilder();
     int Ocount = 0;
     
     for(char ch : input.toCharArray())
     {
    	 if (ch=='o')
    	 {
    		 Ocount++;
    		 result.append("$".repeat(Ocount));
    	 }
    	 else
    	 {
    		 result.append(ch);
    	 }
    	 
     }
     System.out.println(result.toString());
     
     
        
    }   
    }