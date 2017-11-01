package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name= AffittoContract.Metadata_BikeScooterModelNameContract.TABLE_NAME)
public class MetadataBikeScooterModelName implements Serializable{
    private long _idPK;
    private String title;
    private MetadataBikeScooterBrandName bikeScooterBrandNameFK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_BikeScooterModelNameContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }
    @Column(name = AffittoContract.Metadata_BikeScooterModelNameContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.Metadata_BikeScooterModelNameContract.BIKESCOOTER_BRANDNAME_FK,referencedColumnName = AffittoContract.Metadata_BikeScooterBrandNameContract.ID_PK)
    public MetadataBikeScooterBrandName getBikeScooterBrandNameFK() {
        return bikeScooterBrandNameFK;
    }

    public void setBikeScooterBrandNameFK(MetadataBikeScooterBrandName bikeScooterBrandNameFK) {
        this.bikeScooterBrandNameFK = bikeScooterBrandNameFK;
    }
}
