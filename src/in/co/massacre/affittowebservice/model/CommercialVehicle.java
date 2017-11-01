package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.CommercialVehicleContract.TABLE_NAME)
public class CommercialVehicle implements Serializable {
    private long _idPK;
    private int yearOfRegistration;
    private Advertisement advertisement;
    private MetadataCommercialVehicleType commercialVehicleTypeFK;
    private MetadataCommercialVehicleFuelType commercialVehicleFuelTypeFK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.CommercialVehicleContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name=AffittoContract.CommercialVehicleContract.ADVERTISEMENT_FK,referencedColumnName = AffittoContract.AdvertisementContract.ID_PK)
    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    @Column(name = AffittoContract.CommercialVehicleContract.YR_OF_REG)
    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CommercialVehicleContract.COMMERCIAL_VEHICLE_TYPE_FK,referencedColumnName = AffittoContract.Metadata_CommercialVehicleTypeContract.ID_PK)
    public MetadataCommercialVehicleType getCommercialVehicleTypeFK() {
        return commercialVehicleTypeFK;
    }

    public void setCommercialVehicleTypeFK(MetadataCommercialVehicleType commercialVehicleTypeFK) {
        this.commercialVehicleTypeFK = commercialVehicleTypeFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CommercialVehicleContract.COMMERCIAL_VEHICLE_FUELTYPE_FK,referencedColumnName = AffittoContract.Metadata_CommercialVehicleFuelTypeContract.ID_PK)
    public MetadataCommercialVehicleFuelType getCommercialVehicleFuelTypeFK() {
        return commercialVehicleFuelTypeFK;
    }

    public void setCommercialVehicleFuelTypeFK(MetadataCommercialVehicleFuelType commercialVehicleFuelTypeFK) {
        this.commercialVehicleFuelTypeFK = commercialVehicleFuelTypeFK;
    }
}
