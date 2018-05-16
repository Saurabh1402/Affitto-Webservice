package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.AdCategory;
import in.co.massacre.affittowebservice.model.AdContact;
import in.co.massacre.affittowebservice.model.AdSubCategory;
import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.metadata.MetadataCity;
import in.co.massacre.affittowebservice.model.metadata.MetadataLocality;
import in.co.massacre.affittowebservice.model.metadata.MetadataPincode;
import in.co.massacre.affittowebservice.model.metadata.MetadataState;
import in.co.massacre.affittowebservice.service.interfaces.AdvertisementService;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by saurabh on 31/10/17.
 */
@Service("jpaAdvertisementService")
@Transactional
@Repository
public class AdvertisementServiceImpl implements AdvertisementService {
    private static final org.apache.commons.logging.Log Log= LogFactory.getLog(AdvertisementServiceImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = true)
    @Override
    public List<Advertisement> findAll(int page) {
        return entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_ALL_KEY).getResultList();
    }

    @Override
    public Advertisement findById(long id) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_ID_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_ID_PARAMETER_ID,id);
        if(query.getResultList()!=null && query.getResultList().size()>0)
        return (Advertisement)query.getSingleResult();
        else return null;
    }

    @Override
    public Advertisement save(Advertisement advertisement) {
        entityManager.persist(advertisement);
        return null;
    }

    @Override
    public List<Advertisement> findByUserCurrentLocation(long longitude, long latitude, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByLocality(MetadataLocality locality, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_LOCALITY_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_LOCALITY_PARAMETER_LOCALITY,locality);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findByCity(MetadataCity city, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_CITY_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_CITY_PARAMETER_CITY,city);
        return query.getResultList();

    }

    @Override
    public List<Advertisement> findByCity(long cityId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByState(MetadataState state, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_STATE_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_STATE_PARAMETER_STATE,state);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findByState(long stateId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByPincode(MetadataPincode pincode, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_PINCODE_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_PINCODE_PARAMETER_PINCODE,pincode);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findByPincode(long pincodeId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByCategory(AdCategory adCategory, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_CATEGORY_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_CATEGORY_PARAMETER_CATEGORY,adCategory);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findByCategory(long adCategoryId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findBySubCategory(AdSubCategory adSubCategory, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_SUBCATEGORY_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_SUBCATEGORY_PARAMETER_SUBCATEGORY,adSubCategory);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findBySubCategory(long adSubCategoryId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByAdContact(AdContact adContact, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.AdvertisementContract.FIND_BY_CONTACT_KEY);
        query.setParameter(AffittoContract.AdvertisementContract.FIND_BY_CONTACT_PARAMETER_CONTACT,adContact);
        return query.getResultList();
    }

    @Override
    public List<Advertisement> findByAdContact(long adContactId, int page) {
        return null;
    }

    @Override
    public List<Advertisement> findByTag(String tag, int page) {
        return null;
    }


}
