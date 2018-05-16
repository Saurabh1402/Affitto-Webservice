package in.co.massacre.affittowebservice.dbhelper;

import in.co.massacre.affittowebservice.exception.MySQLErrorCodesTranslator;
//import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.sql.DataSource;

/**
 * Created by saurabh on 29/9/17.
 */
public class AffWebSerDBHelper {

    //private Logger logger;
    private DataSource dataSource;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        NamedParameterJdbcTemplate jdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
        MySQLErrorCodesTranslator errorCodesTranslator=new MySQLErrorCodesTranslator();
        errorCodesTranslator.setDataSource(dataSource);
        //jdbcTemplate.setExceptionTranslator(errorCodesTranslator);
        this.namedParameterJdbcTemplate=jdbcTemplate;
    }

}
