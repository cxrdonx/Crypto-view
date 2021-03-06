package com.exchange.coinsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
     CLIArguments(){

     }
    @Parameter(
            required = true,
            descriptionKey = "COIN",
            validateWith = CLIHelpValidator.class,
            description = "COIN"
    )
     private String coin;
     @Parameter(
             names = {"--id, id"},
             description = "busqueda por id"
     )
     private int id;
      @Parameter(
              names= {"--all-coins, all"},
              description = "muestra todo"
      )
     private String allCoins;

      @Parameter(
              names ={"--markdown"},
              description = "obtener los resultados en markdown"
      )
     private boolean isMarkdown = false;

      @Parameter(
              names = "--help",
              help = true,
              validateWith = CLIHelpValidator.class,
              description = "mostrar la ayuda"
      )

     private boolean isHelp;

    public String getCoin() {
        return coin;
    }

    public int getId() {
        return id;
    }

    public String getAllCoins() {
        return allCoins;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "coin='" + coin + '\'' +
                ", id=" + id +
                ", allCoins='" + allCoins + '\'' +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }
    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
