package com.lognex.api.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Юридическое Лицо
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class Organization extends Agent {
    public String id;
    public String accountId;
    public MetaEntity owner;
    public Boolean shared;
    public MetaEntity group;
    public Integer version;
    public LocalDateTime updated;
    public String name;
    public String externalCode;
    public Boolean archived;
    public LocalDateTime created;
    public CompanyType companyType;
    public String legalTitle;
    public String email;
    public MetaEntity accounts;
    public Boolean isEgaisEnable;
    public Boolean payerVat;
    public String director;
    public String chiefAccountant;
}
