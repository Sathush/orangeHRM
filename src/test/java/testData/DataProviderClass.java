package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class DataProviderClass extends ExcelDataConfig {
    public DataProviderClass () {
        super("src\\main\\resources\\excelsheet\\plantNg.xlsx");
    }
    @DataProvider(name = "LoginExcel")
    public Object[][] LoginExcel() {

        int rows = getRowCount("Sheet2");
        int col = getColumnCount("Sheet2");


        //LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("Sheet2", i, j);
            }
        }
        return data;
    }
    @DataProvider(name = "JobTittleExcel")
    public Object[][] JobTittleExcel() {

        int rows = getRowCount("jobTittle");
        int col = getColumnCount("jobTittle");


        //LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("jobTittle", i, j);
            }
        }
        return data;
    }
}
