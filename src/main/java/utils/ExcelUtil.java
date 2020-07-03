package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtil {
    XSSFWorkbook wb;
    XSSFSheet sheet;

    /**
     *
     * @param excelPath
     */
    public ExcelUtil(String excelPath) {
        try {
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }


    public String getData(String sheetName, int row, int col) {
        sheet = wb.getSheet(sheetName);
        DataFormatter formatter = new DataFormatter();
        String data = formatter.formatCellValue(sheet.getRow(row).getCell(col));
        return data;
    }



    public int getRowCount(String sheetName) {
        int row = wb.getSheet(sheetName).getLastRowNum();
        // it will give the index value so index start with 0 initially so we need
        // actual count so we plus one
        return row;

    }

    public int getColumnCount(String sheetName) {
        int noOfColumns = wb.getSheet(sheetName).getRow(0).getLastCellNum();
        return noOfColumns;
    }
}
