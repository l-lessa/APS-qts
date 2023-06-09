package testesistema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import junit.framework.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest3 {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    public SeleniumTest3() {
    }
    
    @BeforeAll
    public static void setUp() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\00307852-admin\\Downloads\\Nova pasta\\chromedriver_win32\\chromedriver.exe");
	        
        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    
    
    @Test
    public void testNomeValido(){
    	driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement nome = driver.findElement(By.id("nome"));
        WebElement end = driver.findElement(By.id("endereco"));
        WebElement sexo = driver.findElement(By.id("sexo"));
        WebElement idade = driver.findElement(By.id("idade"));
        WebElement submit = driver.findElement(By.id("botao_somar"));
        nome.sendKeys("jorge");
        end.sendKeys("rua Assis Brasil");
        sexo.sendKeys("Masculino");
        idade.sendKeys("30");
        submit.click();
        
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
        
    }
    
     @Test
    public void testNomeInvalido(){
        driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
        
        WebElement nome = driver.findElement(By.id("nome"));
        WebElement end = driver.findElement(By.id("endereco"));
        WebElement sexo = driver.findElement(By.id("sexo"));
        WebElement idade = driver.findElement(By.id("idade"));
        WebElement submit = driver.findElement(By.id("botao_somar"));
        nome.sendKeys("");
        end.sendKeys("rua Assis Brasil");
        sexo.sendKeys("Masculino");
        idade.sendKeys("30");
        submit.click();
         WebElement resultado = driver.findElement(By.id("resultado"));
         String resultadoEsperado = "Preencha o campo nome";
         String resultadoReal = resultado.getText();
         Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
     
     @Test
     public void testEnderecoValido(){
    	 driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
         
         WebElement nome = driver.findElement(By.id("nome"));
         WebElement end = driver.findElement(By.id("endereco"));
         WebElement sexo = driver.findElement(By.id("sexo"));
         WebElement idade = driver.findElement(By.id("idade"));
         WebElement submit = driver.findElement(By.id("botao_somar"));
         nome.sendKeys("jorge");
         end.sendKeys("rua Flores 433");
         sexo.sendKeys("Masculino");
         idade.sendKeys("35");
         submit.click();
         
         Alert alert = driver.switchTo().alert();
         Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
     }
     
      @Test
     public void testEnderecoInvalido(){
         driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
         
         WebElement nome = driver.findElement(By.id("nome"));
         WebElement end = driver.findElement(By.id("endereco"));
         WebElement sexo = driver.findElement(By.id("sexo"));
         WebElement idade = driver.findElement(By.id("idade"));
         WebElement submit = driver.findElement(By.id("botao_somar"));
         nome.sendKeys("Maria");
         end.sendKeys("");
         sexo.sendKeys("Feminino");
         idade.sendKeys("20");
         submit.click();
          WebElement resultado = driver.findElement(By.id("resultado"));
          String resultadoEsperado = "Preencha o campo endereco";
          String resultadoReal = resultado.getText();
          Assert.assertEquals(resultadoEsperado, resultadoReal);
     }
      
      @Test
      public void testSexoValido(){
      	driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");      
      	 WebElement nome = driver.findElement(By.id("nome"));
         WebElement end = driver.findElement(By.id("endereco"));
         WebElement sexo = driver.findElement(By.id("sexo"));
         WebElement idade = driver.findElement(By.id("idade"));
         WebElement submit = driver.findElement(By.id("botao_somar"));
         nome.sendKeys("Fernando Avestruz");
         end.sendKeys("rua Margarida 1033");
         sexo.sendKeys("Masculino");
         idade.sendKeys("79");
         submit.click();
         
         Alert alert = driver.switchTo().alert();
         Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
      }
      
       @Test
      public void testSexoInvalido(){
          driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
          
          WebElement nome = driver.findElement(By.id("nome"));
          WebElement end = driver.findElement(By.id("endereco"));
          WebElement sexo = driver.findElement(By.id("sexo"));
          WebElement idade = driver.findElement(By.id("idade"));
          WebElement submit = driver.findElement(By.id("botao_somar"));
          nome.sendKeys("Carmen Miranda");
          end.sendKeys("Avenida Ceara");
          sexo.sendKeys("...");
          idade.sendKeys("50");
          submit.click();
           WebElement resultado = driver.findElement(By.id("resultado"));
           String resultadoEsperado = "Selecione um valor para o campo sexo";
           String resultadoReal = resultado.getText();
           Assert.assertEquals(resultadoEsperado, resultadoReal);
      }
       
       @Test
       public void testIdadeValido(){
       	driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");      
       	WebElement nome = driver.findElement(By.id("nome"));
        WebElement end = driver.findElement(By.id("endereco"));
        WebElement sexo = driver.findElement(By.id("sexo"));
        WebElement idade = driver.findElement(By.id("idade"));
        WebElement submit = driver.findElement(By.id("botao_somar"));
        nome.sendKeys("Carlinhos Bergamota");
        end.sendKeys("rua Aparecida");
        sexo.sendKeys("Masculino");
        idade.sendKeys("29");
        submit.click();
        
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
       }
       
        @Test
       public void testIdadeInvalido(){
           driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");
           
          WebElement nome = driver.findElement(By.id("nome"));
          WebElement end = driver.findElement(By.id("endereco"));
          WebElement sexo = driver.findElement(By.id("sexo"));
          WebElement idade = driver.findElement(By.id("idade"));
          WebElement submit = driver.findElement(By.id("botao_somar"));
          nome.sendKeys("Leandro Navalheiro");
          end.sendKeys("Avenida das Estacas");
          sexo.sendKeys("masculino");
          idade.sendKeys("quarenta");
          submit.click();
          WebElement resultado = driver.findElement(By.id("resultado"));
          String resultadoEsperado = "Preencha o campo idade, somente com numeros";
          String resultadoReal = resultado.getText();
          Assert.assertEquals(resultadoEsperado, resultadoReal);
       }
        
        @Test
        public void testValidarTitulo(){
        	driver.get("C:\\Users\\00307852-admin\\eclipse-workspace\\qts-main\\src\\main\\java\\sistema\\trabalho2-1.html");      
        	String tituloExperado ="Trabalho 2-1"; 
        	String resultadoReal = driver.getTitle();
        	Assert.assertEquals(tituloExperado, resultadoReal);
        }
       
     
    
    
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
    
}
