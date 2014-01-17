
package com.google.api.ads.dfp.jaxws.v201302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a user of the system.
 *             <p>
 *             Users may be assigned at most one {@link Role} per network. Each role
 *             provides a user with permissions to perform specific operations. Without a
 *             role, they will not be able to perform any actions.
 *             </p>
 *           
 * 
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201302}UserRecord">
 *       &lt;sequence>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEmailNotificationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ordersUiLocalTimeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201302}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "isActive",
    "isEmailNotificationAllowed",
    "ordersUiLocalTimeZoneId",
    "customFieldValues"
})
public class User
    extends UserRecord
{

    protected Boolean isActive;
    protected Boolean isEmailNotificationAllowed;
    protected String ordersUiLocalTimeZoneId;
    protected List<BaseCustomFieldValue> customFieldValues;

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isEmailNotificationAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEmailNotificationAllowed() {
        return isEmailNotificationAllowed;
    }

    /**
     * Sets the value of the isEmailNotificationAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmailNotificationAllowed(Boolean value) {
        this.isEmailNotificationAllowed = value;
    }

    /**
     * Gets the value of the ordersUiLocalTimeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersUiLocalTimeZoneId() {
        return ordersUiLocalTimeZoneId;
    }

    /**
     * Sets the value of the ordersUiLocalTimeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersUiLocalTimeZoneId(String value) {
        this.ordersUiLocalTimeZoneId = value;
    }

    /**
     * Gets the value of the customFieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseCustomFieldValue }
     * 
     * 
     */
    public List<BaseCustomFieldValue> getCustomFieldValues() {
        if (customFieldValues == null) {
            customFieldValues = new ArrayList<BaseCustomFieldValue>();
        }
        return this.customFieldValues;
    }

}
