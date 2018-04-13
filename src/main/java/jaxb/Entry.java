
package jaxb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://base.google.com/ns/1.0}id"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}title"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}google_product_category"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}product_type"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}link"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}image_link"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}additional_image_link" minOccurs="0"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}condition"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}availability"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}price"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}gtin"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}mpn"/>
 *         &lt;element ref="{http://base.google.com/ns/1.0}brand"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "title",
    "googleProductCategory",
    "productType",
    "link",
    "imageLink",
    "additionalImageLink",
    "condition",
    "availability",
    "price",
    "gtin",
    "mpn",
    "brand"
})
@Entity
@Table(name = "entrys")
@XmlRootElement(name = "entry", namespace = "http://www.w3.org/2005/Atom")
public class Entry {

    @Id
    @Column(name = "id")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    protected String id;

    @Column(name = "title")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String title;

    @Column(name = "googleProductCategory")
    @XmlElement(name = "google_product_category", namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String googleProductCategory;

    @Column(name = "productType")
    @XmlElement(name = "product_type", namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String productType;

    @Column(name = "link")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String link;

    @Column(name = "imageLink")
    @XmlElement(name = "image_link", namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String imageLink;

    @Column(name = "additionalImageLink")
    @XmlElement(name = "additional_image_link", namespace = "http://base.google.com/ns/1.0")
    @XmlSchemaType(name = "anyURI")
    protected String additionalImageLink;

    @Column(name = "condition")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String condition;

    @Column(name = "availability")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    protected String availability;

    @Column(name = "price")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    protected String price;

    @Column(name = "gtin")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String gtin;

    @Column(name = "mpn")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String mpn;

    @Column(name = "brand")
    @XmlElement(namespace = "http://base.google.com/ns/1.0", required = true)
    protected String brand;


    public String getId() {
        return id;
    }
    public void setId(String value) {
        this.id = value;
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
