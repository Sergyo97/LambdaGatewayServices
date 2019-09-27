package edu.escuelaing.arem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import spark.Request;
import spark.Response;
import static spark.Spark.*;

import static javax.management.Query.value;

/**
 * Minimal web app example for Heroku using SparkWeb
 *
 * @author Sergio Ruiz
 */
public class SparkApp {

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h1>Here you can calculate numbers square</h2>"
                + "<form action=\"/results\">"
                + "  Please instert your number:<br>"
                + "  <input type=\"text\" name=\"Number\" value=\"\"> <br><br>"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Calculate\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) throws IOException {
        String value = req.queryParams("Number");
        URL url = new URL("https://k1ddhi7vf8.execute-api.us-east-1.amazonaws.com/Beta?value=" + value);
        String inputline = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String result=reader.readLine();
        String pageContent = "<!DOCTYPE html>" + "<html>" + "<body >" + "<h2>"+result+"</h2>" + "<script>" + "</script>"
                + "</body>" + "</html>";
        return pageContent;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

}
