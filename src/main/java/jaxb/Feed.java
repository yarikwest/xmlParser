
package jaxb;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{http://www.w3.org/2005/Atom}title"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}link"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}updated"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}entry" maxOccurs="unbounded"/>
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
    "title",
    "link",
    "updated",
    "entry"
})
@XmlRootElement(name = "feed", namespace = "http://www.w3.org/2005/Atom")
public class Feed {

    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    protected String title;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected Link link;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String updated;
    @XmlElement(namespace = "http://www.w3.org/2005/Atom", required = true)
    protected List<Entry> entry;

    /**
     * Gets the value of the title property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the link property.
     *
     * @return
     *     possible object is
     *     {@link Link }
     *
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     *
     * @param value
     *     allowed object is
     *     {@link Link }
     *
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the updated property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * Gets the value of the entry property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entry }
     *
     *
     */
    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entry>();
        }
        return this.entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}
