package com.wzl.exer.create;

/**
 * 〈功能简述〉
 * 〈〉
 *
 * @author wangzl
 * @create 2019/3/4 0004
 */
public class ClientService {
    private static ClientService clientService = new ClientService();

    private ClientService(){

    }

    public static ClientService createInstance(){
        return clientService;
    }
}
