/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ChefDTO;
import lk.ijse.dinamore.dto.ChefLoginDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.ChefService;

/**
 *
 * @author acer
 */
public class ManageChefController {
    public static int lastId() throws Exception {
        ChefService service = (ChefService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CHEF);
        return service.lastId();
    }

    public static boolean addChef(ChefDTO dto, ChefLoginDTO log)throws Exception  {
        ChefService service = (ChefService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CHEF);
        return service.addChef(dto,log);
    }

    public static ChefLoginDTO findLogin(String name) throws Exception  {
        ChefService service = (ChefService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CHEF);
        return service.findLogin(name);
    }

    public static ArrayList<ChefDTO> view() throws Exception  {
        ChefService service = (ChefService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CHEF);
        return service.view();
    }

    public static ArrayList<ChefDTO> chefReport(String string) throws Exception {
        ChefService service = (ChefService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.CHEF);
        return service.chefReport(string);
    }
}
