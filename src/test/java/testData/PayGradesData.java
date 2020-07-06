package testData;

import org.testng.annotations.DataProvider;
import utils.ExcelDataConfig;

public class PayGradesData extends ExcelDataConfig {
    public PayGradesData () {
        super("src\\main\\resources\\excelsheet\\plantNg.xlsx");
    }
    @DataProvider(name = "PayGradesData")
    public Object[][] PayGradesData() {

        int rows = getRowCount("PayGrades");
        int col = getColumnCount("PayGrades");


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
