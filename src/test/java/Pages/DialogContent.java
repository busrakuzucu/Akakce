package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Hesap Aç")
    public WebElement hesapAc;

    @FindBy(css = "input[id='rnufn']")
    public WebElement nameInput;

    @FindBy(css = "input[id='rnufn']")
    public WebElement lastNameInput;

    @FindBy(css = "input[id='rnufn']")
    public WebElement email;

    @FindBy(css = "input[id='rnufn']")
    public WebElement confirmEmail;

    @FindBy(css = "input[id='rnufn']")
    public WebElement passwordRegister;

    @FindBy(css = "input[id='rnufn']")
    public WebElement confirmPassword;


    @FindBy(linkText = "Giriş Yap")
    public WebElement girisYapLink;

    @FindBy(id = "life")
    public WebElement eposta;

    @FindBy(id = "lifp")
    public WebElement password;

    @FindBy(css = "[value='Giriş yap'][type='submit']")
    public WebElement girisYapButton;

    @FindBy(css = "input[type='text']")
    public WebElement searchTextBox;

    @FindBy(css = "button[title='Ara']")
    public WebElement searchButton;

    @FindBy(css = "span[class='bt_v8']")
    public WebElement uruneGit;

    @FindBy(xpath = "(//span[@class='ufo_v8'])[1]")
    public WebElement takibeAl;

    @FindBy(linkText = "Çık")
    public WebElement cikButton;

    @FindBy(css = "div[class='pdt_v8']>h1")
    public WebElement productTitle;

    @FindBy(css="span[class='w_v8']>h3")
    public List<WebElement> trackingList;

    @FindBy(css="a[title='Takip Listem']")
    public WebElement takipIcon;
    @FindBy(linkText = "Busra")
    public WebElement hesabimIcon;

    @FindBy(css = "div[class='m-c']")
    public WebElement verify;

    public WebElement getWebElement(String element) {

        switch (element) {
            case "hesapAc": return hesapAc;
            case "searchTextBox":return searchTextBox;
            case "girisYapLink":return girisYapLink;
            case "eposta":return eposta;
            case "password":return password;
            case "girisYapButton":return girisYapButton;
            case "searchButton":return searchButton;
            case "uruneGit":return uruneGit;
            case "takibeAl":return takibeAl;
            case "takipIcon": return takipIcon;
        }
        return null;
    }

}
