package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckymoneyRepository repository;

    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("mike");
        luckymoney1.setMoney(new BigDecimal("111"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("mike");
        luckymoney2.setMoney(new BigDecimal("222"));
        repository.save(luckymoney2);
    }
}
