package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.dbhelper.AffittoContract;
import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.Car;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;
import in.co.massacre.affittowebservice.service.filter.CarFilter;
import in.co.massacre.affittowebservice.service.interfaces.CarService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */

@Service("jpaCarService")
@Transactional
@Repository
public class CarServiceImpl implements CarService{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Car car) {
        entityManager.persist(car);
    }

    @Override
    public List<Car> findAll(int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_ALL_KEY);
        return query.getResultList();
    }

    @Override
    public Car findById(long id) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_ID_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_ID_PARAMETER_ID,id);
        if(query.getSingleResult()!=null && query.getResultList().size()>0)
            return (Car) query.getSingleResult();
        else return null;
    }

    @Override
    public Car findByAdvertisement(Advertisement advertisement) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_ADVERTISEMENT_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_ADVERTISEMENT_PARAMTER_ADVERTISEMENT,advertisement);
        if(query.getSingleResult()!=null && query.getResultList().size()>0)
            return (Car) query.getSingleResult();
        else return null;
    }

    @Override
    public List<Car> findByBrandName(MetadataCarBrandName carBrandName, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_BRANDNAME_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_BRANDNAME_PARAMETER_BRANDNAME,carBrandName);
        return query.getResultList();
    }

    @Override
    public List<Car> findByModelName(MetadataCarModelName modelName, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_MODELNAME_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_MODELNAME_PARAMETER_MODELNAME,modelName);
        return query.getResultList();
    }

    @Override
    public List<Car> findByColor(MetadataColor color, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_COLOR_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_COLOR_PARAMETER_COLOR,color);
        return query.getResultList();
    }

    @Override
    public List<Car> findByAfterYearOfRegistration(int yearOfRegistration) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_AFTER_YEAR_OF_REG_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_AFTER_YEAR_OF_REG_PARAMETER_YEAR,yearOfRegistration);
        return query.getResultList();
    }

    @Override
    public List<Car> findByCarFilter(CarFilter carFilter, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_FILTER_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_FILTER_PARAMETER_BRANDNAME_LIST,carFilter.brandNames);
        query.setParameter(AffittoContract.CarContract.FIND_BY_FILTER_PARAMETER_MODELNAME_LIST,carFilter.modelNames);
        return query.getResultList();
    }

    @Override
    public List<Car> findByKMDriven(long kMDriven,int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_KILOMETER_DRIVEN_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_KILOMETER_DRIVEN_PARAMETER_KM,kMDriven);
        return query.getResultList();
    }

    @Override
    public List<Car> findByFuelType(MetadataCarFuelType fuelType, int page) {
        Query query=entityManager.createNamedQuery(AffittoContract.CarContract.FIND_BY_FUEL_TYPE_KEY);
        query.setParameter(AffittoContract.CarContract.FIND_BY_FUEL_TYPE_PARAMETER_FUEL_TYPE,fuelType);
        return query.getResultList();
    }
}
