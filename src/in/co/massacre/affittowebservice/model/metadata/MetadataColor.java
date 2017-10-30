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
@Table(name = AffittoContract.Metadata_ColorContract.TABLE_NAME)
public class MetadataColor implements Serializable{
    private long _idPk;
    private String title;
    private String hexCode;

    @Id
    @Column(name = AffittoContract.Metadata_ColorContract.ID_PK)
    public long get_idPk() {
        return _idPk;
    }

    public void set_idPk(long _idPk) {
        this._idPk = _idPk;
    }

    @Column(name = AffittoContract.Metadata_ColorContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = AffittoContract.Metadata_ColorContract.HEXCODE)
    public String getHexCode() {
        return hexCode;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }
}
