package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class boolean_data {
public static void main(String[] args) throws Throwable {
	
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=3;j++) {
			FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\july11.xlsx");

			boolean val = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(i).getCell(j).getBooleanCellValue();
			System.out.println(val);
		}
	}
	
	
}
}
