package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class devexprezoPage extends basepage{
    public devexprezoPage(){
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "icon-edit")
    private WebElement btnRegister;
    @FindBy(id = "name")
    private WebElement inputName;
    @FindBy(id = "surname")
    private WebElement inputSurname;
    @FindBy(id = "surname2")
    private WebElement inputSurname2;
    @FindBy(id = "fecha_nacimiento")
    private WebElement inputFechaNacimiento;
    @FindBy(id = "numero")
    private WebElement inputNumber;
    @FindBy(id = "email")
    private WebElement inputEmail;
    @FindBy(id = "emailcf")
    private WebElement inputEmailConfirmation;
    @FindBy(id = "dir_calle")
    private WebElement inputStreet;
    @FindBy(id = "dir_no_exterior")
    private WebElement inputNumberExterior;
    @FindBy(id = "dir_no_interior")
    private WebElement inputNumberInterior;
    @FindBy(id = "cli_cp")
    private WebElement inputCP;
    @FindBy(id = "dir_colonia")
    private WebElement lblColonia;
    @FindBy(id = "dir_cd")
    private WebElement campoCiudad;
    @FindBy(id = "dir_edo")
    private WebElement campoEDO;
    @FindBy(id = "sucursal")
    private WebElement lblSucursal;
    @FindBy(id = "zorroID")
    private WebElement inputZorroID;
    @FindBy(id = "passwd")
    private WebElement inputPass;
    @FindBy(id = "passwdCf")
    private WebElement inputPassConfirmation;
    @FindBy(id = "terminos_uso")
    private WebElement btnTerminos;
    @FindBy(id = "politicas_privacidad")
    private WebElement btnPrivacidad;
    @FindBy(css = ("button.btn.registrar.w-100.mx-auto:not([disabled])"))
    private WebElement btnRegistrar;

    public void navigateToDevexprezo(){
        navigateTo("https://devexprezo.com.mx");
    }
    public void registerUser(){
        wait.until(ExpectedConditions.visibilityOf(btnRegister)).click();
        navigateTo("https://devexprezo.com.mx/login");
    }
    public void enterName(String name){
        waitForPageLoad("https://devexprezo.com.mx/signin");
        sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(inputName)).sendKeys(name);
    }
    public void enterLastName(String apellidoPaterno, String apellidoMaterno){
        wait.until(ExpectedConditions.elementToBeClickable(inputSurname)).sendKeys(apellidoPaterno);
        wait.until(ExpectedConditions.elementToBeClickable(inputSurname2)).sendKeys(apellidoMaterno);
    }
    public void enterFechaNacimiento(String fecha) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFechaNacimiento)).clear();
        inputFechaNacimiento.click();
        inputFechaNacimiento.sendKeys(fecha);
    }
    public void enterNumberPhone(String number){
        wait.until(ExpectedConditions.elementToBeClickable(inputNumber)).sendKeys(number);
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(inputEmail)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(inputEmailConfirmation)).sendKeys(email);
    }
    public void enterStreet(String steet){
        wait.until(ExpectedConditions.elementToBeClickable(inputStreet)).sendKeys(steet);
    }
    public void enterNumberExterior(String numExterior){
        wait.until(ExpectedConditions.elementToBeClickable(inputNumberExterior)).sendKeys(numExterior);
    }
    public void enterNumberInterior(String numInterior){
        int seleccionaInterior = basepage.generaNumeroRandom(1,2);
        if (seleccionaInterior == 1){
            wait.until(ExpectedConditions.elementToBeClickable(inputNumberInterior)).sendKeys(numInterior);
        }else {
            System.out.println("El campo numero interior en la direccion se dejo vacio.");
        }
    }
    public void enterCodigoPostal(String postal){
        wait.until(ExpectedConditions.elementToBeClickable(inputCP)).sendKeys(postal);
    }
    public void selectColonia(){
        scrollDown(100);
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(lblColonia)).click();
        listSelectRandom(lblColonia);
    }
    public void validateCiudad(){
        String valorCiudad = campoCiudad.getAttribute("value");
        System.out.println(valorCiudad);
    }
    public void validateEstate(){
        String valueEstate = campoEDO.getAttribute("value");
        System.out.println(valueEstate);
    }
    public void selectSucursal(){
        scrollDown(200);
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(lblSucursal)).click();
        listSelectRandom(lblSucursal);
    }
    public void enterClienteRed(String zorroID){
        int seVaSeleccionar = basepage.generaNumeroRandom(1,3);
        if (seVaSeleccionar == 1){
            wait.until(ExpectedConditions.elementToBeClickable(inputZorroID)).sendKeys(zorroID);
        }
    }
    public void enterPass(String pass){
        wait.until(ExpectedConditions.elementToBeClickable(inputPass)).sendKeys(pass);
        wait.until(ExpectedConditions.elementToBeClickable(inputPassConfirmation)).sendKeys(pass);
    }
    public void selectTerminosAndPrivacity(){
        wait.until(ExpectedConditions.elementToBeClickable(btnTerminos)).click();
        wait.until(ExpectedConditions.elementToBeClickable(btnPrivacidad)).click();
    }
    public void registrar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnRegistrar)).click();
    }
}