package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class numeric_data {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\july10.xlsx");
	
	double num = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();

	System.out.println(num);
}
}
