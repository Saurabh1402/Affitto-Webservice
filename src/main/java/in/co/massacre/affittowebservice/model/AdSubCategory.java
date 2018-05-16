package in.co.massacre.affittowebservice.model;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by saurabh on 5/10/17.
 */
@Entity
@Table(name = AffittoContract.AdSubCategoryContract.TABLE_NAME)
public class AdSubCategory implements Serializable {
    private long _idPK;
    private String title;
    private AdCategory adCategoryFK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = AffittoContract.AdSubCategoryContract.ID_PK)
    public long get_idPK() {
        return _idPK;
    }

    public void set_idPK(long _idPK) {
        this._idPK = _idPK;
    }

    @Column(name = AffittoContract.AdSubCategoryContract.TITLE)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name= AffittoContract.AdSubCategoryContract.AD_CATEGORY_FK,referencedColumnName = AffittoContract.AdCategoryContract.ID_PK)
    public AdCategory getAdCategoryFK() {
        return adCategoryFK;
    }

    public void setAdCategoryFK(AdCategory adCategoryFK) {
        this.adCategoryFK = adCategoryFK;
    }
}
