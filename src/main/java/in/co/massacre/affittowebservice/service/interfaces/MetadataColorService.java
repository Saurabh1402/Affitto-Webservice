package in.co.massacre.affittowebservice.service.interfaces;

import in.co.massacre.affittowebservice.model.metadata.MetadataColor;

/**
 * Created by saurabh on 2/11/17.
 */
public interface MetadataColorService {
    MetadataColor findAll();
    MetadataColor findByHexa(String code);
    MetadataColor findByTag(String tag);

}
