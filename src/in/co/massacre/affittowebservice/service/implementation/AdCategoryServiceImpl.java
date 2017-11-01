package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.service.interfaces.AdCategoryService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by saurabh on 2/11/17.
 */
@Service("jpaAdCategoryService")
@Transactional
@Repository
public class AdCategoryServiceImpl implements AdCategoryService {
    private static final org.apache.commons.logging.Log Log= LogFactory.getLog(AdCategoryServiceImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AdCategory> findAll() {
        return entityManager.createNamedQuery(AffittoContract.AdCategoryContract.FINDALL_QUERY).getResultList();
    }

    @Override
    public AdCategory findById(long adCategoryId) {
        return null;
    }
}
