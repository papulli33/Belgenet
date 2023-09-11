package StepDefinitions;

import io.cucumber.java.en.*;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import java.util.Set;

public class CreateSteps {
	
	WebDriver driver = null;

	public CreateSteps() throws InterruptedException {
		
		driver = DriverManager.getOpenBrowserHelp().getDriver();
	}
	
	@Given("the user is logged  in")
	public void the_user_is_logged_in() throws Exception {
		System.out.println("Inside Step - the user is logged  in");
	    
	    Thread.sleep(250);
	    
	    // Anasayfa URL'i ile bulunulan sayfanın URL'inin aynı olup olmadığı kontrol ediliyor.
		String url = driver.getCurrentUrl();
		assertEquals("https://www.belgenet.com.tr/edys-web/mainInbox.xhtml", url);
	}

	@When("the user clicks on Evrak Islemleri button")
	public void the_user_clicks_on_Evrak_Islemleri_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks on Evrak Islemleri button");
		
		driver.findElement(By.id("topMenuForm2:ust:0:ustMenuEleman")).click();
		Thread.sleep(500);
	}

	@And("the user clicks on Evrak Olustur button")
	public void the_user_clicks_on_Evrak_Olustur_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks on Evrak Olustur button");
		
		driver.findElement(By.id("topMenuForm2:ust:0:ust:0:ust:2:ust")).click();
		Thread.sleep(500);
	}

	@Then("the Evrak Olustur window should open")
	public void the_evrak_Olustur_window_should_open() throws InterruptedException {
		System.out.println("Inside Step - the_Evrak Olustur window should open");
		
		Thread.sleep(2000);
		
		String dialogTitle = driver.findElement(By.cssSelector("#window1Dialog_title > span > h4")).getText();
		
		assertEquals("Evrak Oluştur",dialogTitle);
	}

	@Given("the Evrak Olustur page is open")
	public void the_evrak_Olustur_page_is_open() {
		System.out.println("Inside Step - the Evrak Olustur page is open");
		
		String dialogTitle = driver.findElement(By.cssSelector("#window1Dialog_title > span > h4")).getText();
		
		assertEquals("Evrak Oluştur",dialogTitle);
	}

	@When("the user clicks Bilgileri button")
	public void the_user_clicks_Bilgileri_button() throws InterruptedException {
		System.out.println("Inside Step - the_user clicks Bilgileri button");
		
		driver.findElement(By.id("yeniGidenEvrakForm:leftTab:uiRepeat:0:cmdbutton")).click();
		Thread.sleep(2000);
	}

	@Then("the user fills in the input part of Kaldirilacak Klasorler")
	public void the_user_fills_in_the_input_part_of_Kaldirilacak_Klasorler() throws InterruptedException {
		System.out.println("Inside Step - the user fills in the input part of Kaldirilacak Klasorler");
		
		driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:4:eklenecekKlasorlerLov:treeButton")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:4:eklenecekKlasorlerLov:lovTree:1")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:4:eklenecekKlasorlerLov:lovTreePanelKapat")).click();
		
		Thread.sleep(3000);
		
	}

	@And("the user fills in the input part of Geregi")
	public void the_user_fills_in_the_input_part_of_Geregi() throws InterruptedException {
		System.out.println("Inside Step - the user fills in the input part of Geregi");
	    
		driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:18:geregiLov:treeButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#yeniGidenEvrakForm\\:evrakBilgileriList\\:18\\:geregiLov\\:lovTree\\:0 > span > span.ui-tree-toggler.ui-icon.ui-icon-triangle-1-e")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#yeniGidenEvrakForm\\:evrakBilgileriList\\:18\\:geregiLov\\:lovTree\\:0_1 > span > span.ui-treenode-label.ui-corner-all > div")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:18:geregiLov:lovTreePanelKapat")).click();
		
		Thread.sleep(4000);
	    
	}

	@And("the user fills in the input part of Onay Akisi")
	public void the_user_fills_in_the_input_part_of_Onay_Akisi() throws InterruptedException {
	    System.out.println("Inside Step - the_user fills in the input part of Onay Akisi");
	    
	    driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:21:onayAkisiEkle")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:21:akisAdimLov:LovSecilenTable:0:selectOneMenu")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.cssSelector("#yeniGidenEvrakForm\\:evrakBilgileriList\\:21\\:akisAdimLov\\:LovSecilenTable\\:0\\:selectOneMenu > option:nth-child(4)")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.id("yeniGidenEvrakForm:evrakBilgileriList:21:anlikAkisKullanButton")).click();
	    
	    Thread.sleep(4000);
	}
	
	@Given("mandatory sections in the Bilgileri part are filled")
	public void mandatory_sections_in_the_Bilgileri_part_are_filled() {
		System.out.println("Inside Step - mandatory sections in the Bilgileri part are filled");
		
	}

	@When("the user clicks Editor button")
	public void the_user_clicks_Editor_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Editor button");
		
		driver.findElement(By.id("yeniGidenEvrakForm:leftTab:uiRepeat:1:cmdbutton")).click();
		
		Thread.sleep(7000);
		
	}

	@Then("the user fills in the fields to be written")
	public void the_user_fills_in_the_fields_to_be_written() throws InterruptedException {
		System.out.println("Inside Step - the user fills in the fields to be written");
		
		
		driver.findElement(By.id("yeniGidenEvrakForm:j_idt14579")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("yeniGidenEvrakForm:hitapEkInplaceTextId")).sendKeys("Otomasyon Testi");
		Thread.sleep(1000);
		driver.findElement(By.id("yeniGidenEvrakForm:j_idt14585")).click();
		
		Thread.sleep(3000);
		
		// Iframe elementi bulunuyor.
		WebElement mainParagraphIframe = driver.findElement(By.cssSelector("#cke_2_contents > iframe"));
		// Selenium, içerik çerçevesine geçiyor.
		driver.switchTo().frame(mainParagraphIframe);
		driver.findElement(By.cssSelector("body > p")).sendKeys("Otomasyon Testi");
		
		// Ana sayfaya geri dönülüyor.
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Elementi bulabilmek için JavaScript kullanarak sayfayı kaydırıyoruz.
		js.executeScript("$(document.getElementById('yeniGidenEvrakForm:j_idt14540')).scrollTo(700)", "");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("yeniGidenEvrakForm:j_idt14613:2:j_idt14620")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("yeniGidenEvrakForm:j_idt14613:2:j_idt14624")).sendKeys("Otomasyon Testi");
		Thread.sleep(1000);
		driver.findElement(By.id("yeniGidenEvrakForm:j_idt14613:2:j_idt14626")).click();
		
		Thread.sleep(5000);	
	}
	
	@Given("the Editor is filled completely")
	public void the_Editor_is_filled_completely() {
		System.out.println("Inside Step - the Editor is filled completely");
	}

	@When("the user clicks Ekleri button")
	public void the_user_clicks_Ekleri_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Ekleri button");
		
		driver.findElement(By.id("yeniGidenEvrakForm:leftTab:uiRepeat:2:cmdbutton")).click();
		
		Thread.sleep(5000);
	}

	@And("the user fills in the input part of Ek Metni")
	public void the_user_fills_in_the_input_part_of_Ek_Metni() throws InterruptedException {
	    System.out.println("Inside Step - the user fills in the input part of Ek Metni");
	    
	    driver.findElement(By.id("yeniGidenEvrakForm:evrakEkTabView:dosyaAciklama")).sendKeys("Otomasyon Testi");
	    
	    Thread.sleep(500);
		
	}

	@And("the user adds files to Dosya Ekle")
	public void the_user_adds_files_to_Dosya_Ekle() throws InterruptedException {
		System.out.println("Inside Step - the user adds files to Dosya Ekle");
		
		WebElement uploadFile = driver.findElement(By.id("yeniGidenEvrakForm:evrakEkTabView:fileUploadButtonA_input"));

		uploadFile.sendKeys("C:/Users/ummus/Downloads/TestOtomasyon.pdf");
		
		Thread.sleep(2000);
	}

	@And("the user clicks Ekle button")
	public void the_user_clicks_Ekle_button() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Ekle button");
		
		driver.findElement(By.id("yeniGidenEvrakForm:evrakEkTabView:dosyaEkleButton")).click();
		
		Thread.sleep(3000);
	}

	@Then("the added file will appear in the attachments section")
	public void the_added_file_will_appear_in_the_attachments_section() throws InterruptedException {
		System.out.println("Inside Step - the added file will appear in the attachments section");
		
		driver.findElement(By.cssSelector("#yeniGidenEvrakForm\\:ekListesiDataTable_data > tr > td:nth-child(1) > span"));
		
		Thread.sleep(4000);
	}

	@Given("mandatory fields are filled")
	public void mandatory_fields_are_filled() {
		System.out.println("Inside Step - mandatory fields are filled");
	}

	@When("the user clicks Imzala button")
	public void the_user_clicks_Imzala_button() throws InterruptedException {
		System.out.println("Inside Step - theuser clicks Imzala button");
		
		driver.findElement(By.id("yeniGidenEvrakForm:rightTab:uiRepeat:2:cmdbutton")).click();
		
		Thread.sleep(7000);
	}

	@And("the user selects s-Imza from signature types")
	public void the_user_selects_s_Imza_from_signature_types() throws InterruptedException {
		System.out.println("Inside Step - the user selects s-Imza from signature types");
		
		driver.findElement(By.id("imzalaForm:imzalaRadio")).click();
		
		Thread.sleep(2000);
		
		//s-İmzaya tıklandığında açılan Yardım pop-up'ını kapatma işlevini yapıyor.
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		windows.remove(mainWindow);
		driver.switchTo().window((String) windows.toArray()[0]);
		driver.close();
		driver.switchTo().window(mainWindow);
		Thread.sleep(200);
	}

	@And("the user clicks Imzala button in pop-up")
	public void the_user_clicks_Imzala_button_in_pop_up() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Imzala button in pop-up");
		
		driver.findElement(By.id("imzalaForm:sayisalImzaConfirmDialogOpener")).click();
		
		Thread.sleep(2000);
	}

	@And("the user selects Evet option available in the pop-up")
	public void the_user_selects_Evet_option_available_in_the_pop_up() throws InterruptedException {
		System.out.println("Inside Step - the user selects Evet option available in the pop-up");
		
		driver.findElement(By.id("imzalaForm:sayisalImzaConfirmForm:sayisalImzaEvetButton")).click();
		
		Thread.sleep(2000);
	}

	@Then("the document creation is successful")
	public void the_document_creation_is_successful() throws InterruptedException {
		System.out.println("Inside Step - the document creation is successful");
		
		Thread.sleep(100);
	}

	@Given("the user is in main page")
	public void the_user_is_in_main_page() throws InterruptedException {
		System.out.println("Inside Step - the user selects Evet option available in the pop-up");
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
	}

	@When("the user clicks Islem Yaptiklarim")
	public void the_user_clicks_Islem_Yaptiklarim() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Islem Yaptiklarim");
		
		driver.findElement(By.cssSelector("#leftMenuForm\\:leftMenuIslemYaptiklarim > ul > li.ui-widget-header.ui-corner-all.islemYaptiklarim-icon.ui-menuitem-default.ui-accordion-menu.ui-menuitem-default")).click();
		
		Thread.sleep(500);
	}

	@And("the user clicks Imzaladiklarim")
	public void the_user_clicks_Imzaladiklarim() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Imzaladiklarim");
		
		driver.findElement(By.id("esm_715431183_emi_1191786840")).click();
		
		Thread.sleep(2000);
	}

	@And("the user clicks Icerik Goster on the first document")
	public void the_user_clicks_Icerik_Goster_on_the_first_document() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Icerik Goster on the first document");

		driver.findElement(By.id("mainInboxForm:inboxDataTable:0:detayGosterButton")).click();
		
		Thread.sleep(3000);
	}
	
	@And("the user clicks Ekleri button in the document on Imzaladiklarim")
	public void the_user_clicks_Ekleri_button_in_the_document_on_Imzaladiklarim() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Ekleri button in the document");
		
		driver.findElement(By.id("inboxItemInfoForm:dialogTabMenuLeft:uiRepeat:2:cmdbutton")).click();
		
		Thread.sleep(4000);
	}

	@Then("the Dosya Adi should be the same as in the generated document")
	public void the_dosya_Adi_should_be_the_same_as_in_the_generated_document() throws InterruptedException {
		System.out.println("Inside Step - the Dosya Adi should be the same as in the generated document");
		
		
		String attachmentName = driver.findElement(By.cssSelector("#inboxItemInfoForm\\:ekListesiDataTable\\:0\\:j_idt9095 > span")).getText();
		assertEquals("TestOtomasyon.pdf", attachmentName);
		
		Thread.sleep(3000);
	}

	@When("the user clicks Birim Evraklari")
	public void the_user_clicks_Birim_Evraklari() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Birim Evraklari");
		
		driver.findElement(By.cssSelector("#leftMenuForm\\:leftMenuBirimEvraklari > ul > li.ui-widget-header.ui-corner-all.birimEvraklari-icon.ui-menuitem-default.ui-accordion-menu.ui-menuitem-unread")).click();
		
		Thread.sleep(3000);
	}

	@And("the user clicks Teslim Alinmayi Bekleyenler")
	public void the_user_clicks_Teslim_Alinmayi_Bekleyenler() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Teslim Alinmayi Bekleyenler");
		
		driver.findElement(By.id("esm_1995756304_emi_1494514392")).click();
		
		Thread.sleep(4000);
	}
	
	@And("the user selects the departmant of the generated document")
	public void the_user_selects_the_departmant_of_the_generated_document() throws InterruptedException {
		System.out.println("Inside Step - the user selects the departmant of the generated document");
		
		driver.findElement(By.id("mainInboxForm:birimInboxFilterLov:j_idt547")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("mainInboxForm:birimInboxFilterLov:treeButton")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#mainInboxForm\\:birimInboxFilterLov\\:lovTree\\:0 > span > span.ui-tree-toggler.ui-icon.ui-icon-triangle-1-e")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("mainInboxForm:birimInboxFilterLov:lovTree:0_0")).click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	@And("the user clicks Ekleri button in the document on Teslim Alinmayi Bekleyenler")
	public void the_user_clicks_Ekleri_button_in_the_document_on_Teslim_Alinmayi_Bekleyenler() throws InterruptedException {
		System.out.println("Inside Step - the user clicks Ekleri button in the document on Teslim Alinmayi Bekleyenler");
		
		driver.findElement(By.id("inboxItemInfoForm:dialogTabMenuLeft:uiRepeat:1:cmdbutton")).click();
		Thread.sleep(4000);
	}
}

