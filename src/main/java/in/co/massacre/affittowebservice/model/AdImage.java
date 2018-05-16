package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.AdImageContract.TABLE_NAME)
public class AdImage implements Serializable {
    private long _idPK;
    private String title;
    private Advertisement advertisementFK;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.AdImageContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.AdImageContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name= AffittoContract.AdImageContract.ADVERTISEMENT_FK,referencedColumnName = AffittoContract.AdvertisementContract.ID_PK)
    public Advertisement getAdvertisementFK() {
        return advertisementFK;
    }

    public void setAdvertisementFK(Advertisement advertisementFK) {
        this.advertisementFK = advertisementFK;
    }
}
