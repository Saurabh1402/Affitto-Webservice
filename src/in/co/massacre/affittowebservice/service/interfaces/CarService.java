package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.Car;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarBrandName;
import in.co.massacre.affittowebservice.model.metadata.MetadataCarModelName;
import in.co.massacre.affittowebservice.model.metadata.MetadataColor;
import in.co.massacre.affittowebservice.service.filter.CarFilter;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface CarService {

    void      save(Car car);
    List<Car> findAll(int page);
    List<Car> findByBrandName(MetadataCarBrandName carBrandName,int page);
    List<Car> findByModelName(MetadataCarModelName modelName,int page);
    List<Car> findByColor(MetadataColor color,int page);
    List<Car> findByAfterYearOfRegistration(int yearOfRegistration);
    List<Car> findByCarFilter(CarFilter carFilter,int page);
    List<Car> findByKMDriven(long kMDriven);
}
