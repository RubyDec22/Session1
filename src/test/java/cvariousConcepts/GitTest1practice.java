package cvariousConcepts;

import org.openqa.selenium.WebDriver;

public class GitTest1practice {

	public  void gittest() {
		
	}
		static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
			launchBrowser();
			positiveLoginTest();
			tearDown();
			
			launchBrowser();
			positiveLoginTest();
			tearDown();
			
			launchBrowser();
			negLoginTest1();
			tearDown();
			
			launchBrowser();
			negLoginTest1();
			tearDown();

	}

		private static void negLoginTest1() {
			// TODO Auto-generated method stub
			
		}

		private static void tearDown() {
			// TODO Auto-generated method stub
			
		}

		private static void positiveLoginTest() {
			// TODO Auto-generated method stub
			
		}

		private static void launchBrowser() {
			// TODO Auto-generated method stub
			
		}

}
