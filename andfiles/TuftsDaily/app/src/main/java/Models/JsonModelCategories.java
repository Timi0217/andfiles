package Models;

/**
 * This class contains model requirements for data partaining categories on Tufts Daily
 * Created by Benard Ngaruiya on 11/8/2017.
 */

public class JsonModelCategories {
    private int categoryID;
    private String categoryName;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    private String categoryDescription;

}
