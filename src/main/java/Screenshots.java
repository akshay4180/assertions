import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

		public static void ss(WebDriver d,String filename)
		{
			TakesScreenshot ts= (TakesScreenshot) d;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = "C:\\Users\\om\\Desktop\\selenium ss\\"+System.currentTimeMillis()+".png";
			File des= new File(path);
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}


