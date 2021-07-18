package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private String itemId;
    private String description;
    private String category;
    private String subCategory;
    private String itemUrl;

    public String getItemId() {
        return itemId;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }
}
