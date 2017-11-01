package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_CityContract.TABLE_NAME)
public class MetadataCity implements Serializable {
    private long _idPK;
    private String title;
    private MetadataState metadataStateFK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_CityContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.Metadata_CityContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.Metadata_CityContract.STATE_FK,referencedColumnName = AffittoContract.Metadata_StateContract.ID_PK)
    public MetadataState getMetadataStateFK() {
        return metadataStateFK;
    }

    public void setMetadataStateFK(MetadataState metadataStateFK) {
        this.metadataStateFK = metadataStateFK;
    }
}
