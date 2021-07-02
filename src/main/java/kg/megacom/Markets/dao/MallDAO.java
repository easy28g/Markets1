package kg.megacom.Markets.dao;

import kg.megacom.Markets.models.Mall;
import kg.megacom.Markets.models.Market;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class MallDAO {

    private static long mallId;
    private static long marketId;

    private ArrayList<Mall> mallArrayList;

    private ArrayList<Market> asiaMallMarketArrayList;
    private ArrayList<Market> bpMarketArrayList;
    private ArrayList<Market> allMarkets;

    {
        asiaMallMarketArrayList = new ArrayList<>();
        asiaMallMarketArrayList.add(new Market(++marketId, "1stAMshoes", "/vdssd"));
        asiaMallMarketArrayList.add(new Market(++marketId, "2stAMclocks", "/gfdaggdf"));
        asiaMallMarketArrayList.add(new Market(++marketId, "3stAMjackets", "/ertutbf"));

        bpMarketArrayList = new ArrayList<>();
        bpMarketArrayList.add(new Market(++marketId, "1stBPshoes", "/adfherg"));
        bpMarketArrayList.add(new Market(++marketId, "2stBPburgers", "/sdfgwtt"));
        bpMarketArrayList.add(new Market(++marketId, "3stBPcinema", "/ghgfhfgb"));

        allMarkets = new ArrayList<>();
        allMarkets.add(new Market(++marketId, "1stAMshoes", "/vdssd"));
        allMarkets.add(new Market(++marketId, "2stAMclocks", "/gfdaggdf"));
        allMarkets.add(new Market(++marketId, "3stAMjackets", "/ertutbf"));
        allMarkets.add(new Market(++marketId, "1stBPshoes", "/adfherg"));
        allMarkets.add(new Market(++marketId, "2stBPburgers", "/sdfgwtt"));
        allMarkets.add(new Market(++marketId, "3stBPcinema", "/ghgfhfgb"));
        Collections.shuffle(allMarkets);

        mallArrayList = new ArrayList<>();
        mallArrayList.add(new Mall(++mallId, "AsiaMall", asiaMallMarketArrayList));
        mallArrayList.add(new Mall(++mallId, "Bishkek Park", bpMarketArrayList));
    }

    public List<Market> index(){
        return allMarkets;
    }

}
