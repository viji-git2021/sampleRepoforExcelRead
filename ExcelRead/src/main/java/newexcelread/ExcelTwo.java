package newexcelread;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelTwo {
	



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelOne obj=new ExcelOne();
		// double value =obj.readData(0, 1);
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
		String value =obj.readData(i, j);
		 System.out.println(value);
			}
		}
		
		

	}

}
