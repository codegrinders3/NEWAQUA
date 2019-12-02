package com.accolite.assignment.dao;

import com.accolite.assignment.entity.ColumnDetails;
import com.accolite.assignment.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDao {

    @Autowired
    private NamedParameterJdbcTemplate sqlDao;

    public List<Customer> getTodaysCustomers(String date) {
        String sql = "select * from AQUA_DETAILS where DATE(date_of_work) = \"" + date + "\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getCustomersByName(String name) {
        String sql = "select * from AQUA_DETAILS where cust_name = \"" + name + "\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getCustomersByAddr(String addr) {
        String sql = "select * from AQUA_DETAILS where cust_address = \"" + addr + "\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getCustomersByTechName(String techName) {
        String sql = "select * from AQUA_DETAILS where technician_name = \"" + techName + "\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getCustomerByPhoneNumber(String phoneNumber) {
        String sql = "select * from AQUA_DETAILS where cust_phone_number= \"" + phoneNumber + "\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getCustomerByColumn(ColumnDetails columnDetails) {
        String sql = "select * from AQUA_DETAILS where " + columnDetails.getColumnName() + " like \"%" + columnDetails.getColumnValue() + "%\"";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getAMCDoneCustomer(String date) {
        String sql = "select * from AQUA_DETAILS where amc_date = date_of_work and date_of_work <= \"2018-12-12\"  and is_amc_renewed = false";
        return sqlDao.query(sql, new CustomerMapper());
    }

    public List<Customer> getAllCustomer() {
        String sql = "select * from AQUA_DETAILS";
        return sqlDao.query(sql, new CustomerMapper());
    }

    @Transactional
    public int addCustomer(Customer customer) {

        final String addCustomersql = "insert into `AQUA_DETAILS`" +
                "(`cust_phone_number`,`cust_name`,`cust_address`,`model_name`," +
                "`date_of_work`,`month_of_work`,`technician_name`," +
                "`part_ccv`,`part_sedimentalfilter`," +
                "`part_carbonfilter`,`part_romembrane`," +
                "`part_multilayer`,`part_ppspun`," +
                "`part_pump`,`part_sv`," +
                "`part_smps`,`part_vvlamp`," +
                "`part_service`,`is_amc`,`amc_date`,`is_amc_renewed`)" +
                "values " +
                "(:phoneNumber,:custName,:custAddress,:modelName," +
                ":dateOfWork,:monthOfWork,:technicianName,:partCCV," +
                ":partSedimentalfilter,:partCarbonfilter,:partROMembrane,:partMultilayer,:partPPSpun," +
                ":partPump,:partSV,:partSMPS," +
                ":partVVLamp,:partService,:isAMC,:amcDate,:isAMCRenewed)";

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("phoneNumber", customer.getPhoneNumber());
        parameters.put("custName", customer.getName());
        parameters.put("custAddress", customer.getAddress());
        parameters.put("modelName", customer.getModelName());
        parameters.put("dateOfWork", customer.getDateOfWork());
        parameters.put("monthOfWork", Month.valueOf(customer.getMonthOfWork()).getValue());
        parameters.put("technicianName", customer.getTechnicianName());
        parameters.put("partCCV", customer.getPartCCV());
        parameters.put("partSedimentalfilter", customer.getPartSedimentalfilter());
        parameters.put("partCarbonfilter", customer.getPartCarbonfilter());
        parameters.put("partMultilayer", customer.getPartMultilayer());
        parameters.put("partPPSpun", customer.getPartPPSpun());
        parameters.put("partROMembrane", customer.getPartROMembrane());
        parameters.put("partPump", customer.getPartPump());
        parameters.put("partSV", customer.getPartSV());
        parameters.put("partSMPS", customer.getPartSMPS());
        parameters.put("partVVLamp", customer.getPartVVLamp());
        parameters.put("partService", customer.getPartService());
        parameters.put("isAMC", customer.getIsAmc());
        parameters.put("amcDate", customer.getAmcDate());
        parameters.put("isAMCRenewed", customer.getAmcRenewed());

        return sqlDao.update(addCustomersql, parameters);
    }
}

class CustomerMapper implements RowMapper<Customer> {

    @Override
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

        final Customer customer = new Customer();

        customer.setName(rs.getString("cust_name"));
        customer.setPhoneNumber(rs.getString("cust_phone_number"));
        customer.setAddress(rs.getString("cust_address"));
        customer.setModelName(rs.getString("model_name"));
        customer.setDateOfWork(rs.getDate("date_of_work"));
        int month = rs.getInt("month_of_work");
        Month monthName = Month.of(month);
        customer.setMonthOfWork(monthName.name());
        customer.setTechnicianName(rs.getString("technician_name"));
        customer.setPartCCV(rs.getInt("part_ccv"));
        customer.setPartSedimentalfilter(rs.getInt("part_sedimentalfilter"));
        customer.setPartCarbonfilter(rs.getInt("part_carbonfilter"));
        customer.setPartROMembrane(rs.getInt("part_romembrane"));
        customer.setPartMultilayer(rs.getInt("part_multilayer"));
        customer.setPartPPSpun(rs.getInt("part_ppspun"));
        customer.setPartPump(rs.getInt("part_pump"));
        customer.setPartSV(rs.getInt("part_sv"));
        customer.setPartSMPS(rs.getInt("part_smps"));
        customer.setPartVVLamp(rs.getInt("part_vvlamp"));
        customer.setPartService(rs.getInt("part_service"));
        customer.setIsAmc(rs.getBoolean("is_amc"));
        customer.setAmcDate(rs.getDate("amc_date"));
        customer.setAmcRenewed(rs.getBoolean("is_amc_renewed"));

        return customer;
    }
}
