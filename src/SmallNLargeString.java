
public class SmallNLargeString {

	public static void main(String[] args)
	{
		String sentences= "Hardships often prepare ordinary people for an extraordinary destiny";
		String word ="" , small="", large="";
		String[] words= new String[100];
		int length=0;
		
		sentences = sentences +" ";
		

		for(int i=0; i<sentences.length(); i++)
		{
			// Spliting the string into words
			if(sentences.charAt(i)!=' ')
			{
				word =word+ sentences.charAt(i);
			}
			else
			{
				// Adding word to array words
				words[length]=word;
				// incrementing the length
				length++;
				
				//make word as an empty
				word="";
			}
		}
		
		// initializing small n large with first word in the String
		small=large= words[0];
		
		// This will check the length of the sentences which is the smallest and largest in that thing  
		for(int j=0; j<length; j++)
		{
			// if the length of small is greater then any word present in the sentences store value of word into small
			if(small.length()>words[j].length())
			{
				small=words[j];
				
				// If the length of large is smaller than any word present in the sentencews store value into large
				if(large.length()<words[j].length())
				{
					large=words[j];
				}
				
				System.out.println("Smallest word:" + small);
				System.out.println("Largest word:" + large);
				
			}
			
		}
	}

}
