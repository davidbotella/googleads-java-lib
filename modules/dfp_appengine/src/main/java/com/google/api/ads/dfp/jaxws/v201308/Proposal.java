
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Proposal} represents an agreement between an interactive
 *             advertising seller and a buyer that specifies the details of an
 *             advertising campaign.
 *           
 * 
 * <p>Java class for Proposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201308}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201308}DateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalStatus" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="advertiser" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalCompanyAssociation" minOccurs="0"/>
 *         &lt;element name="agencies" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalCompanyAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="probabilityToClose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="billingCap" type="{https://www.google.com/apis/ads/publisher/v201308}BillingCap" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{https://www.google.com/apis/ads/publisher/v201308}BillingSchedule" minOccurs="0"/>
 *         &lt;element name="billingSource" type="{https://www.google.com/apis/ads/publisher/v201308}BillingSource" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budget" type="{https://www.google.com/apis/ads/publisher/v201308}Money" minOccurs="0"/>
 *         &lt;element name="primarySalesperson" type="{https://www.google.com/apis/ads/publisher/v201308}SalespersonSplit" minOccurs="0"/>
 *         &lt;element name="secondarySalespeople" type="{https://www.google.com/apis/ads/publisher/v201308}SalespersonSplit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesPlannerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryTraffickerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="secondaryTraffickerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedTeamIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201308}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advertiserDiscount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalDiscount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="additionalAdjustment" type="{https://www.google.com/apis/ads/publisher/v201308}Money" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refreshExchangeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agencyCommission" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueAddedTax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="approvalWorkflowActionIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal", propOrder = {
    "id",
    "name",
    "startDateTime",
    "endDateTime",
    "status",
    "isArchived",
    "advertiser",
    "agencies",
    "probabilityToClose",
    "billingCap",
    "billingSchedule",
    "billingSource",
    "poNumber",
    "notes",
    "budget",
    "primarySalesperson",
    "secondarySalespeople",
    "salesPlannerIds",
    "primaryTraffickerId",
    "secondaryTraffickerIds",
    "appliedTeamIds",
    "customFieldValues",
    "appliedLabels",
    "effectiveAppliedLabels",
    "advertiserDiscount",
    "proposalDiscount",
    "additionalAdjustment",
    "exchangeRate",
    "refreshExchangeRate",
    "agencyCommission",
    "valueAddedTax",
    "approvalWorkflowActionIds",
    "approvalStatus"
})
public class Proposal {

