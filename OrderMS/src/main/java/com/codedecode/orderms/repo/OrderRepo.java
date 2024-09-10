package com.codedecode.orderms.repo;

import com.codedecode.orderms.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {
}
