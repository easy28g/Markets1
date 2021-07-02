package kg.megacom.Markets.models;

import java.util.List;

public class Mall {

    private long id;
    private String mallName;
    private List<Market> marketList;

    public Mall() {
    }

    public Mall(long id, String mallName, List<Market> marketList) {
        this.id = id;
        this.mallName = mallName;
        this.marketList = marketList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public List<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(List<Market> marketList) {
        this.marketList = marketList;
    }
}
