package core.pages;

import core.panels.ShopCategoriesPanel;
import org.openqa.selenium.WebDriver;

public class SportcheckMainPage extends AbstractPage {

    private static final String SHOP_CATEGORIES_PANEL = "//nav[contains(@class, 'page-nav')]";
    private static final String EXPAND_SHOP_CATEGORIES_PANEL_BUTTON = "//button[@class='menu-toggle']";

    public SportcheckMainPage(final WebDriver driver) {
        super(driver);
    }

    public void expandShopCategoriesPanel(){
        findBy(EXPAND_SHOP_CATEGORIES_PANEL_BUTTON).then().click();
    }

    public ShopCategoriesPanel getShopCategoriesPanel() {

        return new ShopCategoriesPanel(findBy(SHOP_CATEGORIES_PANEL), this);
    }
}
