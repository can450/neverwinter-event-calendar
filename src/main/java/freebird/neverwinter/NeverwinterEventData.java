package freebird.neverwinter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NeverwinterEventData {
    private String title;
    private Date start_date;
    private Date end_date;
    private String cat;
    private URL news_url;

    public NeverwinterEventData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public URL getNews_url() {
        return news_url;
    }

    public void setNews_url(URL news_url) {
        this.news_url = news_url;
    }

    @Override
    public String toString(){

        return "Event Title: " + title + "\n" +
                "Start Date: " +start_date.toString()+"\n"+
                "End Date: " +end_date.toString()+"\n"+
                "Event Category: "+cat+"\n"+
                "News URL: " +news_url +"\n\n"+
                "#############################\n\n";
    }
}
