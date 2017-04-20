package calculadora;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FuncionalTest {

	public void PruebaFuncional() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setJavascriptEnabled(true);                
		caps.setCapability("takesScreenshot", true);  
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
		                   "phantomjs.exe"
		                    );
		WebDriver driver = new  PhantomJSDriver(caps);
		
        String url = "https://images.google.com";
        String expectedTitle = "Imgenes de Google";
        String actualTitle = "";

        // Iniciar el navegador en la URL indicada
        driver.get(url);

        // Capturar el ttulo del sitio
        actualTitle = driver.getTitle();
       
        // Cerrar navegador
        driver.close();
        
        assertEquals(actualTitle,expectedTitle);
	}

}
