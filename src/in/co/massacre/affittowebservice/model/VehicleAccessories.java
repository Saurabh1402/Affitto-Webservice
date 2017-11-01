package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataVehicleAccessoriesType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.VehicleAccessoriesContract.TABLE_NAME)
public class VehicleAccessories implements Serializable{
    private long _idPK;
    private Advertisement advertisement;
    private String title;
    private MetadataVehicleAccessoriesType metadataVehicleAccessoriesTypeFK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.VehicleAccessoriesContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name=AffittoContract.VehicleAccessoriesContract.ADVERTISEMENT_FK,referencedColumnName = AffittoContract.AdvertisementContract.ID_PK)
    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    @Column(name = AffittoContract.VehicleAccessoriesContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.VehicleAccessoriesContract.VehicleAccessoriesTypeFK,referencedColumnName = AffittoContract.Metadata_VehicleAccessoriesTypeContract.ID_PK)
    public MetadataVehicleAccessoriesType getMetadataVehicleAccessoriesTypeFK() {
        return metadataVehicleAccessoriesTypeFK;
    }

    public void setMetadataVehicleAccessoriesTypeFK(MetadataVehicleAccessoriesType metadataVehicleAccessoriesTypeFK) {
        this.metadataVehicleAccessoriesTypeFK = metadataVehicleAccessoriesTypeFK;
    }
}
