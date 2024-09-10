package com.codedecode.orderms.mapper;

import com.codedecode.orderms.dto.OrderDTO;
import com.codedecode.orderms.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}