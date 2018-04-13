package database;

import jaxb.Entry;

import javax.persistence.*;

@Entity
@Table(name = "entrys")
public class EntryPOJO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "id_entry")
    private String id_entry;

    @Column(name = "title")
    private String title;

    @Column(name = "googleProductCategory")
    private String googleProductCategory;

    @Column(name = "productType")
    private String productType;

    @Column(name = "link")
    private String link;

    @Column(name = "imageLink")
    private String imageLink;

    @Column(name = "additionalImageLink")
    private String additionalImageLink;

    @Column(name = "condition_")
    private String condition;

    @Column(name = "availability")
    private String availability;

    @Column(name = "price")
    private String price;

    @Column(name = "gtin")
    private String gtin;

    @Column(name = "mpn")
    private String mpn;

    @Column(name = "brand")
    private String brand;

    public EntryPOJO(){ }

    public EntryPOJO(Entry entry){
        id_entry = entry.getId();
        title = entry.getTitle();
        googleProductCategory = entry.getGoogleProductCategory();
        productType = entry.getProductType();
        link = entry.getLink();
        imageLink = entry.getImageLink();
        additionalImageLink = entry.getAdditionalImageLink();
        condition = entry.getCondition();
        availability = entry.getAvailability();
        price = entry.getPrice();
        gtin = entry.getGtin();
        mpn = entry.getMpn();
        brand = entry.getBrand();
    }

    public int getId() {
        return id;
    }
    public void setId(int value) {
        this.id = value;
    }

    public String getId_entry() {
        return id_entry;
    }
    public void setId_entry(String id_entry) {
        this.id_entry = id_entry;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String value) {
        this.title = value;
    }
    public String getGoogleProductCategory() {
        return googleProductCategory;
    }
    public void setGoogleProductCategory(String value) {
        this.googleProductCategory = value;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String value) {
        this.productType = value;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String value) {
        this.link = value;
    }
    public String getImageLink() {
        return imageLink;
    }
    public void setImageLink(String value) {
        this.imageLink = value;
    }
    public String getAdditionalImageLink() {
        return additionalImageLink;
    }
    public void setAdditionalImageLink(String value) {
        this.additionalImageLink = value;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String value) {
        this.condition = value;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String value) {
        this.availability = value;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String value) {
        this.price = value;
    }
    public String getGtin() {
        return gtin;
    }
    public void setGtin(String value) {
        this.gtin = value;
    }
    public String getMpn() {
        return mpn;
    }
    public void setMpn(String value) {
        this.mpn = value;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String value) {
        this.brand = value;
    }
}
