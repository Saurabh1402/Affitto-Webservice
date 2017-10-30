package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_CarBrandNameContract.TABLE_NAME)
public class MetadataCarBrandName implements Serializable{
    private long _idPK;
    private String title;
    @Id
    @Column(name = AffittoContract.Metadata_CarBrandNameContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }
    @Id
    @Column(name = AffittoContract.Metadata_CarBrandNameContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
