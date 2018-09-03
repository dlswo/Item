package com.company;

import java.util.Scanner;

public class ItemUI {

    ItemService itemService;

    public ItemUI(ItemService itemService) {
        this.itemService = itemService;
    }

    public void playGame(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("playGame....");
        for (int i = 0 ; i < itemService.itemVOS.length ; i++) {
            System.out.println("ENTER <-----");
            scanner.nextLine();
            System.out.println(itemService.selectOne());
            if (itemService.itemVOS[i].value.equals("당첨")){
                break;
            }

        }

    }
}
