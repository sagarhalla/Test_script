package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic_excel {
public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	String val=" ";
	FileInputStream fis=new FileInputStream("./excel/advance ddriven.xls");
	 Workbook book = WorkbookFactory.create(fis);
	 Cell c=book.getSheet(sheet).getRow(row).getCell(cell);
	 val=c.getStringCellValue();
	 
	 return val;	
}
}
