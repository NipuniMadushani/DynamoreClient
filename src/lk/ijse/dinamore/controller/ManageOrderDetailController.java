/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.OrderDetailDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.OrderDetailService;

/**
 *
 * @author acer
 */
public class ManageOrderDetailController {
    public static ArrayList<OrderDetailDTO> searchOrder(String oid) throws Exception {
        OrderDetailService service = (OrderDetailService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.OD);
        return service.searchOrder(oid);
    }
}
