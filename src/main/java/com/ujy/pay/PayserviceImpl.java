package com.ujy.pay;

public class PayserviceImpl implements Payservice {
    @Override
    public void add(Double money) {
        System.out.println("支付增加");
    }

    @Override
    public void update(Double money) {
        System.out.println("支付更新");
    }

    @Override
    public void delete(Long id) {
        System.out.println("支付删除");
    }
}
