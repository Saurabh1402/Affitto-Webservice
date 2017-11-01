package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_CarModelNameContract.TABLE_NAME)
public class MetadataCarModelName implements Serializable {
    private long _idPK;
    private String title;
    private MetadataCarBrandName metadataCarBrandNameFK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_CarModelNameContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.Metadata_CarModelNameContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name=AffittoContract.Metadata_CarModelNameContract.CAR_BRAND_NAME_FK,referencedColumnName = AffittoContract.Metadata_CarBrandNameContract.ID_PK)
    public MetadataCarBrandName getMetadataCarBrandNameFK() {
        return metadataCarBrandNameFK;
    }

    public void setMetadataCarBrandNameFK(MetadataCarBrandName metadataCarBrandNameFK) {
        this.metadataCarBrandNameFK = metadataCarBrandNameFK;
    }
}
