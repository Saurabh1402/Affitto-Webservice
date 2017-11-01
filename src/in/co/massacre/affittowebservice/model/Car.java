package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.CarContract.TABLE_NAME)
public class Car implements Serializable{
    private long _idPK;
    private Advertisement advertisement;
    private long kilometerDriven;
    private int yearOfRegistration;
    private MetadataColor colorFK;
    private Date insuranceValidity;
    private MetadataCarFuelType carFuelTypFK;
    private MetadataCarBrandName carBrandNameFK;
    private MetadataCarModelName carModelNameFK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.CarContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name=AffittoContract.CarContract.ADVERTISEMENT_FK,referencedColumnName = AffittoContract.AdvertisementContract.ID_PK)
    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    @Column(name = AffittoContract.CarContract.KM_DRIVEN)
    public long getKilometerDriven() {
        return kilometerDriven;
    }

    public void setKilometerDriven(long kilometerDriven) {
        this.kilometerDriven = kilometerDriven;
    }

    @Column(name = AffittoContract.CarContract.YR_OF_REG)
    public int getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(int yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    @Column(name = AffittoContract.CarContract.INSURANCE_VALIDITY)
    @Temporal(TemporalType.DATE)
    public Date getInsuranceValidity() {
        return insuranceValidity;
    }

    public void setInsuranceValidity(Date insuranceValidity) {
        this.insuranceValidity = insuranceValidity;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CarContract.COLOR_FK,referencedColumnName = AffittoContract.Metadata_ColorContract.ID_PK)
    public MetadataColor getColorFK() {
        return colorFK;
    }

    public void setColorFK(MetadataColor colorFK) {
        this.colorFK = colorFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CarContract.CAR_FUELTYPE_FK,referencedColumnName = AffittoContract.Metadata_CarFuelTypeContract.ID_PK)
    public MetadataCarFuelType getCarFuelTypFK() {
        return carFuelTypFK;
    }

    public void setCarFuelTypFK(MetadataCarFuelType carFuelTypFK) {
        this.carFuelTypFK = carFuelTypFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CarContract.CAR_BRANDNAME_FK,referencedColumnName = AffittoContract.Metadata_CarBrandNameContract.ID_PK)
    public MetadataCarBrandName getCarBrandNameFK() {
        return carBrandNameFK;
    }

    public void setCarBrandNameFK(MetadataCarBrandName carBrandNameFK) {
        this.carBrandNameFK = carBrandNameFK;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.CarContract.CAR_MODELNAME_FK,referencedColumnName = AffittoContract.Metadata_CarModelNameContract.ID_PK)
    public MetadataCarModelName getCarModelNameFK() {
        return carModelNameFK;
    }

    public void setCarModelNameFK(MetadataCarModelName carModeNameFK) {
        this.carModelNameFK = carModeNameFK;
    }
}
