
package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import java.math.BigInteger;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GoogleProductCategory_QNAME = new QName("http://base.google.com/ns/1.0", "google_product_category");
    private final static QName _Brand_QNAME = new QName("http://base.google.com/ns/1.0", "brand");
    private final static QName _Id_QNAME = new QName("http://base.google.com/ns/1.0", "id");
    private final static QName _Price_QNAME = new QName("http://base.google.com/ns/1.0", "price");
    private final static QName _ProductType_QNAME = new QName("http://base.google.com/ns/1.0", "product_type");
    private final static QName _Condition_QNAME = new QName("http://base.google.com/ns/1.0", "condition");
    private final static QName _Title_QNAME = new QName("http://base.google.com/ns/1.0", "title");
    private final static QName _Availability_QNAME = new QName("http://base.google.com/ns/1.0", "availability");
    private final static QName _AdditionalImageLink_QNAME = new QName("http://base.google.com/ns/1.0", "additional_image_link");
    private final static QName _Link_QNAME = new QName("http://base.google.com/ns/1.0", "link");
    private final static QName _Updated_QNAME = new QName("http://www.w3.org/2005/Atom", "updated");
    private final static QName _ImageLink_QNAME = new QName("http://base.google.com/ns/1.0", "image_link");
    private final static QName _Gtin_QNAME = new QName("http://base.google.com/ns/1.0", "gtin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Feed }
     * 
     */
    public Feed createFeed() {
        return new Feed();
    }


    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "google_product_category")
    public JAXBElement<String> createGoogleProductCategory(String value) {
        return new JAXBElement<String>(_GoogleProductCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "brand")
    public JAXBElement<String> createBrand(String value) {
        return new JAXBElement<String>(_Brand_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "price")
    public JAXBElement<String> createPrice(String value) {
        return new JAXBElement<String>(_Price_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "product_type")
    public JAXBElement<String> createProductType(String value) {
        return new JAXBElement<String>(_ProductType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "condition")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCondition(String value) {
        return new JAXBElement<String>(_Condition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "availability")
    public JAXBElement<String> createAvailability(String value) {
        return new JAXBElement<String>(_Availability_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "additional_image_link")
    public JAXBElement<String> createAdditionalImageLink(String value) {
        return new JAXBElement<String>(_AdditionalImageLink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "link")
    public JAXBElement<String> createLink(String value) {
        return new JAXBElement<String>(_Link_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2005/Atom", name = "updated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUpdated(String value) {
        return new JAXBElement<String>(_Updated_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "image_link")
    public JAXBElement<String> createImageLink(String value) {
        return new JAXBElement<String>(_ImageLink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://base.google.com/ns/1.0", name = "gtin")
    public JAXBElement<String> createGtin(String value) {
        return new JAXBElement<String>(_Gtin_QNAME, String.class, null, value);
    }

}
