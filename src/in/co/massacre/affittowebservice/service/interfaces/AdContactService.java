package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.AdContact;

/**
 * Created by saurabh on 7/11/17.
 */
public interface AdContactService {
    AdContact findById(long id);
    void save(AdContact adContact);
    void delete(AdContact adContact);
    void delete(long adContactId);
}
