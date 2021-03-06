
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ContentMetadataKeyHierarchy} objects.
 *             
 *             @param contentMetadataKeyHierarchies the hierarchies to update
 *             @return the updated hierarchies
 *             @throws ApiException if there is an error updating the one of the hierarchies
 *           
 * 
 * <p>Java class for updateContentMetadataKeyHierarchies element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateContentMetadataKeyHierarchies">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="contentMetadataKeyHierarchies" type="{https://www.google.com/apis/ads/publisher/v201408}ContentMetadataKeyHierarchy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contentMetadataKeyHierarchies"
})
@XmlRootElement(name = "updateContentMetadataKeyHierarchies")
public class ContentMetadataKeyHierarchyServiceInterfaceupdateContentMetadataKeyHierarchies {

    protected List<ContentMetadataKeyHierarchy> contentMetadataKeyHierarchies;

    /**
     * Gets the value of the contentMetadataKeyHierarchies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentMetadataKeyHierarchies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentMetadataKeyHierarchies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentMetadataKeyHierarchy }
     * 
     * 
     */
    public List<ContentMetadataKeyHierarchy> getContentMetadataKeyHierarchies() {
        if (contentMetadataKeyHierarchies == null) {
            contentMetadataKeyHierarchies = new ArrayList<ContentMetadataKeyHierarchy>();
        }
        return this.contentMetadataKeyHierarchies;
    }

}
