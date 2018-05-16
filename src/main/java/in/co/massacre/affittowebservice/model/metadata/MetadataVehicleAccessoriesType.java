package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 7/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_VehicleAccessoriesTypeContract.TABLE_NAME)
public class MetadataVehicleAccessoriesType implements Serializable{
    private long _idPK;
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_VehicleAccessoriesTypeContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.Metadata_VehicleAccessoriesTypeContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}