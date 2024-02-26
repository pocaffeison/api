package com.example.pocaffesy.api.distribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


//Money , Money
//Policy
//Splitter
//public Set<Money> Splitter.split(Policy policy, Money money)
//Policy(total Count, User Count) one to one Money
//Splitter.split set<Money> -> ExecutionContext, StepExecution.
//선착순 데이터 가져가기 sync 처리.....

public class Chunk<Money> { //Job Step Model.
    private int count = 3;
    private List<Money> items = new ArrayList<>();

    public Chunk<Money> of(Collection<Money> monies) {
        this.items.addAll(monies);
        return this;
    }
}
