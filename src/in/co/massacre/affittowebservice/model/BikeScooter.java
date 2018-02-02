package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */

@Entity
@Table(name = AffittoContract.BikeScooterContract.TABLE_NAME)
public class BikeScooter implements Serializable {
    private long _idPK;
    private long kilometerDriven;
    private int yearOfRegistration;
    private Advertisement advertisement;
    private MetadataColor colorFK;
    private MetadataBikeScooterFuelType bikeScooterFuelTypeFK;
    private MetadataBikeScooterBrandName bikeScooterBrandNameFK;
    private MetadataBikeScooterModelName bikeScooterModelNameFK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.BikeScooterContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name=AffittoContract.BikeScooterContract.ADVERTISEMENT_FK,referencedColumnName = AffittoContract.AdvertisementContract.ID_PK)
    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    @Column(name = AffittoContract.BikeScooterContract.KM_DRIVEN)
    public long getKilometerDriven() {
        return kilometerDriven;
    }

    public void setKilometerDriven(long kilometerDriven) {
        this.kilometerDriven = kilometerDriven;
    }

    @Column(name = AffittoContract.BikeScooterContract.YR_OF_REG)
    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.BikeScooterContract.COLOR_FK,referencedColumnName = AffittoContract.Metadata_ColorContract.ID_PK)
    public MetadataColor getColorFK() {
        return colorFK;
    }

    public void setColorFK(MetadataColor colorFK) {
        this.colorFK = colorFK;
    }

    @ManyToOne
    @JoinColumn( name=AffittoContract.BikeScooterContract.BIKESCOOTER_FUELTYPE_FK,referencedColumnName = AffittoContract.Metadata_BikeScooterFuelTypeContract.ID_PK)
    public MetadataBikeScooterFuelType getBikeScooterFuelTypeFK() {
        return bikeScooterFuelTypeFK;
    }

    public void setBikeScooterFuelTypeFK(MetadataBikeScooterFuelType bikeScooterFuelTypeFK) {
        this.bikeScooterFuelTypeFK = bikeScooterFuelTypeFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.BikeScooterContract.BIKESCOOTER_BRANDNAME_FK,referencedColumnName = AffittoContract.Metadata_BikeScooterBrandNameContract.ID_PK)
    public MetadataBikeScooterBrandName getBikeScooterBrandNameFK() {
        return bikeScooterBrandNameFK;
    }

    public void setBikeScooterBrandNameFK(MetadataBikeScooterBrandName bikeScooterBrandNameFK) {
        this.bikeScooterBrandNameFK = bikeScooterBrandNameFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.BikeScooterContract.BIKESCOOTER_MODELNAME_FK,referencedColumnName = AffittoContract.Metadata_BikeScooterModelNameContract.ID_PK)
    public MetadataBikeScooterModelName getBikeScooterModelNameFK() {
        return bikeScooterModelNameFK;
    }

    public void setBikeScooterModelNameFK(MetadataBikeScooterModelName bikeScooterModelNameFK) {
        this.bikeScooterModelNameFK = bikeScooterModelNameFK;
    }
}
