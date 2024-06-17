package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class AddressPage extends BrowserDriver {
    // 28.05.2024
    public static String tamam_urun_stock_bitmistir_message_path = "/html/body/div[4]/div/div[6]/button[1]"; // tamam button for usbmp
    public static String urun_Stock_bitmistir_message_path = "/html/body/div[4]/div"; // This is added, to fully automate the code! :) 28.05.2024
    public static String success_message_path_FOR_DELIVERY_ADDRESS = "/html/body/div[4]/div/div[2]";
    public static String HOMEPAGE_invalid_TC_number_message_path = "//*[@id=\"txtAddTCKN-error\"]"; // not same as delivery address
    public static String HOMEPAGE_invalid_email_message_path = "//*[@id=\"txtAddEMail-error\"]"; // not same as delivery address
    public static String invalid_email_message_path = "//*[@id=\"frmAdressEkleme\"]/div[4]/div[1]/span";
    public static String invalid_TC_number_message_path = "//*[@id=\"divBireysel\"]/div/div[2]/span"; // This actually does not check if valid or not.
    // But this message is printed if you don't fully enter the TC number, or you don't enter TC number at all
    public static String go_to_address_selection_path = "/html/body/section[2]/div[2]/div[2]/div/a";
    public static String add_new_address_button = "/html/body/section[2]/div[2]/div[1]/div/a"; // This "adding new address" button is going to select address after you search and add to basket
    public static String address_title_path = "//*[@id=\"txtAddAdresBaslik\"]";
    public static String name_surname_path = "//*[@id=\"txtAddAdSoyad\"]";
    public static String tc_number_path = "//*[@id=\"txtAddTCKN\"]";
    public static String email_path = "//*[@id=\"txtAddEMail\"]";
    public static String phone_number_path = "//*[@id=\"txtAddTelefon\"]";
    public static String city_IZMIR_path = "//*[@id=\"drpAddSehir\"]/option[42]";
    public static String town_BORNOVA_path = "//*[@id=\"drpAddIlce\"]/option[8]";
    public static String address_path = "//*[@id=\"txtAddAdres\"]";
    public static String save_button_path = "//*[@id=\"frmAdressEkleme\"]/div[7]/button";
    public static String save_edited_address_button_path = "//*[@id=\"formAdresDuzenle\"]/div[7]/button";
    public static String edit_existed_address_path = "//*[@id=\"adresDiv\"]/div[1]/div[2]/div/div[1]/a[2]";
    public static String edit_tc_number_path = "//*[@id=\"txtEditTCKN\"]";
    public static String add_address_from_MY_ADDRESSES_path = "//*[@id=\"adresDiv\"]/div[1]/div[1]/a";
    public static void click_address_selection() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(go_to_address_selection_path)).click();
    }

    public static void click_add_new_address() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.xpath(add_new_address_button)).click();
    }

    public static void fill_address_title() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(address_title_path)).click();
        driver.findElement(By.xpath(address_title_path)).sendKeys("Address title");
    }

    public static void fill_name_surname() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(name_surname_path)).click();
        driver.findElement(By.xpath(name_surname_path)).sendKeys("John Doe");
    }

    public static void fill_TC_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(tc_number_path)).click();
        driver.findElement(By.xpath(tc_number_path)).sendKeys("11111111110"); // valid TC number
    }

    public static void fill_invalid_TC_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(tc_number_path)).click();
        driver.findElement(By.xpath(tc_number_path)).sendKeys("00000000001"); // invalid TC number
    }

    public static void fill_email() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(email_path)).click();
        driver.findElement(By.xpath(email_path)).sendKeys("valid@example.com"); // valid email
    }

    public static void fill_phone_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(phone_number_path)).click();
        driver.findElement(By.xpath(phone_number_path)).sendKeys("5356721982"); // random phone number
    }

    public static void select_city() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(city_IZMIR_path)).click();
    }

    public static void select_town() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(town_BORNOVA_path)).click();
    }

    public static void fill_address() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(address_path)).click();
        driver.findElement(By.xpath(address_path)).sendKeys("xyz");
    }

    public static void click_save() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(save_button_path)).click();
    }

    public static void click_save_edited_address() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(save_edited_address_button_path)).click();
    }

    public static void click_edit_existed_address() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(edit_existed_address_path)).click();
    }

    public static void change_TC_number_with_invalid_TC_number() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(edit_tc_number_path)).click();
        driver.findElement(By.xpath(edit_tc_number_path)).clear();
        driver.findElement(By.xpath(edit_tc_number_path)).sendKeys("00000000001"); // invalid TC number
    }

    public static void fill_Invalid_email() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(email_path)).click();
        driver.findElement(By.xpath(email_path)).sendKeys("invalid@-example.com"); // invalid email
    }

    public static void click_add_address_from_MyAddresses() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(add_address_from_MY_ADDRESSES_path)).click();
    }
}