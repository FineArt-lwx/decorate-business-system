package com.finearter.dbs.controller;

import com.finearter.dbs.model.dto.ResultDto;
import com.finearter.dbs.model.entity.Customer;
import com.finearter.dbs.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public ResultDto selectByName(String customerName,Integer pageIndex,Integer pageSize){
        return customerService.selectByName(customerName,pageIndex,pageSize);
    }


    /**
     * 查找所有客户
     * @return
     */
    @GetMapping("/selectAll")
    public ResultDto selectAll(Integer pageIndex,Integer pageSize){
        return customerService.selectAll(pageIndex,pageSize);
    }


    /**
     *新增客户
     * @param customer
     * @return
     */
    @GetMapping("addCustomer")
    public ResultDto addCustomer(Customer customer){
        return customerService.addCustomer(customer);
    }



    @DeleteMapping("deleteById")
    public ResultDto deleteById(Integer id){
        return customerService.deleteById(id);
    }


    @PutMapping("updateById")
    public ResultDto updateById(Customer customer){
        return customerService.updateById(customer);
    }


    @GetMapping("selectById")
    public ResultDto selectById(Integer id){
        return customerService.selectById(id);
    }

}