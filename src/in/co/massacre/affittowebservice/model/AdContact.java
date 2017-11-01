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
@Table(name = AffittoContract.AdContactContract.TABLE_NAME)
public class AdContact implements Serializable{
    private long _idPK;
    private String name;
    private String email;
    private String mobile;
    private String privacy;
    private Date dateCreated;
    private MetadataLocality metadataLocalityFK;
    private MetadataCity adCityFK;
    private MetadataState adStateFK;
    private MetadataPincode adPincodeFK;
    private String profilephoto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.AdContactContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }


    @Column(name = AffittoContract.AdContactContract.NAME)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = AffittoContract.AdContactContract.EMAIL)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = AffittoContract.AdContactContract.MOBILE)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Column(name = AffittoContract.AdContactContract.PRIVACY)
    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = AffittoContract.AdContactContract.DATE_CREATED)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = AffittoContract.AdContactContract.PROFILE_PHOTO_FK)
    public String getProfilephoto() {
        return profilephoto;
    }

    public void setProfilephoto(String profilephoto) {
        this.profilephoto = profilephoto;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdContactContract.METADATA_LOCALIY_FK,referencedColumnName = AffittoContract.Metadata_LocalityContract.ID_PK)
    public MetadataLocality getMetadataLocalityFK() {
        return metadataLocalityFK;
    }

    public void setMetadataLocalityFK(MetadataLocality metadataLocalityFK) {
        this.metadataLocalityFK = metadataLocalityFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdContactContract.METADATA_CITY_FK,referencedColumnName = AffittoContract.Metadata_CityContract.ID_PK)
    public MetadataCity getAdCityFK() {
        return adCityFK;
    }

    public void setAdCityFK(MetadataCity adCItyFK) {
        this.adCityFK = adCItyFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdContactContract.METADATA_STATE_FK,referencedColumnName = AffittoContract.Metadata_StateContract.ID_PK)
    public MetadataState getAdStateFK() {
        return adStateFK;
    }

    public void setAdStateFK(MetadataState adStateFK) {
        this.adStateFK = adStateFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.AdContactContract.METADATA_PINCODE_FK,referencedColumnName = AffittoContract.Metadata_PincodeContract.ID_PK)
    public MetadataPincode getAdPincodeFK() {
        return adPincodeFK;
    }

    public void setAdPincodeFK(MetadataPincode adPincodeFK) {
        this.adPincodeFK = adPincodeFK;
    }

}
