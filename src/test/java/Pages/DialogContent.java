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

    @FindBy(css = "div[class='graph_w'] span")
    public WebElement takibeAl;

    @FindBy(linkText = "Çık")
    public WebElement cikButton;

    @FindBy(css = "div[class='pdt_v8']>h1")
    public WebElement productTitle;

    @FindBy(css="span[class='w_v8']>h3")
    public List<WebElement> trackingList;

    @FindBy(css="a[title='Takip Listem']")
    public WebElement takipIcon;
    @FindBy(linkText = "Büşra")
    public WebElement hesabimIcon;

    public WebElement getWebElement(String element) {

        switch (element) {
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
