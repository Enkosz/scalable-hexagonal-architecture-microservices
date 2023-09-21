package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.RestaurantId;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class CreateOrderCommand {

    @NotNull
    private final UUID customerId;

    @NotNull
    private final RestaurantId restaurantId;

    @NotNull
    private final BigDecimal price;

    @NotNull
    private final List<OrderItem> items;

    @NotNull
    private final OrderAddress address;
}
