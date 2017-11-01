package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.service.interfaces.AdvertisementService;
import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.model.AdSubCategory;
import in.co.massacre.affittowebservice.model.Advertisement;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by saurabh on 31/10/17.
 */
@Service("jpaAdvertisementService")
@Transactional
@Repository
public class AdvertisementServiceImpl implements AdvertisementService {
    private static final Log Log= LogFactory.getLog(AdvertisementServiceImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public List<Advertisement> findAll() {
        return entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FINDALL_NAME).getResultList();
    }

    @Override
    public Advertisement findById(long id) {
        return null;
    }

    @Override
    public Advertisement save(Advertisement advertisement) {
        return null;
    }

    @Override
    public List<Advertisement> findByCategory(AdCategory adCategory) {
        return null;
    }

    @Override
    public List<Advertisement> findByCategory(long adCategoryId) {
        return null;
    }

    @Override
    public List<Advertisement> findBySubCategory(AdSubCategory adSubCategory) {
        return null;
    }

    @Override
    public List<Advertisement> findBySubCategory(long adSubCategoryId) {
        return null;
    }
}
