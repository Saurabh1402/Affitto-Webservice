package in.co.massacre.affittowebservice.model.metadata;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.Metadata_BikeScooterBrandNameContract.TABLE_NAME)
public class MetadataBikeScooterBrandName implements Serializable{
    private long _idPK;
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.Metadata_BikeScooterBrandNameContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.Metadata_BikeScooterBrandNameContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
