/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinamore.controller;

import java.util.ArrayList;
import lk.ijse.dinamore.dto.ItemDTO;
import lk.ijse.dinamore.proxy.ProxyHandler;
import lk.ijse.dinamore.service.ServiceFactory;
import lk.ijse.dinamore.service.custom.ItemService;

/**
 *
 * @author acer
 */
public class ManageItemController {
    public static boolean addItem(ItemDTO dto) throws Exception {
        ItemService itemService = (ItemService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ITEM);
        return itemService.saveItem(dto);
    }
    public static ArrayList<ItemDTO> getAllItem()throws Exception{
        ItemService itemService = (ItemService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ITEM);
        return itemService.getAllItem();
    }

    public static ItemDTO find(String name)throws Exception {
        ItemService itemService = (ItemService) ProxyHandler.getInstance().getServiceType(ServiceFactory.ServiceType.ITEM);
        return itemService.find(name);
    }
}
