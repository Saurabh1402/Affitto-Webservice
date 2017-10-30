package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.CarContract.TABLE_NAME)
public class Car implements Serializable{
    private long _idPK;
    private long kilometerDriven;
    private int yearOfRegistration;
    private MetadataColor colorFK;
    private MetadataCarFuelType carFuelTypFK;
    private MetadataCarBrandName carBrandNameFK;
    private MetadataCarModelName carModeNameFK;
    @Id
    @Column(name = AffittoContract.CarContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
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

    @ManyToOne
    @JoinColumn(name = AffittoContract.Metadata_ColorContract.ID_PK)
    public MetadataColor getColorFK() {
        return colorFK;
    }

    public void setColorFK(MetadataColor colorFK) {
        this.colorFK = colorFK;
    }

    @ManyToOne
    @JoinColumn(name = AffittoContract.Metadata_CarFuelTypeContract.ID_PK)
    public MetadataCarFuelType getCarFuelTypFK() {
        return carFuelTypFK;
    }

    public void setCarFuelTypFK(MetadataCarFuelType carFuelTypFK) {
        this.carFuelTypFK = carFuelTypFK;
    }

    @ManyToOne
    @JoinColumn(name = AffittoContract.Metadata_CarBrandNameContract.ID_PK)
    public MetadataCarBrandName getCarBrandNameFK() {
        return carBrandNameFK;
    }

    public void setCarBrandNameFK(MetadataCarBrandName carBrandNameFK) {
        this.carBrandNameFK = carBrandNameFK;
    }

    @ManyToOne
    @Column(name = AffittoContract.Metadata_CarModelNameContract.ID_PK)
    public MetadataCarModelName getCarModeNameFK() {
        return carModeNameFK;
    }

    public void setCarModeNameFK(MetadataCarModelName carModeNameFK) {
        this.carModeNameFK = carModeNameFK;
    }
}
