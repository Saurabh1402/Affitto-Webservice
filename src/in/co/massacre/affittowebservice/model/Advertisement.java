package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataCity;
import in.co.massacre.affittowebservice.model.metadata.MetadataLocality;
import in.co.massacre.affittowebservice.model.metadata.MetadataPincode;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by saurabh on 5/10/17.
 */

@Entity
@Table(name = AffittoContract.AdvertisementContract.TABLE_NAME)
@NamedQueries({
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_ALL_KEY,query = AffittoContract.AdvertisementContract.FIND_ALL_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_ID_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_ID_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_CITY_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_CITY_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_STATE_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_STATE_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_LOCALITY_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_LOCALITY_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_PINCODE_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_PINCODE_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_CONTACT_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_CONTACT_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_CATEGORY_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_CATEGORY_QUERY),
        @NamedQuery(name = AffittoContract.AdvertisementContract.FIND_BY_SUBCATEGORY_KEY,query = AffittoContract.AdvertisementContract.FIND_BY_SUBCATEGORY_QUERY)
})
public class Advertisement implements Serializable{
    private long _idPK;
    private String title;
    private double price;
    private String desc;
    private int TYPE;
    private Date dateCreated;
    private double LONGITUDE;
    private double LATITUDE;
    private AdStatus statusFK;
    private MetadataLocality adLocalityFK;
    private MetadataCity adCityFK;
    private MetadataState adStateFK;
    private MetadataPincode adPincodeFK;
    private AdContact contactFK;
    private AdCategory adCategoryFK;
    private AdSubCategory adSubCategoryFK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.AdvertisementContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.AdvertisementContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = AffittoContract.AdvertisementContract.PRICE)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name = AffittoContract.AdvertisementContract.DESC)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = AffittoContract.AdvertisementContract.TYPE)
    public int getTYPE() {
        return TYPE;
    }

    public void setTYPE(int TYPE) {
        this.TYPE = TYPE;
    }

    @Column(name = AffittoContract.AdvertisementContract.LONGITUDE)
    public double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    @Column(name = AffittoContract.AdvertisementContract.LATITUDE)
    public double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.AD_STATUS_FK,referencedColumnName = AffittoContract.AdStatusContract.ID_PK)
    public AdStatus getStatusFK() {
        return statusFK;
    }

    public void setStatusFK(AdStatus statusFK) {
        this.statusFK = statusFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.CONTACT_FK,referencedColumnName = AffittoContract.AdContactContract.ID_PK)
    public AdContact getContactFK() {
        return contactFK;
    }

    public void setContactFK(AdContact contactFK) {
        this.contactFK = contactFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.AD_CATEGORY_FK,referencedColumnName = AffittoContract.AdCategoryContract.ID_PK)
    public AdCategory getAdCategoryFK() {
        return adCategoryFK;
    }

    public void setAdCategoryFK(AdCategory adCategoryFK) {
        this.adCategoryFK = adCategoryFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.AD_SUB_CATEGORY_FK,referencedColumnName = AffittoContract.AdSubCategoryContract.ID_PK)
    public AdSubCategory getAdSubCategoryFK() {
        return adSubCategoryFK;
    }

    public void setAdSubCategoryFK(AdSubCategory adSubCategoryFK) {
        this.adSubCategoryFK = adSubCategoryFK;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = AffittoContract.AdvertisementContract.DATE_CREATED)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.METADATA_LOCALIY_FK,referencedColumnName = AffittoContract.Metadata_LocalityContract.ID_PK)
    public MetadataLocality getAdLocalityFK() {
        return adLocalityFK;
    }

    public void setAdLocalityFK(MetadataLocality metadataLocalityFK) {
        this.adLocalityFK = metadataLocalityFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.METADATA_CITY_FK,referencedColumnName = AffittoContract.Metadata_CityContract.ID_PK)
    public MetadataCity getAdCityFK() {
        return adCityFK;
    }

    public void setAdCityFK(MetadataCity adCItyFK) {
        this.adCityFK = adCItyFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.METADATA_STATE_FK,referencedColumnName = AffittoContract.Metadata_StateContract.ID_PK)
    public MetadataState getAdStateFK() {
        return adStateFK;
    }

    public void setAdStateFK(MetadataState adStateFK) {
        this.adStateFK = adStateFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdvertisementContract.METADATA_PINCODE_FK,referencedColumnName = AffittoContract.Metadata_PincodeContract.ID_PK)
    public MetadataPincode getAdPincodeFK() {
        return adPincodeFK;
    }

    public void setAdPincodeFK(MetadataPincode adPincodeFK) {
        this.adPincodeFK = adPincodeFK;
    }

}
