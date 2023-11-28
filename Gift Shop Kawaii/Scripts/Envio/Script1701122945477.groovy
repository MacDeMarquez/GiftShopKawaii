import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://giftshopkawaii.cl/')

WebUI.setText(findTestObject('Object Repository/Page_Gift Shop Kawaii/input_q'), 'cerdito')

WebUI.sendKeys(findTestObject('Object Repository/Page_Gift Shop Kawaii/input_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Bsqueda 27 resultados encontrados para_3b0d29/img'))

WebUI.click(findTestObject('Object Repository/Page_Peluche cerdito dormiln  Gift Shop Kawaii/a_Agregar al carrito'))

WebUI.click(findTestObject('Object Repository/Page_Peluche cerdito dormiln  Gift Shop Kawaii/a_Ver Carrito'))

WebUI.click(findTestObject('Object Repository/Page_Tu carrito  Gift Shop Kawaii/input_checkout'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_postalCode'))

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_postalCode_1'), 'PUNTA ARENAS')

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_city'), '')

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_city'))

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_city_1'), 'Camarones')

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_city_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/select_Arica y ParinacotaTarapacAntofagasta_d758bf'), 
    'MA', true)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_address1'))

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/input_address1_1'), 'Av. Pdte. Manuel Bulnes 01855, 6210427 Punta Arenas, Magallanes y la Antártica Chilena')

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/div'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/p_Despacho a Regin de Arica y Parinacota'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de pago - Gift Shop Kawaii/p_Despacho a Regin de Arica y Parinacota'))

