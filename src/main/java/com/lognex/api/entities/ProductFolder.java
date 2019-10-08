package com.lognex.api.entities;

import com.lognex.api.entities.agents.Employee;
import com.lognex.api.entities.products.GoodTaxSystem;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductFolder extends MetaEntity {
    /**
     * Ссылка на Владельца (Сотрудника) в формате Метаданных)
     */
    private Employee owner;

    /**
     * Наименование Группы товаров, в которую входит данная Группа товаров
     */
    private String pathName;

    /**
     * Общий доступ
     */
    private Boolean shared;

    /**
     * Добавлена ли Группа товаров в архив
     */
    private Boolean archived;

    /**
     * Код Группы товаров
     */
    private String code;

    /**
     * Внешний код Группы товаров
     */
    private String externalCode;

    /**
     * Описание Группы товаров
     */
    private String description;

    /**
     * Ссылка на Группу товаров данной Группы товаров в формате Метаданных
     */
    private ProductFolder productFolder;

    /**
     * Момент последнего обновления сущности
     */
    private LocalDateTime updated;

    /**
     * Отдел сотрудника в формате Метаданных
     */
    private Group group;

    /**
     * НДС
     */
    private Integer vat;

    /**
     * Реальный НДС
     */
    private Integer effectiveVat;

    /**
     * Код системы налогообложения
     */
    private GoodTaxSystem taxSystem;

    public ProductFolder(String id) {
        super(id);
    }
}
