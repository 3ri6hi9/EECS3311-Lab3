package shape;

import java.util.List;

public class SortingTechnique {
	public static List<Shape> sortShapes(List<Shape> shapeList) {
		int i, j;
		int tempNum = 30;
		
		for (i = 0; i < shapeList.size(); i++)
		{
			for (j = i + 1; j < shapeList.size(); j++)
			{
				if (shapeList.get(i).compareTo(shapeList.get(j)) == 1)
				{
					
					Shape temp = shapeList.get(i);
					shapeList.set(i, shapeList.get(j));
					shapeList.set(j, temp);
				}
			}
			
			shapeList.get(i).setUpperX(tempNum);
			shapeList.get(i).setUpperY(tempNum);
			tempNum += 90;
		}
		
		return shapeList;
	}
}