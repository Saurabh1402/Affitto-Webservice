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
    private String title;
    private MetadataVehicleAccessoriesType metadataVehicleAccessoriesTypeFK;
    @Id
    @Column(name = AffittoContract.VehicleAccessoriesContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.VehicleAccessoriesContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = AffittoContract.Metadata_VehicleAccessoriesTypeContract.ID_PK)
    public MetadataVehicleAccessoriesType getMetadataVehicleAccessoriesTypeFK() {
        return metadataVehicleAccessoriesTypeFK;
    }

    public void setMetadataVehicleAccessoriesTypeFK(MetadataVehicleAccessoriesType metadataVehicleAccessoriesTypeFK) {
        this.metadataVehicleAccessoriesTypeFK = metadataVehicleAccessoriesTypeFK;
    }
}
