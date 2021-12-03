package com.exchange.coinsearch;

import com.beust.jcommander.JCommander;
import com.exchange.coinsearch.cli.CLIArguments;

import static com.exchange.coinsearch.CommanderFunctions.buildCommanderWithName;


public class CoinSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
