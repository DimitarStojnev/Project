package uni.pu.fmi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    @Given("Потребител с ID {int} е в системата")
    public void userWithIdInSystem(Integer userId) {
        System.out.println("Check if user with ID " + userId + " is in the system");
    }
    @When("Добави продукти {string} към количката")
    public void addProductsInCart(String products) {
        System.out.println("Add products: " + products + " to cart");
    }
    @When("Натисне бутона {string}")
    public void pressButton(String button) {
        System.out.println("Press button: " + button);
    }
    @Then("Създава се нова поръчка със статус {string}")
    public void newOrderCreatedWithStatus(String status) {
        System.out.println("Check new order with status: " + status);
    }
    @Then("Потребителят вижда съобщение {string}")
    public void userSeesMessage(String message) {
        System.out.println("Check user sees message: " + message);
    }

    @Given("Потребител с ID {int} има предишни поръчки")
    public void userHasPreviousOrders(Integer userId) {
        System.out.println("User with ID " + userId + " has previous orders");
    }
    @When("Отвори секцията {string}")
    public void openSection(String section) {
        System.out.println("Open section: " + section);
    }
    @Then("Вижда списък с предишни поръчки и статуси")
    public void seesListOfPreviousOrders() {
        System.out.println("Check list of previous orders and statuses");
    }

    @Given("Потребител с ID {int} има поръчки с различни статуси")
    public void userHasOrdersWithDifferentStatuses(Integer userId) {
        System.out.println("User with ID " + userId + " has orders with different statuses");
    }
    @When("Избере филтър {string}")
    public void selectFilter(String filter) {
        System.out.println("Select filter: " + filter);
    }
    @Then("Вижда само поръчките със статус {string}")
    public void seesOnlyOrdersWithStatus(String status) {
        System.out.println("Check only orders with status: " + status);
    }

    @Given("Нов потребител без предишни поръчки")
    public void newUserWithoutPreviousOrders() {
        System.out.println("New user with no previous orders");
    }
    @Then("Вижда съобщение {string}")
    public void seesMessage(String message) {
        System.out.println("Check sees message: " + message);
    }

    @When("Въведе оценка {int} и празен коментар")
    public void enterRatingAndEmptyComment(Integer rating) {
        System.out.println("Enter rating: " + rating + " with empty comment");
    }

    @Given("Продукт с ID {int} има {int} ревюта")
    public void productHasReviews(Integer productId, Integer reviewCount) {
        System.out.println("Product ID " + productId + " has " + reviewCount + " reviews");
    }
    @When("Потребителят отвори страницата на продукта")
    public void userOpensProductPage() {
        System.out.println("User opens product page");
    }
    @Then("Вижда списък с ревюта и оценки")
    public void seesListOfReviewsAndRatings() {
        System.out.println("Check list of reviews and ratings");
    }

    @Given("Администратор с ID {int} е в панела")
    public void adminInPanel(Integer adminId) {
        System.out.println("Admin with ID " + adminId + " is in panel");
    }
    @When("Избере ревю с ID {int}")
    public void selectReviewWithId(Integer reviewId) {
        System.out.println("Select review with ID: " + reviewId);
    }
    @When("Натисне {string}")
    public void press(String button) {
        System.out.println("Press: " + button);
    }
    @Then("Ревюто се премахва от системата")
    public void reviewRemovedFromSystem() {
        System.out.println("Check review is removed");
    }

    @Given("Потребител с ID {int} е закупил продукт с ID {int}")
    public void userPurchasedProduct(Integer userId, Integer productId) {
        System.out.println("User ID " + userId + " purchased product ID " + productId);
    }

    @Given("Администратор с ID {int} избира продукт с ID {int}")
    public void adminSelectsProduct(Integer adminId, Integer productId) {
        System.out.println("Admin ID " + adminId + " selects product ID " + productId);
    }
    @When("Променя цената на {string}")
    public void changePriceTo(String price) {
        System.out.println("Change price to: " + price);
    }
    @Then("Продуктът се обновява успешно")
    public void productUpdatedSuccessfully() {
        System.out.println("Check product updated successfully");
    }


    @When("Въведе оценка {int} и коментар {string}")
    public void enterRatingAndComment(Integer rating, String comment) {
        System.out.println("Enter rating: " + rating + " and comment: " + comment);
    }
    @Then("Ревюто се записва и е видимо към продукта")
    public void reviewSavedAndVisible() {
        System.out.println("Check review saved and visible");
    }


    @When("Въведе празно име за продукт")
    public void enterEmptyProductName() {
        System.out.println("Enter empty product name");
    }

    @Given("Продукт с ID {int} има наличност {int}")
    public void productHasStock(Integer productId, Integer stock) {
        System.out.println("Product ID " + productId + " has stock: " + stock);
    }
    @When("Системата проверява списъка с продукти")
    public void systemChecksProductList() {
        System.out.println("System checks product list");
    }
    @Then("Продуктът не се показва в потребителския интерфейс")
    public void productNotVisibleInUI() {
        System.out.println("Check product not visible in UI");
    }

    @Given("Потребител въвежда ключова дума {string}")
    public void userEntersKeyword(String keyword) {
        System.out.println("User enters keyword: " + keyword);
    }
    @Then("Вижда списък с продукти, съдържащи думата {string}")
    public void seesProductListWithWord(String word) {
        System.out.println("Check product list contains word: " + word);
    }

    @Given("Администратор с ID {int} е в админ панела")
    public void adminInAdminPanel(Integer adminId) {
        System.out.println("Admin with ID " + adminId + " is in admin panel");
    }
    @When("Въведе продукт: {string}, описание {string}, цена {double}, наличност {int}, категория {string}")
    public void enterProductDetails(String name, String description, Double price, Integer stock, String category) {
        System.out.println("Enter product: " + name + ", description: " + description + ", price: " + price +
                ", stock: " + stock + ", category: " + category);
    }
    @Then("Продуктът се запазва успешно")
    public void productSavedSuccessfully() {
        System.out.println("Check product saved successfully");
    }

    @Then("Появява се съобщение {string}")
    public void a_message_appears(String expectedMessage) {
        System.out.println("Check that the message appears: " + expectedMessage);
    }
}
