public class DrivingLicense {
    private String name;
    private String surname;
    private String street;
    private String postCode;
    private String city;
    private String licenseNum;
    private String issueYear;
    private String category;

    @Override
    public String toString() {
        return "Imie:  " + name.substring(0,1).toUpperCase() +name.substring(1) + " Nazwisko: " + surname +
         "\nUlica: " + street + "   Kod Pocztowy: " + postCode + "  Miejscowość: " + city +
         "\nNumer licencji: " + licenseNum + "  Rok wydania: " + issueYear + "  Kategoria:  " + category;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getStreet(){
        return street;
    }
    public String getPostCode(){
        return postCode;
    }
    public String getCity(){
        return city;
    }
    public String getLicenseNum(){
        return licenseNum;
    }
    public String getIssueYear(){
        return issueYear;
    }



    public void setName(String name){
    this.name= name;
}
public void setSurname(String surname){
    this.surname= surname;
}
public void setStreet(String street){
    this.street= street;
}
public void setPostCode(String postCode){
    this.postCode= postCode;
}
public void setCity(String city){
    this.city= city;
}
public void setLicenseNum(String licenseNum){
    this.licenseNum= licenseNum;
}
public void setIssueYear(String issueYear){
    this.issueYear= issueYear;
}
  

    public static void main(String[] args){
        DrivingLicense d1 = new DrivingLicense();
        d1.name = "Jan";
        d1.surname = "Kowalski";
        d1.street = "Poziomkowa";
        d1.postCode = "32-434";
        d1.city= "Kraków";
        d1.licenseNum = "D3ER112";
        d1.issueYear = "2019";
        d1.category= "B1";
        System.out.println(d1);

    }

}
