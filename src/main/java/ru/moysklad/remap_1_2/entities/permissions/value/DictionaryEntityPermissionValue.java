package ru.moysklad.remap_1_2.entities.permissions.value;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class DictionaryEntityPermissionValue {
    private EntityPermissionValue view;
    private EntityPermissionValue create;
    private EntityPermissionValue update;
    private EntityPermissionValue delete;
    private EntityPermissionValue print;
}
