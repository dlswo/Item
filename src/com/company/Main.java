package com.company;

public class Main {

    public static void main(String[] args) {

        ItemVO[] arr = {
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("꽝"),
                new ItemVO("당첨")};


        ItemService service = new ItemService(arr);
        service.shuffle();

        ItemUI ui = new ItemUI(service);
        ui.playGame();


    }
}