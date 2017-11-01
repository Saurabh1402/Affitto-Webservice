package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.AdStatusContract.TABLE_NAME)
public class AdStatus implements Serializable {
    private long idPK;
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.AdStatusContract.ID_PK)
    public long getIdPK() {
        return idPK;
    }

    public void setIdPK(long idPK) {
        this.idPK = idPK;
    }

    @Column(name = AffittoContract.AdStatusContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
