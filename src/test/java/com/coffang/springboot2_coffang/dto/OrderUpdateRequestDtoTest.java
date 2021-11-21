package com.coffang.springboot2_coffang.dto;

import com.coffang.springboot2_coffang.domain.orderitem.OrderItem;
import com.coffang.springboot2_coffang.domain.user.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderUpdateRequestDtoTest {
    @Test
    public void OrderUpdateRequestDto_테스트() {
        // given
        User user = new User();
        List<OrderItem> orderItems = new ArrayList<OrderItem>();
        Boolean isCompleted = true;

        // when
        OrderUpdateRequestDto dto = new OrderUpdateRequestDto(user, orderItems, isCompleted);

        // then
        assertThat(dto.getUser().getId()).isEqualTo(user.getId());
        assertThat(dto.getOrderItems()).isEqualTo(orderItems);
        assertThat(dto.getIsCompleted()).isEqualTo(isCompleted);
    }
}