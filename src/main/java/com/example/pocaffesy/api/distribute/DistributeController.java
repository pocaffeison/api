package com.example.pocaffesy.api.distribute;

import java.util.ArrayList;
import java.util.List;

public class DistributeController {

    private ChunkProvider<Money> provider;


    //provider
    public DistributeController(ChunkProvider<Money> provider) {
        this.provider = provider;
    }

    //Dto 필요.
    public void distribute(Money money, int count) { //Money
        Chunk<Money> chunk = provider.provide(money, count); //provide
        //나눠준후

    }




    //CompositeMoney
    public static class CompositeMoney {
        private List<Money> monies = new ArrayList<>();

        public List<Money> getMonies() {
            return monies;
        }
    }



    public static class MoneyBuilder {
        //Splitter
        //
    }
}
