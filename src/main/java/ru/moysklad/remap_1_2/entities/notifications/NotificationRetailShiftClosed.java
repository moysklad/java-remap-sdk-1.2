package ru.moysklad.remap_1_2.entities.notifications;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NotificationRetailShiftClosed extends NotificationRetailShift {
    private Integer sales;
    private Integer returns;
}
