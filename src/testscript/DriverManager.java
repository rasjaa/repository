package testscript;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.Assert;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class DriverManager extends Keywords{
	
	static ArrayList data1;
	static FileInputStream f2;
	static XSSFWorkbook w2;
	static XSSFSheet s1;
	static DriverManager dm = new DriverManager();;

	static {
		try {
			data1 = new ArrayList();
			f2 = new FileInputStream("C:\\Users\\Pawan\\eclipse-workspace\\myFramework\\src\\testcase\\AllModules.xlsx");

			w2 = new XSSFWorkbook(f2);

			s1=w2.getSheetAt(0);
			// w.getSheetAt(index)

			Iterator<Row> rowitr = s1.iterator();
			while (rowitr.hasNext()) {
				Row rowall = rowitr.next();
				Iterator<Cell> cellallitr = rowall.cellIterator();

				while (cellallitr.hasNext()) {
					Cell call = cellallitr.next();

					if (call.getCellTypeEnum() == CellType.STRING) {
						data1.add(call.getStringCellValue());
					}
					if (call.getCellTypeEnum() == CellType.NUMERIC) {
						data1.add(call.getNumericCellValue());
					}
					if (call.getCellTypeEnum() == CellType.BOOLEAN) {
						data1.add(call.getBooleanCellValue());
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}//static

	@Test
	public void executeLead() throws Exception{
		System.out.println("hello");
		for(int i=0;i<data1.size();i++){
			
			if (data1.get(i).equals("Leads") 
					&& data1.get(i+1).equals("Yes")){
			ArrayList	data2 = new ArrayList();
		FileInputStream	f3 = new FileInputStream("C:\\Users\\Pawan\\eclipse-workspace\\myFramework\\src\\testcase\\Leads.xlsx");

		XSSFWorkbook w3 = new XSSFWorkbook(f3);

		XSSFSheet	s2 = w3.getSheetAt(0);
				// w.getSheetAt(index)

				Iterator<Row> rowitr1 = s2.iterator();
				while (rowitr1.hasNext()) {
				Row rowall1 = rowitr1.next();
	Iterator<Cell> cellallitr1 = rowall1.cellIterator();

					while (cellallitr1.hasNext()) {
				Cell call1 = cellallitr1.next();

	if (call1.getCellTypeEnum() == CellType.STRING) {
		data2.add(call1.getStringCellValue());
						}
	if (call1.getCellTypeEnum() == CellType.NUMERIC) {
		data2.add(call1.getNumericCellValue());
			}
	if (call1.getCellTypeEnum() == CellType.BOOLEAN) {
		data2.add(call1.getBooleanCellValue());
						}
					}
	}//All while loop ends here
				
				
		for(int j=0; j<data2.size();j++){
		if(data2.get(j).equals("openBrowser")){
		String keywordName = (String) data2.get(j);
		String testData = (String) data2.get(j+1);
		String objectName = (String) data2.get(j+2);
		String runMode = (String) data2.get(j+3);
		System.out.println(keywordName
				+ " " +testData+ " "+ runMode);
				
			if(runMode.equals("yes")){
				dm.openBrowser();
			}
		
					
		}
		if(data2.get(j).equals("navigate")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.navigate(testData);
				}
	}
		if(data2.get(j).equals("window")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.window();
				}
				
	}
		
		if(data2.get(j).equals("mouse")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.mouse(objectName);
				}
	}
		if(data2.get(j).equals("upload")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.upload(testData);
				}
	}
		if(data2.get(j).equals("drop")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.drop(testData,objectName);
				}
	}
		
		if(data2.get(j).equals("waitStatement")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
				dm.waitStatement();
				}
	}
		
		if(data2.get(j).equals("input")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode +" "+ objectName);
					
				if(runMode.equals("yes")){
				dm.input(testData,objectName);
				}
	}
		if(data2.get(j).equals("click")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
				dm.click(objectName);
			}
	}
		
		if(data2.get(j).equals("type")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
				dm.type(testData);
			}
	}
		if(data2.get(j).equals("close")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
				dm.close();
			}
	}
		if(data2.get(j).equals("verifyTitle")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
				String actualValue = dm.verifyTitle();
			
				Assert.assertEquals(testData, actualValue);
				
				}
	}
		
} 
				
			
}
		}	
		
		
		}//main
		
		@Test
		public void executeAccount() throws Exception{
			
			for(int i=0;i<data1.size();i++){
				
				if (data1.get(i).equals("Accounts") 
						&& data1.get(i+1).equals("yes")){
				ArrayList	data2 = new ArrayList();
			FileInputStream	f3 = new FileInputStream("D://accounts.xlsx");

			XSSFWorkbook w3 = new XSSFWorkbook(f3);

			XSSFSheet	s2 = w3.getSheetAt(0);
					// w.getSheetAt(index)

					Iterator<Row> rowitr1 = s2.iterator();
					while (rowitr1.hasNext()) {
					Row rowall1 = rowitr1.next();
		Iterator<Cell> cellallitr1 = rowall1.cellIterator();

						while (cellallitr1.hasNext()) {
					Cell call1 = cellallitr1.next();

		if (call1.getCellTypeEnum() == CellType.STRING) {
			data2.add(call1.getStringCellValue());
							}
		if (call1.getCellTypeEnum() == CellType.NUMERIC) {
			data2.add(call1.getNumericCellValue());
				}
		if (call1.getCellTypeEnum() == CellType.BOOLEAN) {
			data2.add(call1.getBooleanCellValue());
							}
						}
		}//All while loop ends here
					
					
			for(int j=0; j<data2.size();j++){
			if(data2.get(j).equals("openBrowser")){
			String keywordName = (String) data2.get(j);
			String testData = (String) data2.get(j+1);
			String objectName = (String) data2.get(j+2);
			String runMode = (String) data2.get(j+3);
			System.out.println(keywordName
					+ " " +testData+ " "+ runMode);
					
				if(runMode.equals("yes")){
					dm.openBrowser();
				}
			
						
			}
			if(data2.get(j).equals("navigate")){
				String keywordName = (String) data2.get(j);
				String testData = (String) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
						dm.navigate(testData);
					}
		}
			
			if(data2.get(j).equals("waitStatement")){
				String keywordName = (String) data2.get(j);
				double testData = (double) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
					dm.waitStatement();
					}
		}
			
			if(data2.get(j).equals("input")){
				String keywordName = (String) data2.get(j);
				String testData = (String) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
					dm.input(testData,objectName);
					}
		}
			if(data2.get(j).equals("click")){
				String keywordName = (String) data2.get(j);
				String testData = (String) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
					dm.click(objectName);
				}
		}
			
			if(data2.get(j).equals("type")){
				String keywordName = (String) data2.get(j);
				String testData = (String) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
					dm.type(testData);
				}
		}
			if(data2.get(j).equals("close")){
				String keywordName = (String) data2.get(j);
				String testData = (String) data2.get(j+1);
				String objectName = (String) data2.get(j+2);
				String runMode = (String) data2.get(j+3);
				System.out.println(keywordName
						+ " " +testData+ " "+ runMode);
						
					if(runMode.equals("yes")){
					dm.close();
				}
		}
			
	} 
					
				
	}
			
			
			
			}
		
	}//class
}

