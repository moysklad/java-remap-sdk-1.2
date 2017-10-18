package com.lognex.api.model.document;

import com.lognex.api.model.base.AbstractOperationWithPositions;
import com.lognex.api.model.base.IEntityWithAttributes;
import com.lognex.api.model.entity.Store;
import com.lognex.api.model.entity.attribute.Attribute;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class InternalOrder extends AbstractOperationWithPositions implements IEntityWithAttributes {

    private Store store;
    private Set<Attribute<?>> attributes = new HashSet<>();
    private String documents;
    private Date deliveryPlannedMoment;
    private List<PurchaseOrder> purchaseOrders = new ArrayList<>();
    private List<Move> moves = new ArrayList<>();

    @Override
    public Attribute<?> getAttribute(String attributeId) {
        return attributes.stream().filter(a -> a.getId().equals(attributeId))
                .findFirst().orElseGet(null);
    }
}
