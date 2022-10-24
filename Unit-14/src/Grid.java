//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j<cols; j++) {
				int index = (int) (Math.random() * vals.length);
				grid[i][j] = vals[index];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = countVals(vals[0]);
		String val = vals[0];
		for(String i : vals) {
			int next = countVals(i);
			if(next > max) {
				max = next;
				val = i;
			}
		}
		return val;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(j != grid[i].length - 1) {
					output += grid[i][j] + " ";
				}
				else {
					output += grid[i][j];
				}
			}
			output += "\n";
		}
		return output;
	}
}