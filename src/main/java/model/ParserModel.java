package model;


import jaxb.Feed;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//singleton
public final class ParserModel {
    private static ParserModel instance = new ParserModel();

    private Feed feed;
    private JAXBContext context;

    public static synchronized ParserModel getInstance(){
        return instance;
    }

    private ParserModel(){
        try {
            feed = new Feed();
            context = JAXBContext.newInstance(Feed.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    //unmarshaling
    public void setFeed(String url) throws JAXBException, MalformedURLException {
            Unmarshaller unmarshaller = context.createUnmarshaller();
            feed = (Feed) unmarshaller.unmarshal(new URL(url));
    }

    //marshaling
    public void setXml(Feed feed, String url) throws JAXBException {
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(feed, new File(url));
    }
}
