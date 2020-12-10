package utils;

public class ExcelUtilTest {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		
		ExcelsUtil excel = new ExcelsUtil(projectPath+"/excel/data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}

}
