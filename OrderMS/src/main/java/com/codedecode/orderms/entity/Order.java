package com.codedecode.orderms.entity;

import com.codedecode.orderms.dto.FoodItemsDTO;
import com.codedecode.orderms.dto.Restaurant;
import com.codedecode.orderms.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
