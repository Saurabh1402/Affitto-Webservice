package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdStatus;

import java.util.List;

/**
 * Created by saurabh on 7/11/17.
 */
public interface AdStatusService {
    List<AdStatus> findAllStatus();
    AdStatus findById(long adStatusId);
}
