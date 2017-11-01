package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_LocalityContract.TABLE_NAME)
public class MetadataLocality implements Serializable{
    private long _idPK;
    private String title;
    private MetadataCity metadataCity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_LocalityContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }


    @Column(name = AffittoContract.Metadata_LocalityContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.Metadata_LocalityContract.CITY_FK,referencedColumnName = AffittoContract.Metadata_CityContract.ID_PK)
    public MetadataCity getMetadataCity() {
        return metadataCity;
    }

    public void setMetadataCity(MetadataCity metadataCity) {
        this.metadataCity = metadataCity;
    }
}
