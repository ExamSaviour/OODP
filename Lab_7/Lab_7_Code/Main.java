public class Main {
    public static void main(String[] args){
        NewsAgency newsAgency = new NewsAgency();

        Observer companyObserver = new CompanyNewsLetterObserver();
        Observer consumerObserver = new ConsumerNewsLetterObserver();

        newsAgency.registerObserver(companyObserver);
        newsAgency.registerObserver(consumerObserver);

        newsAgency.publishNews("New Product Launch!");
    }
}
