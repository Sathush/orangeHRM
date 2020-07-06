package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class EmploymentStatusData extends ExcelDataConfig {



    public EmploymentStatusData () {
        super("src\\main\\resources\\excelsheet\\plantNg.xlsx");
    }
    @DataProvider(name = "EmpStatus")
    public Object[][] EmpStatus() {

        int rows = getRowCount("EmpStatus");
        int col = getColumnCount("EmpStatus");


        //LOGGER.info("row = "+ rows + " columns = "+ col);
        System.out.println("row = "+ rows + " columns = "+ col);
        Object[][] data = new Object[rows][col];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i - 1][j] = getData("PayGrades", i, j);
            }
        }
        return data;
    }
}

