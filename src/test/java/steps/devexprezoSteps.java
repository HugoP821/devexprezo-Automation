package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.devexprezoPage;

public class devexprezoSteps {
    devexprezoPage devexprezo = new devexprezoPage();
    @Given("^El usuario navega a devexprezo$")
    public void navigateToExprezo(){
        devexprezo.navigateToDevexprezo();
    }
    @And("^Da click en registrarse$")
    public void selectRegister(){
        devexprezo.registerUser();
    }
    @And("^Ingresa el nombre de (.+)$")
    public void enterName(String name){
        devexprezo.enterName(name);
    }
    @And("^Ingresa apellidos (.+) (.+)$")
    public void enterLastName(String apellidoPaterno, String apellidoMaterno){
        devexprezo.enterLastName(apellidoPaterno, apellidoMaterno);
    }
    @And("^Ingresa fecha de nacimiento (.+) (.+) (.+)$")
    public void enterFechaNacimiento(String day, String month, String year){
        devexprezo.enterFechaNacimiento(day, month, year);
    }
    @And("^Ingresa telefono (.+)$")
    public void enterNumberOfPhone(String number){
        devexprezo.enterNumberPhone(number);
    }
    @And("^Ingresa email (.+)$")
    public void enterEmail(String email){
        devexprezo.enterEmail(email);
    }
    @And("^Ingresa calle (.+)$")
    public void enterStreet(String street){
        devexprezo.enterStreet(street);
    }
    @And("^Ingreso numero exterior (.+)$")
    public void enterNumberExterior(String numberExterior){
        devexprezo.enterNumberExterior(numberExterior);
    }
    @And("^Ingresa numero interior (.+)$")
    public void enterNumberInterior(String numberInterior){
        devexprezo.enterNumberInterior(numberInterior);
    }
    @And("^Ingresa codigo postal (.+)$")
    public void enterCodigoPostal(String postal){
        devexprezo.enterCodigoPostal(postal);
    }
    @And("^Selecciona colonia$")
    public void selectColonia(){
        devexprezo.selectColonia();
    }
    @And("^Validar ciudad$")
    public void validateCity(){
        devexprezo.validateCiudad();
    }
    @And("^Validar estado$")
    public void validateState(){
        devexprezo.validateEstate();
    }
    @And("^Ingresa sucursal")
    public void selectSucursal(){
        devexprezo.selectSucursal();
    }
    @And("^Ingresa numero de cliente red (.+)")
    public void enterClientRed(String zorroID){
        devexprezo.enterClienteRed(zorroID);
    }
    @And("^Ingresa contraseña (.+)")
    public void enterPass(String pass){
        devexprezo.enterPass(pass);
    }
    @And("^seleeciona los terminos y privacidad$")
    public void selectTermsPriv(){
        devexprezo.selectTerminosAndPrivacity();
    }
    @And("^envia los datos")
    public void sendData(){
        devexprezo.registrar();
    }
}