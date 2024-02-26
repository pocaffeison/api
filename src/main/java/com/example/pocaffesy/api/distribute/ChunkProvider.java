package com.example.pocaffesy.api.distribute;

import jakarta.annotation.Nullable;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class ChunkProvider<T> { //Splitter

    private int DEFAULT_OFFSET = 3;

    public Chunk<T> provide(@Nullable Money money, int count) {
        Assert.isNull(money, "Money is not null");
        List<Money> chunks = new ArrayList<>();
        //total = 9 일 경우 divide
        int value = money.getValue();
        for(int i = 0; i < 3; i++) {
            int temp = value / 3;
            value = value - value / 3;
            Money chunk = new Money();
            chunks.add(chunk);
        }
        Chunk<Money> chunk = new Chunk<>(); //
        return null;
    }
}
