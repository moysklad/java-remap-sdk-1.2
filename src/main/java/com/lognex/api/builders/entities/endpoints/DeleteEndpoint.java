package com.lognex.api.builders.entities.endpoints;

import com.lognex.api.LognexApi;
import com.lognex.api.entities.MetaEntity;
import com.lognex.api.utils.HttpRequestBuilder;
import com.lognex.api.utils.LognexApiException;

import java.io.IOException;

public interface DeleteEndpoint<T extends MetaEntity> extends Endpoint {
    void delete() throws IOException, LognexApiException;

    default void delete(LognexApi api) throws IOException, LognexApiException {
        HttpRequestBuilder.
                path(api, path()).
                delete();
    }
}
