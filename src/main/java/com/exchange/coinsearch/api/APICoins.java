package com.exchange.coinsearch.api;

import com.exchange.coinsearch.CoinData;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept application/json")
public interface APICoins {
    @RequestLine("Get /v1/cryptocurrency/listings/latest")
    List<CoinData> coins(@QueryMap Map<String, Object> queryMap);
}
