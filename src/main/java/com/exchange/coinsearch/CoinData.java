package com.exchange.coinsearch;

import com.google.gson.annotations.SerializedName;

public class CoinData {
        private String id;
        private String name;
        private String symbol;
        private String slug;
        @SerializedName("cmc_rank")
        private String cmcRank;
        @SerializedName("num_market_pairs")
        private String numMarketPairs;
        @SerializedName("circulating_supply")
        private String circulatingSupply;
        @SerializedName("total_supply")
        private String totalSupply;
        @SerializedName("max_supply")
        private String maxSupply;
        @SerializedName("last_updated")
         private String last_updated;
        private String[] quote;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getCmcRank() {
        return cmcRank;
    }

    public void setCmcRank(String cmcRank) {
        this.cmcRank = cmcRank;
    }

    public String getNumMarketPairs() {
        return numMarketPairs;
    }

    public void setNumMarketPairs(String numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    public String getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(String circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String[] getQuote() {
        return quote;
    }

    public void setQuote(String[] quote) {
        this.quote = quote;
    }
}