    protected Long id;
    protected String name;
    protected DateTime startDateTime;
    protected DateTime endDateTime;
    protected ProposalStatus status;
    protected Boolean isArchived;
    protected ProposalCompanyAssociation advertiser;
    protected List<ProposalCompanyAssociation> agencies;
    protected Integer probabilityToClose;
    protected BillingCap billingCap;
    protected BillingSchedule billingSchedule;
    protected BillingSource billingSource;
    protected String poNumber;
    protected String notes;
    protected Money budget;
    protected SalespersonSplit primarySalesperson;
    protected List<SalespersonSplit> secondarySalespeople;
    @XmlElement(type = Long.class)
    protected List<Long> salesPlannerIds;
    protected Long primaryTraffickerId;
    @XmlElement(type = Long.class)
    protected List<Long> secondaryTraffickerIds;
    @XmlElement(type = Long.class)
    protected List<Long> appliedTeamIds;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Long advertiserDiscount;
    protected Long proposalDiscount;
    protected Money additionalAdjustment;
    protected Long exchangeRate;
    protected Boolean refreshExchangeRate;
    protected Long agencyCommission;
    protected Long valueAddedTax;
    @XmlElement(type = Long.class)
    protected List<Long> approvalWorkflowActionIds;
    protected ProposalApprovalStatus approvalStatus;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalStatus }
     *     
     */
    public ProposalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalStatus }
     *     
     */
    public void setStatus(ProposalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the advertiser property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalCompanyAssociation }
     *     
     */
    public ProposalCompanyAssociation getAdvertiser() {
        return advertiser;
    }

    /**
     * Sets the value of the advertiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalCompanyAssociation }
     *     
     */
    public void setAdvertiser(ProposalCompanyAssociation value) {
        this.advertiser = value;
    }

    /**
     * Gets the value of the agencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalCompanyAssociation }
     * 
     * 
     */
    public List<ProposalCompanyAssociation> getAgencies() {
        if (agencies == null) {
            agencies = new ArrayList<ProposalCompanyAssociation>();
        }
        return this.agencies;
    }

    /**
     * Gets the value of the probabilityToClose property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProbabilityToClose() {
        return probabilityToClose;
    }

    /**
     * Sets the value of the probabilityToClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProbabilityToClose(Integer value) {
        this.probabilityToClose = value;
    }

    /**
     * Gets the value of the billingCap property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCap }
     *     
     */
    public BillingCap getBillingCap() {
        return billingCap;
    }

    /**
     * Sets the value of the billingCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCap }
     *     
     */
    public void setBillingCap(BillingCap value) {
        this.billingCap = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSchedule }
     *     
     */
    public BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSchedule }
     *     
     */
    public void setBillingSchedule(BillingSchedule value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the billingSource property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSource }
     *     
     */
    public BillingSource getBillingSource() {
        return billingSource;
    }

    /**
     * Sets the value of the billingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSource }
     *     
     */
    public void setBillingSource(BillingSource value) {
        this.billingSource = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBudget(Money value) {
        this.budget = value;
    }

    /**
     * Gets the value of the primarySalesperson property.
     * 
     * @return
     *     possible object is
     *     {@link SalespersonSplit }
     *     
     */
    public SalespersonSplit getPrimarySalesperson() {
        return primarySalesperson;
    }

    /**
     * Sets the value of the primarySalesperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalespersonSplit }
     *     
     */
    public void setPrimarySalesperson(SalespersonSplit value) {
        this.primarySalesperson = value;
    }

    /**
     * Gets the value of the secondarySalespeople property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondarySalespeople property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondarySalespeople().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalespersonSplit }
     * 
     * 
     */
    public List<SalespersonSplit> getSecondarySalespeople() {
        if (secondarySalespeople == null) {
            secondarySalespeople = new ArrayList<SalespersonSplit>();
        }
        return this.secondarySalespeople;
    }

    /**
     * Gets the value of the salesPlannerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesPlannerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPlannerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSalesPlannerIds() {
        if (salesPlannerIds == null) {
            salesPlannerIds = new ArrayList<Long>();
        }
        return this.salesPlannerIds;
    }

    /**
     * Gets the value of the primaryTraffickerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryTraffickerId() {
        return primaryTraffickerId;
    }

    /**
     * Sets the value of the primaryTraffickerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryTraffickerId(Long value) {
        this.primaryTraffickerId = value;
    }

    /**
     * Gets the value of the secondaryTraffickerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryTraffickerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryTraffickerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSecondaryTraffickerIds() {
        if (secondaryTraffickerIds == null) {
            secondaryTraffickerIds = new ArrayList<Long>();
        }
        return this.secondaryTraffickerIds;
    }

    /**
     * Gets the value of the appliedTeamIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedTeamIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedTeamIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAppliedTeamIds() {
        if (appliedTeamIds == null) {
            appliedTeamIds = new ArrayList<Long>();
        }
        return this.appliedTeamIds;
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

    /**
     * Gets the value of the appliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getAppliedLabels() {
        if (appliedLabels == null) {
            appliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.appliedLabels;
    }

    /**
     * Gets the value of the effectiveAppliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveAppliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getEffectiveAppliedLabels() {
        if (effectiveAppliedLabels == null) {
            effectiveAppliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.effectiveAppliedLabels;
    }

    /**
     * Gets the value of the advertiserDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }

    /**
     * Sets the value of the advertiserDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserDiscount(Long value) {
        this.advertiserDiscount = value;
    }

    /**
     * Gets the value of the proposalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalDiscount() {
        return proposalDiscount;
    }

    /**
     * Sets the value of the proposalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalDiscount(Long value) {
        this.proposalDiscount = value;
    }

    /**
     * Gets the value of the additionalAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAdditionalAdjustment() {
        return additionalAdjustment;
    }

    /**
     * Sets the value of the additionalAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAdditionalAdjustment(Money value) {
        this.additionalAdjustment = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeRate(Long value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the refreshExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshExchangeRate() {
        return refreshExchangeRate;
    }

    /**
     * Sets the value of the refreshExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshExchangeRate(Boolean value) {
        this.refreshExchangeRate = value;
    }

    /**
     * Gets the value of the agencyCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgencyCommission() {
        return agencyCommission;
    }

    /**
     * Sets the value of the agencyCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgencyCommission(Long value) {
        this.agencyCommission = value;
    }

    /**
     * Gets the value of the valueAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueAddedTax() {
        return valueAddedTax;
    }

    /**
     * Sets the value of the valueAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueAddedTax(Long value) {
        this.valueAddedTax = value;
    }

    /**
     * Gets the value of the approvalWorkflowActionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalWorkflowActionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalWorkflowActionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getApprovalWorkflowActionIds() {
        if (approvalWorkflowActionIds == null) {
            approvalWorkflowActionIds = new ArrayList<Long>();
        }
        return this.approvalWorkflowActionIds;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalApprovalStatus }
     *     
     */
    public ProposalApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalApprovalStatus }
     *     
     */
    public void setApprovalStatus(ProposalApprovalStatus value) {
        this.approvalStatus = value;
    }

}
