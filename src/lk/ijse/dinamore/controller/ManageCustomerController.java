/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import lk.ijse.dinamore.dto.CustomerDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.CustomerService;

/**
 *
 * @author acer
 */
public class ManageCustomerController {
    public static boolean saveCustomer(CustomerDTO dto)throws Exception{
         
        CustomerService customerService = (CustomerService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.saveCustomer(dto);
    }
    
    
    public static CustomerDTO searchCustomer(String id)throws Exception{
        CustomerService customerService = (CustomerService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.searchCustomer(id);
    }
}
