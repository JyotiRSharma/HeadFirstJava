import java.util.ArrayList;

public class SimpleDotCom 
{
	private ArrayList<String> locationCells;
	// int numOfHits = 0;

	public void setLocationCells(ArrayList<String> locs) 
	{
		locationCells = locs;
	}

	public String checkYourself(String userInput) 
	{
		// int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		//If the guess is there then get the index, otherwise get -1

		if (index >= 0)
		{
			locationCells.remove(index);

			if (locationCells.isEmpty())
			{
				result = "kill";
			}
			else
			{
				result = "hit";
			}
		}


		System.out.println(result);
		return result;
	}
}