/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.TelOperatorDTO;
import lk.ijse.dinamore.dto.TelOperatorLoginDTO;
import lk.ijse.dinamore.observer.Observer;
import lk.ijse.dinamore.observer.Subject;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.TpOparatorService;

/**
 *
 * @author acer
 */
public class TelOPeratorManageCOntroller {
    public static boolean addTelOparator(TelOperatorDTO dto, TelOperatorLoginDTO tpDto) throws Exception {
        TpOparatorService tp = (TpOparatorService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        return tp.saveOperator(dto, tpDto);
    }

    public static int lastId() throws Exception {
        TpOparatorService service = (TpOparatorService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        return service.lastId();
    }

    public static TelOperatorLoginDTO findLogin(String name) throws Exception {
        TpOparatorService service = (TpOparatorService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        return service.findLogin(name);
    }

    public static ArrayList<TelOperatorDTO> telReport(String name) throws Exception {
        TpOparatorService service = (TpOparatorService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        return service.telReport(name);
    }

    public static ArrayList<TelOperatorDTO> view() throws Exception {
        TpOparatorService service = (TpOparatorService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        return service.view();
    }

    public static void registerObserver(Observer aThis) throws Exception {
        Subject service = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        service.registerObserver( aThis);

    }

    public static void unRegisterObserver(Observer aThis) throws Exception {
        Subject service = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        service.unregisterObserver(aThis);

    }

    public static void registerObserverQueue(Observer aThis) throws Exception {
        Subject service = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        service.registerObserverQueue( aThis);
    }

    public static void unRegisterObserverQueue() throws Exception {
        Subject service = (Subject) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.TEL_OP);
        service.unRegisterObserverQueue( );
    }
}
