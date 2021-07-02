package kg.megacom.Markets.models;


public class Market {

    private long id;
    private String marketName;
    private String marketUrl;

    public Market() {
    }

    public Market(long id, String marketName, String marketUrl) {
        this.id = id;
        this.marketName = marketName;
        this.marketUrl = marketUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getMarketUrl() {
        return marketUrl;
    }

    public void setMarketUrl(String marketUrl) {
        this.marketUrl = marketUrl;
    }
}
