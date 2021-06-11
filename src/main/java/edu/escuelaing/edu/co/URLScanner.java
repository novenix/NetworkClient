package edu.escuelaing.edu.co;

import java.net.MalformedURLException;
import java.net.URL;
//ejercicio realizado en clase
/**
 * Hello world!
 *
 */
public class URLScanner
{
    public static void main( String[] args ) throws MalformedURLException {
        URL personalSite = new URL("http://ldbn.escuelaing.edu.co:80/publicaciones.pdf=val=45&r=78#publicaciones");

        System.out.println( "Protocolo: "+ personalSite.getProtocol() );
        System.out.println( "authority: "+ personalSite.getAuthority() );
        System.out.println( "host: "+ personalSite.getHost() );
        System.out.println( "port: "+ personalSite.getPort() );
        System.out.println( "path: "+ personalSite.getPath() );
        System.out.println( "quey: "+ personalSite.getQuery() );
        System.out.println( "file: "+ personalSite.getFile() );
        System.out.println( "ref: "+ personalSite.getRef() );


    }
}
