package in.co.massacre.affittowebservice.service.implementation;

import in.co.massacre.affittowebservice.model.Advertisement;
import in.co.massacre.affittowebservice.model.CommercialVehicle;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleFuelType;
import in.co.massacre.affittowebservice.model.metadata.MetadataCommercialVehicleType;
import in.co.massacre.affittowebservice.service.interfaces.CommercialVehicleService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
@Service("jpaCommercialVehicleService")
@Transactional
@Repository
public class CommercialVehicleServiceImpl implements CommercialVehicleService {
    @Override
    public List<CommercialVehicle> findAll(int page) {
        return null;
    }

    @Override
    public CommercialVehicle findById(long id) {
        return null;
    }

    @Override
    public CommercialVehicle findByAdvertisement(Advertisement advertisement) {
        return null;
    }

    @Override
    public List<CommercialVehicle> findBycommercialVehicleType(MetadataCommercialVehicleType commercialVehicleType, int page) {
        return null;
    }

    @Override
    public List<CommercialVehicle> findByCommercialVehicleFuelType(MetadataCommercialVehicleFuelType commercialVehicleFuelType, int page) {
        return null;
    }

    @Override
    public List<CommercialVehicle> findByAfterYearOfRegistration(int yearOfRegistration, int page) {
        return null;
    }
}
