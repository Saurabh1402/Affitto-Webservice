package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.model.Car;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;
import in.co.massacre.affittowebservice.service.filter.CarFilter;
import in.co.massacre.affittowebservice.service.interfaces.CarService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
        return null;
    }

    @Override
    public List<Car> findByBrandName(MetadataCarBrandName carBrandName, int page) {
        return null;
    }

    @Override
    public List<Car> findByModelName(MetadataCarModelName modelName, int page) {
        return null;
    }

    @Override
    public List<Car> findByColor(MetadataColor color, int page) {
        return null;
    }

    @Override
    public List<Car> findByAfterYearOfRegistration(int yearOfRegistration) {
        return null;
    }

    @Override
    public List<Car> findByCarFilter(CarFilter carFilter, int page) {
        return null;
    }

    @Override
    public List<Car> findByKMDriven(long kMDriven) {
        return null;
    }
}
