package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name = "LoginData")
	public String[][] getdata() throws IOException {
		String path = System.getProperty("user.dir") + "\\testData\\loginData.xlsx";
		System.out.println(path);
		ExcelUtilities xlutils = new ExcelUtilities(path);

		int totalrows = xlutils.getRowCount("Sheet1");
		int totalcols = xlutils.getCellCount("Sheet1", 1);

		String logindata[][] = new String[totalrows - 1][totalcols];

		for (int i = 1; i <= totalrows - 1; i++) {
			for (int j = 0; j < totalcols; j++) {
				logindata[i - 1][j] = xlutils.getCellData("Sheet1", i, j);
			}
		}

		return logindata;
	}
}
