package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class JobTittleData extends ExcelDataConfig {

    public JobTittleData () {
        super("src\\main\\resources\\excelsheet\\plantNg.xlsx");
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
