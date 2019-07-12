package com.lognex.api.entities;

import com.google.gson.*;
import com.lognex.api.utils.json.JsonUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TemplateEntity extends MetaEntity {
    private Type type;
    private String content;
    private transient Meta.Type entityType;

    public TemplateEntity(String id) {
        super(id);
    }

    public enum Type {
        /**
         * Документ
         */
        entity,

        /**
         * Ценник/этикетка
         */
        pricetype,

        /**
         * Ценник/этикетка нового формата
         */
        mxtemplate
    }

    private transient Boolean isEmbedded;

    public static class Serializer implements JsonDeserializer<TemplateEntity> {
        private final Gson gson = JsonUtils.createGsonWithMetaAdapter();

        @Override
        public TemplateEntity deserialize(JsonElement json, java.lang.reflect.Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            TemplateEntity template = gson.fromJson(json, TemplateEntity.class);

            if (template.getMeta() != null) {
                if (template.getMeta().getType() == null) {
                    throw new JsonParseException("Can't parse template: meta.type is null");
                }
                template.setIsEmbedded(template.getMeta().getType() != Meta.Type.CUSTOM_TEMPLATE);
            }

            return template;
        }
    }
}
