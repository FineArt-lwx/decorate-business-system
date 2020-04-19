package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Customer;
import com.finearter.dbs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;



    /**
     * 根据客户姓名查找客户
     * @param customerName
     * @return
     */
    @GetMapping("/selectByName")
    public ResultDto selectByName(String customerName){
        return customerService.selectByName(customerName);
    }


    /**
     * 查找所有客户
     * @return
     */
    @GetMapping("/selectAll")
    public ResultDto selectAll(){
        return customerService.selectAll();
    }


    /**
     *
     * @param customer
     * @return
     */
    @GetMapping("addCustomer")
    public ResultDto addCustomer(Customer customer){
        return customerService.addCustomer(customer);
    }

}