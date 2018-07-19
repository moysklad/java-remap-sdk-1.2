package com.lognex.api.entities;

import com.lognex.api.entities.agents.EmployeeEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Склад
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StoreEntity extends MetaEntity {
    /**
     * ID в формате UUID
     */
    private String id;

    /**
     * ID учетной записи
     */
    private String accountId;

    /**
     * Ссылка на Владельца (Сотрудника) в формате Метаданных
     */
    private EmployeeEntity owner;

    /**
     * Общий доступ
     */
    private Boolean shared;

    /**
     * Отдел сотрудника в формате Метаданных
     */
    private MetaEntity group;

    /**
     * Версия сущности
     */
    private Integer version;

    /**
     * Момент последнего обновления сущности
     */
    private LocalDateTime updated;

    /**
     * Наименование Склада
     */
    private String name;

    /**
     * комментарий к Складу
     */
    private String description;

    /**
     * Код Склада
     */
    private String code;

    /**
     * Внешний код Склада
     */
    private String externalCode;

    /**
     * Добавлен ли Склад в архив
     */
    private Boolean archived;

    /**
     * Адрес Склада
     */
    private String address;

    /**
     * Родительский склад (Группа)
     */
    private MetaEntity parent;

    /**
     * Группа Склада
     */
    private String pathName;

    /**
     * Дополнительные поля Склада в формате Метаданных
     */
    private MetaEntity attributes;
}