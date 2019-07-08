/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;

import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.dto.OrdersDTO;
import lk.ijse.dinamore.dto.ReportDTO;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.OrdersService;

/**
 *
 * @author acer
 */
public class ManageOrderController {
    public static int lastId() throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.lastId();
    }

    public static boolean saveOrder(OrdersDTO o, ArrayList<ItemDTO> itemList) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        boolean b = service.saveOrder(o, itemList);
        if (b) {
            Subject sub = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
            sub.notifyAllObserverDeliver(o.getOid()+"");
            return b;
        } else {
            return false;
        }

    }

    public static ArrayList<OrdersDTO> searchThisOrder(String id) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);

        return service.searchThisOrder(id);
    }

    public static ArrayList<OrdersDTO> viewAll() throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.view();
    }

    public static OrdersDTO takeOrder() throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);

        OrdersDTO dto = service.takeOrder();
        if (dto != null) {
            Subject sub = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
            sub.notifyAllObserversProcess(dto.getOid()+"");
            return dto;

        } else {
            return null;
        }
    }

    

    public static boolean addOrder(OrdersDTO orderDto) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.addOrder(orderDto);

    }

    public static boolean update(OrdersDTO dto) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        boolean b=service.update(dto);
        if(b){
            Subject sub = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
            sub.notifyAllObserverDeliver(dto.getOid()+"");
            return b;
        }else{
            return false;
        }

    }

    public static OrdersDTO find(String i) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.find(i);

    }

    public static OrdersDTO checkPendingOrder(String id) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.checkPendingOrder(id);
    }

    public static boolean saveReport(ReportDTO dto) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.saveReport(dto);
    }

    public static OrdersDTO todayReport(String a, String text) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.todayReport(a, text);
    }

    public static OrdersDTO orderReport(String a, String text, String t) throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.OrderReport(a, text, t);
    }
   
    public static ArrayList<OrdersDTO> getProcessList() throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.getProcessData();
    }
    
    public static ArrayList<OrdersDTO> getQueueList() throws Exception {
        OrdersService service = (OrdersService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ORDERS);
        return service.getQueueData();
    }
    
    public static void refreshTable(OrdersDTO dto) throws Exception {
        Subject sub = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        sub.notifyAllRefreshTable(dto);
    }
}
