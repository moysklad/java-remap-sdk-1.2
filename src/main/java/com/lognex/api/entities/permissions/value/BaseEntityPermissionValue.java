package com.lognex.api.entities.permissions.value;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class BaseEntityPermissionValue {
    private EntityPermissionValue view;
    private EntityPermissionValue create;
    private EntityPermissionValue update;
    private EntityPermissionValue delete;
}